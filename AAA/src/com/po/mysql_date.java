package com.po;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;;
public class mysql_date {

	 public static Connection conn=null;
	    
	    public void get_Connection()
	    {
	        try
	        {
	            Class.forName("com.mysql.jdbc.Driver");
	            String url="jdbc:mysql://localhost:3306/student?useUnicode=true&characterEncoding=utf-8";
	            conn=DriverManager.getConnection(url, "root", "");
	        }
	        catch(ClassNotFoundException e)
	        {
	            e.printStackTrace();
	        }
	        catch(SQLException e)
	        {
	            e.printStackTrace();
	        }
	    }

	    public void close()
	    {
	        if(conn != null)
	        {
	            try
	            {
	                conn.close();
	            }
	            catch(SQLException e)
	            {
	                System.out.println("Êý¾Ý¿â¹Ø±ÕÊ§°Ü!\n");
	                e.printStackTrace();
	            }
	            conn=null;
	        }

	    }
	    
	    
		public static void main(String args[])
		{
			mysql_date md = new mysql_date();
			md.get_Connection();
		
			try {	
				PreparedStatement pre =  conn.prepareStatement("insert into date values (?,?)");
				pre.setObject(1, new java.sql.Date(2000-1900,9-1,9));
				pre.setObject(2, new java.sql.Date(2000-1900,9-1,9));

				pre.executeUpdate();
			/*	while(res.next())
				{
					System.out.print(res.getString(1)+"\t"+res.getString(2));
				}*/
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	    
}
















