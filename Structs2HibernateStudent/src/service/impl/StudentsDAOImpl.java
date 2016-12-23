package service.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import db.MyHibernateSessionFactory;

import service.StudentsDAO;

import entity.Students;

//ѧ����ҵ���߼�ʵ����
public class StudentsDAOImpl implements StudentsDAO{

	@Override
	public List<Students> queryAllStudents() {
		Transaction tx=null;
		String hql="";
		try
		{
			Session session=MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
		    tx=session.beginTransaction();//��������
			
			hql="from Students";
		    
		    Query query=session.createQuery(hql);
	
		    List list=query.list();
		    tx.commit();//�ύ����
		  
		    return list;
		}
		
		catch(Exception ex)
		{
			ex.printStackTrace();					
		}
		
		//�κ�ִ��try����catch�е�return���֮ǰ��������ִ��finally���
		finally
		{
			if(tx!=null)
			{
				tx=null;
			}
		}
		return null;
	}

	@Override
	public Students queryStudentsByid(String sid) {
		
		Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		Students stu = session.get(Students.class, sid);
        tx.commit();   
    	if(tx!=null)
		{
			tx=null;
		}
        return stu;
	}

	@Override
	public boolean addStudents(Students s){
		s.setSid(getNewSid());
		Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
		Transaction tx=session.beginTransaction();
		session.save(s);
        tx.commit();
        
    	if(tx!=null)
		{
			tx=null;
		}
        
		return true;
	}

	@Override
	public boolean updateStudents(Students stu) {
		
		//String hql = "update Students set sname=?,gender=?,birthday=?,address=? where sid=?";
		Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
		Transaction tx=session.beginTransaction();
		session.update(stu);
		/*Query query = session.createQuery(hql);
		
		query.setParameter(0, stu.getSname());
		query.setParameter(1, stu.getGender());
		query.setParameter(2, stu.getBirthday());
		query.setParameter(3, stu.getAddress());
		query.setParameter(4, stu.getSid());
		*/
        tx.commit();   
        
    	if(tx!=null)
		{
			tx=null;
		}
		return true;
	}

	@Override
	public boolean deleteStudents(String sid) {
		Transaction tx=null;
		
		Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
		tx=session.beginTransaction();
		
		Students stu = session.get(Students.class, sid);
		session.delete(stu);
        tx.commit();
        
    	if(tx!=null)
		{
			tx=null;
		}
        
		return true;
	}
	
	
	private String getNewSid()
	{		
		Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
		Transaction tx=session.beginTransaction();
		
        String hql = "select max(sid) from Students";
        Query query = session.createQuery(hql);
        /*��ȷ�����ص�ʵ��ֻ��һ������nullʱ ��uniqueResult()����*/
        String sid = (String) query.uniqueResult();       
        tx.commit();
        
        if(sid == null || sid.equals(""))
        {
           sid = "S0000001";
        }
        else
        {
        	String s = sid.substring(1);
        	int i = Integer.parseInt(s)+1;      
            String s1 = String.valueOf(i);

            int n=7-s1.length();
            for(int j=0; j<n; j++)
            	s1="0"+s1;
            
            sid="S"+s1;
        }
        
    	if(tx!=null)
		{
			tx=null;
		}
        
		return sid;
	}
	
	public static void main(String[] args) {
		StudentsDAOImpl dao = new StudentsDAOImpl();
		System.out.println(dao.getNewSid());
	}
	
}
