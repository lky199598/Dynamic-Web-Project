package Listener;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.connector.Request;

import JavaBean.User;

/**
 * Application Lifecycle Listener implementation class MyServletRequestListener
 *
 */
@WebListener
public class MyServletRequestListener implements ServletRequestListener {

	private ArrayList<User> UserList;
    /**
     * Default constructor. 
     */
    public MyServletRequestListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent arg0)  { 
         // TODO Auto-generated method stub
      UserList = (ArrayList<User>) arg0.getServletContext().getAttribute("UserList");
      
      if(UserList==null)
    	  UserList = new ArrayList<User>();
      
      HttpServletRequest req = (HttpServletRequest)arg0.getServletRequest();
      
      String sessionID = req.getSession().getId();
      
      boolean flag=false;
      
     if(UserList != null)
    	 for(User user : UserList)
    		 if(user.getSessionID().equals(sessionID))
    		 {
    			 flag=true;
    			 break;
    		 }
    			
     if(!flag)
     {
    	 User user = new User();
    	 user.setSessionID(sessionID);
    	 user.setFirstTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    	 user.setIp(req.getRemoteAddr());
    	 UserList.add(user);
     }
     
     arg0.getServletContext().setAttribute("UserList", UserList);
     
    }	
}
