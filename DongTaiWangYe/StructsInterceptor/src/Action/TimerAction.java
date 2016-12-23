package Action;

import com.opensymphony.xwork2.ActionSupport;

import freemarker.template.utility.Execute;

public class TimerAction extends ActionSupport{

	@Override
	public String execute() throws Exception {
		return null;
	}

	public String timer()  {

		for(int i=0; i<1000; i++)
			System.out.println("TimerAction");
		return "timer";
	}
	
	public String login()  {
		System.out.println("login()");
		return "login";
	}

	public String loginSuccess()  {
		return "loginSuccess";
	}
}
