package Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.jdbc.Work;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.Test;

import JavaBean.Student;

public class SessionTest {

	@Test
	public void OpenSession() {
		// �������ö���
		Configuration config = new Configuration().configure();

		// ��������ע�����
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
				.applySettings(config.getProperties()).buildServiceRegistry();

		// �����Ự��������
		SessionFactory sessionFactory = config
				.buildSessionFactory(serviceRegistry);

		// �Ự����
		Session session1 = sessionFactory.openSession();
		Session session2 = sessionFactory.openSession();
		System.out.println(session1 == session2);

		/*
		 * if(session != null)
		 * System.out.println("openSession(): Session�����ɹ���\n"); else
		 * System.out.println("openSession(): Session����ʧ�ܣ�\n");
		 */
	}

	@Test
	public void GetCurrentSession() {
		// �������ö���
		Configuration config = new Configuration().configure();

		// ��������ע�����
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
				.applySettings(config.getProperties()).buildServiceRegistry();

		// �����Ự��������
		SessionFactory sessionFactory = config
				.buildSessionFactory(serviceRegistry);

		// �Ự����
		Session session1 = sessionFactory.getCurrentSession();
		Session session2 = sessionFactory.getCurrentSession();
		System.out.println(session1 == session2);

		/*
		 * if(session != null)
		 * System.out.println("getCurrentSession(): Session�����ɹ���\n"); else
		 * System.out.println("getCurrentSession(): Session����ʧ�ܣ�\n");
		 */

	}

	// openSessionÿ�δ����µ�session����getCurrentSessionʹ�����е�session����
	@Test
	public void Save_Student_OpenSession() {
		// �������ö���
		Configuration config = new Configuration().configure();

		// ��������ע�����
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
				.applySettings(config.getProperties()).buildServiceRegistry();

		// �����Ự��������
		SessionFactory sessionFactory = config
				.buildSessionFactory(serviceRegistry);

		// �Ự����1
		Session session1 = sessionFactory.getCurrentSession();

		// ��������
		Transaction transaction = session1.beginTransaction();

		// ����һ��ѧ������
		//Student stu = new Student("88", new Date());
		session1.doWork(new Work() {

			@Override
			public void execute(Connection arg0) throws SQLException {
				// TODO Auto-generated method stub
				System.out.println("Connection hashCode: " + arg0.hashCode());
			}
		});

		//session1.save(stu);
		// session1.close();
		// �ύ����
		transaction.commit();

		// �Ự����2
		Session session2 = sessionFactory.openSession();

		// ��������
		transaction = session2.beginTransaction();

		// ����һ��ѧ������
		//stu = new Student("666", new Date());
		session2.doWork(new Work() {

			@Override
			public void execute(Connection arg0) throws SQLException {
				// TODO Auto-generated method stub
				System.out.println("Connection hashCode: " + arg0.hashCode());
			}
		});

		session2.save(stu);
		transaction.commit();
	}

	// openSessionÿ�δ����µ�session����getCurrentSessionʹ�����е�session����
	@Test
	public void Save_Student_GetCurrentSession() {
		// �������ö���
		Configuration config = new Configuration().configure();

		// ��������ע�����
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
				.applySettings(config.getProperties()).buildServiceRegistry();

		// �����Ự��������
		SessionFactory sessionFactory = config
				.buildSessionFactory(serviceRegistry);

		// �Ự����1
		Session session1 = sessionFactory.getCurrentSession();

		// ��������
		Transaction transaction = session1.beginTransaction();

		// ����һ��ѧ������
	//	Student stu = new Student("8", new Date());
		session1.doWork(new Work() {

			@Override
			public void execute(Connection arg0) throws SQLException {
				// TODO Auto-generated method stub
				System.out.println("Connection hashCode: " + arg0.hashCode());
			}
		});

		session1.save(stu);
		// session1.close();
		// �ύ����
		transaction.commit();

		// �Ự����2
		Session session2 = sessionFactory.getCurrentSession();
		// ��������
		transaction = session2.beginTransaction();
		// ����һ��ѧ������
		//stu = new Student("6", new Date());
		session2.doWork(new Work() {

			@Override
			public void execute(Connection arg0) throws SQLException {
				// TODO Auto-generated method stub
				System.out.println("Connection hashCode: " + arg0.hashCode());
			}
		});

		//session2.save(stu);
		transaction.commit();
	}

}
