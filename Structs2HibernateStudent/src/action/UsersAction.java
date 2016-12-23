package action;

import service.UsersDAO;
import service.impl.UsersDAOImpl;

import com.opensymphony.xwork2.ModelDriven;

import entity.Users;

public class UsersAction extends SuperAction implements ModelDriven<Users> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Users user = new Users();

	// �û���¼����
	public String login() {
		UsersDAO usersDAO = new UsersDAOImpl();

		System.out.println("getUsername: " + user.getUsername().length());
    
		//����ύ���û���Ϊ��,���ṩ�ͻ��˴�����Ϣ,ǰ̨ҳ���л�ȡ������.
		if (user.getUsername().trim().equals("")) {
			this.addFieldError("userNameError", "�û�������Ϊ��!");
			System.out.println("�û�������Ϊ��");
			return "INPUT";
		}

		// ��Ϊtrue,���û�����������ȷ,���ص�¼�ɹ�����.
		else if (usersDAO.usersLogin(user)) {
			session.setAttribute("userName", user.getUsername());
			return "login_success";
		}

		// ����ύ�����볤������6,���ṩ�ͻ��˴�����Ϣ,ǰ̨ҳ���л�ȡ������.
		else if (user.getPassword().length() < 3) {
			this.addFieldError("passwordError", "���볤�Ȳ�������3!");
			return "INPUT";
		}

		// �����д���û��������벻ƥ��,�򷵻ص�¼ҳ��.
		else {
			this.addFieldError("notAllowed", "��������ȷ���û���������!");
			return "login_failure";
		}
	}

	public String logout() {

		if (session.getAttribute("userName") != null)
			session.removeAttribute("userName");

		return "logout_success";
	}
    	
	/*
	 * �÷�������һ�����ڽ����û��������ݵĶ���ģ�ͣ������ģ�Ͷ����е����Կ���ֱ��ͨ��(������)userName�����ʣ�
	 * ������Ҫʹ�ã�������.��������user.userName���ָ�ʽ�������ˣ�
	 * ��actionҲ����Ҫ�Զ����ṩgetter��setter�����ˣ����Ǳ���Ҫ��action�н���new����
	 */
	public Users getModel() {
		return this.user;
	}
}
