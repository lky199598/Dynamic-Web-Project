package action;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import service.StudentsDAO;
import service.UsersDAO;
import service.impl.StudentsDAOImpl;
import service.impl.UsersDAOImpl;

import com.opensymphony.xwork2.ModelDriven;

import db.MyHibernateSessionFactory;

import entity.Students;
import entity.Users;

public class StudentsAction extends SuperAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private StudentsDAO studentsDAO = new StudentsDAOImpl();
	
	public String queryAllStudents(){
		List<Students> list = studentsDAO.queryAllStudents();
		
		if(list != null && list.size() > 0)
			session.setAttribute("studentsList", list);
		return "querySuccess";
	}
	
	
	public String deleteStudents() {	
	   String sid = request.getParameter("sid");
	   studentsDAO.deleteStudents(sid);
	   return "deleteSuccess";
	}
		

}



