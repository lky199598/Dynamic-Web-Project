package Spring.demo2;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*
 * ת�˰���Ĳ�����
 */

//ʹ��@RunWith(SpringJUnit4ClassRunner.class),�ò���������Spring���Ի���
//@ContextConfiguration ����ָ�����ص�Spring�����ļ���λ��,�����Ĭ�������ļ�

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class SpringDemo2 {
    
	/**
	 * 一定要注入代理类:因为代理类进行增强的操作
	 */
	//@Resource:ʹ���ֶ�����ƥ��bean,���ҵ�bean��ע��,������Ͳ�ƥ�����ʱ���쳣,ע��ʧ�ܡ�
	
	
	@Resource(name="accountServiceProxy")	
	private AccountService accountService;
	
	@Test
    public void demo2()
    {
    	accountService.transfer("aaa", "bbb", 200d);
    }
}
