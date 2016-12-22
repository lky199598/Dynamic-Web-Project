package Spring.demo4;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*
 * Spring的声明式事务管理：基于AspectJ的XML方式的配置
 */

//ʹ��@RunWith(SpringJUnit4ClassRunner.class),�ò���������Spring���Ի���
//@ContextConfiguration ����ָ�����ص�Spring�����ļ���λ��,�����Ĭ�������ļ�

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext4.xml")
public class SpringDemo4 {
	
	//@Resource:ʹ���ֶ�����ƥ��bean,���ҵ�bean��ע��,������Ͳ�ƥ�����ʱ���쳣,ע��ʧ�ܡ�
	
	
	@Resource(name="accountService")	
	private AccountService accountService;
	
	@Test
    public void demo4()
    {
    	accountService.transfer("aaa", "bbb", 200d);
    }
}
