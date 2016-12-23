package Interceptor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;
import java.util.Properties;

import entity.Page;

import org.apache.ibatis.executor.parameter.ParameterHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;

import entity.Page;

/* 
 * ��ҳ������
 */
 

//��ҳ������������������£�mybatis�ṩ��ص�ע��
@Intercepts({@Signature(type=StatementHandler.class,method="prepare", args={Connection.class})})

public class PageInterceptor implements Interceptor{
    private String pageInformation;
	
	@Override
	public Object intercept(Invocation arg0) throws Throwable {

		StatementHandler statementHandler = (StatementHandler)arg0.getTarget();
		MetaObject metaObject = MetaObject.forObject(statementHandler, SystemMetaObject.DEFAULT_OBJECT_FACTORY, SystemMetaObject.DEFAULT_OBJECT_WRAPPER_FACTORY);
		
		MappedStatement mappedStatement = (MappedStatement)metaObject.getValue("delegate.mappedStatement");

	
		//�����ļ���SQL����ID
	    String id = mappedStatement.getId();
	   
	    //.ƥ�����\n��֮����κε����ַ�����Ҫƥ�������\n�����ڵ������ַ�����ʹ�����硰[\s\S]��֮���ģʽ��
	    //+һ�λ���ƥ��ǰ����ַ����ӱ���ʽ�����磬��zo+���롰zo���͡�zoo��ƥ�䣬���롰z����ƥ�䡣+ ��Ч�� {1,}
	    //$ƥ�������ַ�����β��λ�á���������� RegExp ����� Multiline ���ԣ�$�����롰\n����\r��֮ǰ��λ��ƥ�䡣

	    if(id.matches(".+ByPage$"))
		{
			BoundSql boundSql = statementHandler.getBoundSql();
			
			// ԭʼ��SQL���
			String sql = boundSql.getSql();
					
			//��ѯ��������SQl���s
			String countSql =  "select count(*) from (" + sql + ")a";
		    Connection connection  = (Connection)arg0.getArgs()[0];
			
		    PreparedStatement preparedStatement =  connection.prepareStatement(countSql);
			
		    ParameterHandler parameterHandler = (ParameterHandler)metaObject.getValue("delegate.parameterHandler");
		    parameterHandler.setParameters(preparedStatement);
		    
			ResultSet res = preparedStatement.executeQuery();
		    		
			Map<?, ?> parameter = (Map<?, ?>)boundSql.getParameterObject();

			Page page = (Page)parameter.get("page");
			if(res.next())
			{
				page.setTotalMessageNumber(res.getInt(1));
			}
			
			//��������ҳ��ѯ��SQL���
			String pageSql = sql+" limit "+page.getIndexMessageNumber()+","+page.getPagenumber();
		    //�޸�Ϊ�µ�Sql
			System.out.println("pageSql: "+pageSql);
			
			metaObject.setValue("delegate.boundSql.sql", pageSql);
		}
		return arg0.proceed();
	}

	@Override
	public Object plugin(Object arg0) {
		// ����һ������ʵ��
		return Plugin.wrap(arg0, this);
	}

	@Override
	public void setProperties(Properties arg0) {
		// TODO Auto-generated method stub
		pageInformation = arg0.getProperty("pageInformation");
	}

}