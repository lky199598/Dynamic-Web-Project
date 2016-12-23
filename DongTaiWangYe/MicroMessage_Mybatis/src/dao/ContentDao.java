package dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;

import JavaBean.Command;
import JavaBean.Content;
import db.DBAccess;

public class ContentDao {

	public boolean insertBatchContent(ArrayList<Content> contentList)
	{	
		DBAccess dbAccess = new DBAccess();
	    SqlSession sqlSession = null;
		try {
			sqlSession = dbAccess.getSqlSession();
			IContent icontent = sqlSession.getMapper(IContent.class);
			icontent.insertBatchContent(contentList);
			sqlSession.commit();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		finally {
			if (sqlSession != null)
				sqlSession.close();
		}
		return false;
	}
	
	
	
	public static void main(String[] args) {
		ContentDao c = new ContentDao();

	}
}
