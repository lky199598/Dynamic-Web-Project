package Action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.omg.PortableInterceptor.SUCCESSFUL;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.net.httpserver.Authenticator.Success;

public class LoginAction extends ActionSupport implements SessionAware{

	private String username;
	private String password;
	private Map<String, Object> session;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
	public String login()
	{
		return "login";
	}
	
	
	//处理登录请求
	public String loginResult()
	{
		System.out.println("username: "+username);
		System.out.println("password: "+password);
		
		if("admin".equals(username) && "123".equals(password))
		{
			session.put("loginInfo", username);
			return SUCCESS;
		}
		else
		{
		   session.put("loginError", "用户名或密码不正确");
		   return ERROR;
		}
	}
}
