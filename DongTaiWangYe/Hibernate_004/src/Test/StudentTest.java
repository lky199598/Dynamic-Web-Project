package Test;
import org.junit.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.util.Date;

import org.hibernate.Hibernate;
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
		
		//��������
		transaction = session.beginTransaction();
	}
	
	@After
	public void destory()
	{	
		session.flush();
		transaction.commit();//�ύ����
		
		session.close();//�رջỰ
		
		sessionFactory.close();//�رջỰ����
	}
	
/*	@Test
	public void Test_Save_Student()
	{
		Student stu = new Student();
		stu.setName("�ֻ���");
		stu.setDate(new Date());
		session.save(stu);
	}*/
	
	
	@Test
	public void Write_Blob() throws Exception
	{
		Student stu = new Student();
		//stu.setId(6);
		stu.setDate(new Date());
		stu.setName("˿��");
		
		
		File f = new File("D:/�ҵ�ͼƬ/����.jpg");
		
  	     	InputStream is = new FileInputStream(f);
		  
			Blob image = Hibernate.getLobCreator(session).createBlob(is, is.available());
			//is.available ���������õ��ֽڳ���
		
			stu.setPicture(image);
		
			session.save(stu);
			
	}
	
	@Test
	public void Read_Blob() throws Exception
	{
		Student stu = (Student) session.get(Student.class, 2);
			
		//���Blob����
	    Blob image = stu.getPicture();
	    //�����Ƭ��������
	    InputStream is = image.getBinaryStream();
	    byte[] b = new byte[is.available()];
	    is.read(b);
	    
	    File f = new File("D:/dest.jpg");
		OutputStream os = new FileOutputStream(f);
		os.write(b);
	
		is.close();
		os.close();
	}
}





