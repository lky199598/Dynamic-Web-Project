package Test;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import JavaBean.Commodity;
import JavaBean.Seller;
import Util.HibernateSessionFactory;

public class CommodityTest {

	private Session session;
	private Transaction ts;

	@Before
	public void setUp() throws Exception {
		session = HibernateSessionFactory.getCurrentSession();
		ts = session.beginTransaction();
	}

	@After
	public void tearDown() throws Exception {
		ts.commit();// �ύ����
		session.close();// �رջỰ
		HibernateSessionFactory.getSessionFactory().close(); // �رջỰ����
	}

	@Test
	public void save() {

		/*Seller s = new Seller();
		s.setAddress("�ƺ���");
		s.setBusiness("�ܴ�Χ");
		s.setName("Ь��");
		s.setStar(5);
		s.setTel("15896489357");
		s.setWebsite("dkjfjfsk.sdi");

		Seller s1 = new Seller();
		s1.setAddress("�Ƶ���");
		s1.setBusiness("��������");
		s1.setName("��װ");
		s1.setStar(5);
		s1.setTel("15896489357");
		s1.setWebsite("dkjfjfsk.sdi");
		session.save(s);
		session.save(s1);*/
		
		Commodity c = new Commodity();
		c.setCategory("��װ");
		c.setDescription("�ܺõķ�װ");
		c.setName("����");
		c.setPrice((double) 60);
		c.setUnit("��");
		
		Seller s = (Seller) session.get(Seller.class, new Long(3));
		c.setSeller(s);
		session.save(c);
		
		
		/*Commodity c = new Commodity();
		c.setCategory("Ь��");
		c.setDescription("�ܺõ�Ь��");
		c.setName("��Ь");
		c.setPrice((double) 60);
		c.setUnit("˫");
		
		Seller seller = new Seller();
		seller.setAddress("�Ǽ���");
		seller.setBusiness("�ܴ�Χ");
		seller.setName("С�");
		seller.setStar(5);
		seller.setTel("15896489357");
		seller.setWebsite("dkjfjfsk.sdi");
		
		c.setSeller(seller);
		session.save(c);*/
	}

	@Test
	public void Query() {
		Query q = session.createQuery("from Commodity");	
		List<Commodity> list = q.list();	
		for(Commodity c:list)
			System.out.println(c+"\n"+c.getSeller()+"\n");
			
	}
}
