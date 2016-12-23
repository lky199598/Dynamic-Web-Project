package db;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class MyHibernateSessionFactory {
	//�Ự��������
	private static SessionFactory sessionFactory;
	
	//���췽��˽�л�����֤����ģʽ
	private MyHibernateSessionFactory()
	{
		
	}
	
	//���еľ�̬��������ûỰ��������
	public static SessionFactory getSessionFactory()
	{
		if(sessionFactory == null)
		{
			Configuration config = new Configuration().configure();
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
			sessionFactory = config.buildSessionFactory(serviceRegistry);
		}
	     return sessionFactory;
	}
}