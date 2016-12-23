package test;


import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.imooc.model.Customer;
import com.imooc.model.Order;
import com.imooc.util.HibernateSessionFactory;

public class OrderTest {
	private Session session = null;
	
	@Test
	public void testWhere1(){
		String hql = " from Order o where o.orderItems is not empty ";
		Query query = session.createQuery(hql);
		List<Order> orders = query.list();
		
		for(Order order : orders){
			System.out.println(order.getCustomer().getName());
			System.out.println(order.getAmount());
			System.out.println(order.getTradeDate());
		}
	}

	@Before
	public void setUp() throws Exception {
		session = HibernateSessionFactory.getCurrentSession();
	}

	@After
	public void tearDown() throws Exception {
		session.close();
	}

	@Test
	public void save() {
		Order order = new Order();
		
		Order o = new Order();
		o.setAmount((double) 80);
		o.setStatus("交易中");
		o.setTradeDate(new Date());
		
		Customer customer = new Customer();
		customer.setAddress("梧州市");
		customer.setAge(18);
		customer.setBirthday(new Date(1999, 1,1));
		customer.setDescription("这个人很好哒");
		customer.setEmail("892173291@qq.com");
		customer.setName("肥哆哆");
		customer.setSex("男");
		customer.setTel("8948549509");
		o.setCustomer(customer);
		session.save(customer);
		//session.save(o);
	}


}
