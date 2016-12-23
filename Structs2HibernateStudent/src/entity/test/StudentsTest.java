package entity.test;



import java.nio.channels.SeekableByteChannel;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.spi.MetadataImplementor;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Test;

import entity.Students;

public class StudentsTest {
	
	/*
	 * ���ɱ�ṹ�����SQL���
	 */
	@Test
  public void testSchemaExport()
  {	  
		Configuration configuration = new Configuration().configure();
		ServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
	
		SessionFactory sessionfactory = configuration.buildSessionFactory(registry);
		Session session = sessionfactory.getCurrentSession();
		
		MetadataImplementor metadata = (MetadataImplementor) new MetadataSources(registry).buildMetadata();
		SchemaExport export = new SchemaExport(registry,metadata);
		export.create(true,true);
  }
	
	//��Ӳ�������
	@Test
	  public void testSaveStudents()
	  {	  
			Configuration configuration = new Configuration().configure();
			ServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
			SessionFactory sessionfactory = configuration.buildSessionFactory(registry);
			Session session = sessionfactory.getCurrentSession();
			
		     //�����������
			Transaction transaction = session.beginTransaction();
			 Students s1 = new Students("s0000000","aaa","��",new Date(),"�䵱ɽ");
			 Students s2 = new Students("s0000001","������","��",new Date(),"�䵱ɽ");
			 Students s3 = new Students("s0000002","bbb","��",new Date(),"�䵱ɽ");
			 
			 session.save(s1); session.save(s2); session.save(s3);
			 
			 transaction.commit();
			 sessionfactory.close();
	  }
}
