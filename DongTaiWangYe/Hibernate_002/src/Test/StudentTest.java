package Test;
import org.junit.*;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import JavaBean.Student;

public class StudentTest {

	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;

	@Before//��������Ҫ��ע��
	public void init()
	{
		//�������ö���
		Configuration config = new Configuration().configure();
		
		//��������ע�����
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		
		//�����Ự��������
		 sessionFactory= config.buildSessionFactory(serviceRegistry);
		
		//�Ự����
		session = sessionFactory.openSession();
		
		//�������񣬲���������Ͳ��ܽ����󱣴浽���ݿ��С���ΪHibernateĬ�ϲ��Զ��ύ����
		transaction = session.beginTransaction();
	}
	
	@After
	public void destory()
	{
		transaction.commit();//�ύ����
		
		session.close();//�رջỰ
		
		sessionFactory.close();//�رջỰ����
	}
	
	@Test
	public void Test_Save_Student()
	{
		Student stu = new Student("1", new Date());
		session.save(stu);//�������������ݿ�
	}
	
}





