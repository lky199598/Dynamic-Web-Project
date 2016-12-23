package CRUD_Test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import JavaBean.Address;
import JavaBean.Student;

public class CrudTest {
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
		
		//��������
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
	public void Test_Save()
	{
		Student stu = new Student();
		stu.setId(6);
		stu.setName("�ֻ���");
		stu.setDate(new Date());
		Address addr = new Address("710121", "13877468968", "�Ϻ���");
		
		stu.setAddr(addr);
		session.save(stu);
	}
	
	@Test
	public void Test_Get()
	{
		Student stu = (Student)session.get(Student.class, 2);
		//System.out.println(stu);
		System.out.println(stu.getClass().getName());
	}
	
	@Test
	public void Test_Load()
	{
		Student stu = (Student)session.load(Student.class, 2);
		//System.out.println(stu);
		System.out.println(stu.getClass().getName());
	}
	
	@Test
	public void Test_Update()
	{
		Student stu = (Student)session.get(Student.class, 2);
	    Address addr = new Address("123456", "1387762678", "������");
		stu.setAddr(addr);
		
		session.update(stu);
		System.out.println(stu);
		
	}	
	
	@Test
	public void Test_Delete()
	{
		Student stu = (Student)session.get(Student.class, 2);
		session.delete(stu);
	}
	
}
