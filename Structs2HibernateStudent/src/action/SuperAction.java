package action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

//����Action�����ĸ���
public class SuperAction extends ActionSupport implements ServletRequestAware,ServletResponseAware,ServletContextAware{


	/**
	 * 
	 */

	/*
	 *  ���Action����
	 *  ���action����
	 *  �̳�ActionSupport�������˺ܶ��������������Ժ�ʹ�ã�
	 *  Ϊ�˻�ó��õ����ö���������IOC��ʽע�����ԣ���Ҫʵ������3���ӿڣ�
	 *  ServletRequestAware
	 *  ServletResponseAware
	 *  SrevletContextAware
	 */
	/*���������Ӧ����ȫ�ֶ���,�Ự����*/
	private static final long serialVersionUID = 1L;
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected ServletContext application;
	protected HttpSession session;
	
	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response=response;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request=request;
		this.session=this.request.getSession();
	}

	@Override
	public void setServletContext(ServletContext application) {
		this.application=application;
	}
}
