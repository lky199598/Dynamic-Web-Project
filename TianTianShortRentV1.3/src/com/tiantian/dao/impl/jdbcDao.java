package com.tiantian.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class jdbcDao
{
    private Connection conn=null;
    private String database_name=null;

    public jdbcDao(String database_name)
    {
        this.conn=conn;
        this.database_name=database_name;
    }

    public Connection get_Connection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/" + database_name + "?useUnicode=true&characterEncoding=utf-8";
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
        return conn;
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
                System.out.println("数据库关闭失败!\n");
                e.printStackTrace();
            }
            conn=null;
        }

    }

    public ResultSet Admin_insert(String Admin_id, String Admin_name, String Admin_password, String Admin_telephone, String Admin_idcard, String Admin_mail)
    {
        conn=get_Connection();
        try
        {
            PreparedStatement pre=conn.prepareStatement("insert into Admin(Admin_id, Admin_name, Admin_password, Admin_telephone,Admin_idcard,Admin_mail)values(?,?,?,?,?,?)");
            pre.setString(1, Admin_id);
            pre.setString(2, Admin_name);
            pre.setString(3, Admin_password);
            pre.setString(4, Admin_telephone);
            pre.setString(5, Admin_idcard);
            pre.setString(6, Admin_mail);

            pre.executeUpdate();
            pre.close();

            pre=conn.prepareStatement("select *from Admin where Admin_id=?");
            pre.setString(1, Admin_id);
            ResultSet res=pre.executeQuery();
            return res;
        }

        catch(SQLException e)
        {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        return null;
    }

    public ResultSet User_insert(String User_id, String User_password)
    {
        conn=get_Connection();
        try
        {

            PreparedStatement pre=conn.prepareStatement("insert into User(User_id, User_password)values(?,?)");
            pre.setString(1, User_id);
            pre.setString(2, User_password);

            pre.executeUpdate();
            pre.close();

            pre=conn.prepareStatement("select *from User where User_id=?");
            pre.setString(1, User_id);
            ResultSet res=pre.executeQuery();
            return res;
        }

        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public ResultSet User_insert(String User_id, String User_name, String User_password, String User_telephone, String User_idcard, String User_sex, Date User_birthday)
    {
        conn=get_Connection();
        try
        {

            PreparedStatement pre=conn.prepareStatement("insert into User(User_id, User_name, User_password, User_telephone,User_idcard,User_sex,User_birthday)values(?,?,?,?,?,?,?)");
            pre.setString(1, User_id);
            pre.setString(2, User_name);
            pre.setString(3, User_password);
            pre.setString(4, User_telephone);
            pre.setString(5, User_idcard);
            pre.setString(6, User_sex);
            pre.setDate(7, new java.sql.Date(User_birthday.getTime()));

            pre.executeUpdate();
            pre.close();

            pre=conn.prepareStatement("select *from User where User_id=?");
            pre.setString(1, User_id);
            ResultSet res=pre.executeQuery();
            return res;
        }

        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public boolean House_insert(String Address, int Rent_station, double dayprice, double housearea, String Surrounding, String Others, String Src, String Name, String Master)
    {
        conn=get_Connection();
        try
        {
            PreparedStatement pre=conn.prepareStatement("insert into House(Address, Rent_station, Price, Area, Surrounding, Others, Src, Name, Master)values(?,?,?,?,?,?,?,?,?)");
            pre.setString(1, Address);
            pre.setInt(2, Rent_station);
            pre.setDouble(3, dayprice);
            pre.setDouble(4, housearea);
            pre.setString(5, Surrounding);
            pre.setString(6, Others);
            pre.setString(7, Src);
            pre.setString(8, Name);
            pre.setString(9, Master);
            pre.executeUpdate();
            pre.close();

            return true;

        }

        catch(SQLException e)
        {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        return false;
    }

    public ResultSet Rent_insert(String User_id, int House_id, int Rent_rented_station, Date End_time)
    {
        conn=get_Connection();
        try
        {

            PreparedStatement pre=conn.prepareStatement("insert into Rent_rented(User_id, House_id, Rent_rented_station, End_time)values(?,?,?,?)");
            pre.setString(1, User_id);
            pre.setInt(2, House_id);
            pre.setInt(3, Rent_rented_station);
            pre.setDate(4, new java.sql.Date(End_time.getTime()));

            pre.executeUpdate();
            pre.close();

            pre=conn.prepareStatement("select *from Rent_rented where User_id=? and House_id=?");
            pre.setString(1, User_id);
            pre.setInt(2, House_id);

            ResultSet res=pre.executeQuery();
            return res;
        }

        catch(SQLException e)
        {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        return null;
    }

    public ResultSet List_insert(String User_id, int House_id, int Rent_rented_station, Date End_time)
    {
        conn=get_Connection();
        try
        {

            PreparedStatement pre=conn.prepareStatement("insert into List(User_id, House_id, Rent_rented_station, End_time)values(?,?,?,?)");
            pre.setString(1, User_id);
            pre.setInt(2, House_id);
            pre.setInt(3, Rent_rented_station);
            pre.setDate(4, new java.sql.Date(End_time.getTime()));

            pre.executeUpdate();
            pre.close();

            pre=conn.prepareStatement("select *from List where User_id=? and House_id=?");
            pre.setString(1, User_id);
            pre.setInt(2, House_id);

            ResultSet res=pre.executeQuery();
            return res;
        }

        catch(SQLException e)
        {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        return null;
    }

    public boolean delete_from_table(String table_name, String Admin_or_User_ID, int House_id)
    {
        conn=get_Connection();
        PreparedStatement pre=null;

        try
        {
            if(table_name.equalsIgnoreCase("Admin"))
            {
                pre=conn.prepareStatement("delete from Admin where Admin_id=?");
                pre.setString(1, Admin_or_User_ID);
            }
            else
                if(table_name.equalsIgnoreCase("User"))
                {
                    pre=conn.prepareStatement("delete from User where User_id=?");
                    pre.setString(1, Admin_or_User_ID);
                }

                else
                    if(table_name.equalsIgnoreCase("House"))
                    {
                        pre=conn.prepareStatement("delete from House where House_id=?");
                        pre.setInt(1, House_id);
                    }
                    else
                        if(table_name.equalsIgnoreCase("Rent_rented"))
                        {
                            pre=conn.prepareStatement("delete from Rent_rented where User_id=? and House_id=?");
                            pre.setString(1, Admin_or_User_ID);
                            pre.setInt(2, House_id);
                        }

                        else
                            if(table_name.equalsIgnoreCase("List"))
                            {
                                pre=conn.prepareStatement("delete from List where User_id=? and House_id=?");
                                pre.setString(1, Admin_or_User_ID);
                                pre.setInt(2, House_id);
                            }

            pre.executeUpdate();
            conn.close();
            pre.close();
            return true;
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return false;
    }

    public ResultSet update_Admin_information(String Admin_id, String Admin_name, String Admin_password, String Admin_telephone, String Admin_idcard, String Admin_mail)
    {
        conn=get_Connection();
        try
        {
            PreparedStatement pre=conn.prepareStatement("update Admin set Admin_name=?, Admin_password=?, Admin_telephone=?,Admin_idcard=?,Admin_mail=? where Admin_id=?");

            pre.setString(1, Admin_name);
            pre.setString(2, Admin_password);
            pre.setString(3, Admin_telephone);
            pre.setString(4, Admin_idcard);
            pre.setString(5, Admin_mail);
            pre.setString(6, Admin_id);

            pre.executeUpdate();
            pre.close();

            pre=conn.prepareStatement("select *from Admin where Admin_id=?");
            pre.setString(1, Admin_id);
            ResultSet res=pre.executeQuery();

            return res;
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public ResultSet update_User_information(String User_id, String User_name, String User_password, String User_telephone, String User_idcard, String User_sex, Date User_birthday)
    {
        conn=get_Connection();
        try
        {
            PreparedStatement pre=conn.prepareStatement("update User set User_name=?, User_password=?, User_telephone=?,User_idcard=?,User_sex=?,User_birthday=? where User_id=?");

            pre.setString(1, User_name);
            pre.setString(2, User_password);
            pre.setString(3, User_telephone);
            pre.setString(4, User_idcard);
            pre.setString(5, User_sex);
            pre.setDate(6, new java.sql.Date(User_birthday.getTime()));
            pre.setString(7, User_id);

            pre.executeUpdate();
            pre.close();

            pre=conn.prepareStatement("select *from User where User_id=?");
            pre.setString(1, User_id);
            ResultSet res=pre.executeQuery();
            return res;
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public ResultSet update_House_information(int House_id, String Address, int Rent_station, double Price, double Area, String Surrounding, String Others)
    {
        conn=get_Connection();
        try
        {
            PreparedStatement pre=conn.prepareStatement("update House set Address=?,Rent_station=?,Price=?,Area=?,Surrounding=?,others=? where House_id=?");

            pre.setString(1, Address);
            pre.setInt(2, Rent_station);
            pre.setDouble(3, Price);
            pre.setDouble(4, Area);
            pre.setString(5, Surrounding);
            pre.setString(6, Others);
            pre.setInt(7, House_id);
            pre.executeUpdate();
            pre.close();

            pre=conn.prepareStatement("select *from House where House_id=?");
            pre.setInt(1, House_id);
            ResultSet res=pre.executeQuery();
            return res;
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public ResultSet update_Rent_information(String User_id, int House_id, int Rent_rented_station, Date End_time)
    {
        conn=get_Connection();
        try
        {
            PreparedStatement pre=conn.prepareStatement("update Rent_rented set Rent_rented_station=?,End_time=? where User_id=? and House_id=?");

            pre.setInt(1, Rent_rented_station);
            pre.setDate(2, new java.sql.Date(End_time.getTime()));

            pre.setString(3, User_id);
            pre.setInt(4, House_id);
            pre.executeUpdate();
            pre.close();

            pre=conn.prepareStatement("select *from Rent_rented where User_id=? and House_id=?");
            pre.setString(1, User_id);
            pre.setInt(2, House_id);

            ResultSet res=pre.executeQuery();
            return res;
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public ResultSet update_List_information(String User_id, int House_id, int Rent_rented_station, Date End_time)
    {
        conn=get_Connection();
        try
        {
            PreparedStatement pre=conn.prepareStatement("update List set Rent_rented_station=?,End_time=? where User_id=? and House_id=?");

            pre.setInt(1, Rent_rented_station);
            pre.setDate(2, new java.sql.Date(End_time.getTime()));
            pre.setString(3, User_id);
            pre.setInt(4, House_id);

            pre.executeUpdate();
            pre.close();

            pre=conn.prepareStatement("select *from List where User_id=? and House_id=?");
            pre.setString(1, User_id);
            pre.setInt(2, House_id);
            ResultSet res=pre.executeQuery();

            return res;
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public ResultSet select_from_Table(String table_name)
    {
        /*
         * conn=get_Connection(); String str=null; if(table_name.equalsIgnoreCase("Admin")) str=new
         * String("Admin"); else if(table_name.equalsIgnoreCase("User")) str=new String("User");
         * else if(table_name.equalsIgnoreCase("House")) str=new String("House"); else
         * if(table_name.equalsIgnoreCase("Rent_rented")) { str=new String("Rent_rented");
         * PreparedStatement pre=conn.prepareStatement("select *from Rent_rented); } else
         * if(table_name.equalsIgnoreCase("List")) str=new String("List"); try { ResultSet
         * res=pre.executeQuery(); return res; } catch(SQLException e) { e.printStackTrace(); }
         */
    	conn=get_Connection();
    	try {
			PreparedStatement pre=conn.prepareStatement("select * from " + table_name);
			ResultSet res=pre.executeQuery();
			return res;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return null;
    }
    
    public ResultSet select_from_rent_list(String user_id)
    {
       
    	conn=get_Connection();
    	try {
			PreparedStatement pre=conn.prepareStatement("select * from rent_list where Master = " + user_id);
			ResultSet res=pre.executeQuery();
			return res;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return null;
    }
    
    public boolean Logging_User_or_Admin(String table_name, String ID, String password)
    {
        Connection conn=null;
        conn=get_Connection();
        PreparedStatement pre=null;
        try
        {
            if(table_name.equalsIgnoreCase("User"))
            {
                pre=conn.prepareStatement("select User_id from User where User_id=? and User_password=?");
            }
            else
                if(table_name.equalsIgnoreCase("Admin"))
                {
                    pre=conn.prepareStatement("select Admin_id from Admin where Admin_id=? and Admin_password=?");
                }

            pre.setString(1, ID);
            pre.setString(2, password);
            String str=null;
            ResultSet res=pre.executeQuery();
            while(res.next())
            {
                str=res.getString(1);

            }
            if(str == null)
                return false;

            conn.close();
            pre.close();
            res.close();

        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return true;
    }
    
    public boolean update_Admin_information(String Admin_id, String Admin_password)
    {
        conn=get_Connection();
        try
        {
            PreparedStatement pre=conn.prepareStatement("update Admin set Admin_password=? where Admin_id=?");

            pre.setString(1, Admin_password);
            pre.setString(2, Admin_id);

            pre.executeUpdate();
            pre.close();
            close();
            return true;
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return false;
    }

    public boolean update_Admin_information(String Admin_id, String Admin_name, String Admin_telephone, String Admin_idcard, String Admin_mail)
    {
        conn=get_Connection();
        try
        {
            PreparedStatement pre=conn.prepareStatement("update Admin set Admin_name=?, Admin_telephone=?,Admin_idcard=?,Admin_mail=? where Admin_id=?");

            pre.setString(1, Admin_name);
            pre.setString(2, Admin_telephone);
            pre.setString(3, Admin_idcard);
            pre.setString(4, Admin_mail);
            pre.setString(5, Admin_id);

            pre.executeUpdate();
            pre.close();
            return true;
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return false;
    }

    public boolean update_User_information(String User_id, String User_password)
    {
        conn=get_Connection();
        try
        {
            PreparedStatement pre=conn.prepareStatement("update User set User_password=? where User_id=?");

            pre.setString(1, User_password);
            pre.setString(2, User_id);

            pre.executeUpdate();
            pre.close();
            close();
            return true;
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return false;
    }

    public boolean update_User_information(String User_id, String User_name, String User_telephone, String User_idcard, String User_sex, Date User_birthday)
    {
        conn=get_Connection();
        try
        {
            PreparedStatement pre=conn.prepareStatement("update User set User_name=?, User_telephone=?,User_idcard=?,User_sex=?,User_birthday=? where User_id=?");

            pre.setString(1, User_name);
            pre.setString(2, User_telephone);
            pre.setString(3, User_idcard);
            pre.setString(4, User_sex);
            pre.setDate(5, new java.sql.Date(User_birthday.getTime()));
            pre.setString(6, User_id);

            pre.executeUpdate();
            pre.close();
            close();
            return true;
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean update_User_information(String User_id, String User_name, String User_telephone, String User_sex, Date User_birthday)
    {
        conn=get_Connection();
        try
        {
            PreparedStatement pre=conn.prepareStatement("update User set User_name=?, User_telephone=?,User_sex=?,User_birthday=? where User_id=?");

            pre.setString(1, User_name);
            pre.setString(2, User_telephone);
            pre.setString(3, User_sex);
            pre.setDate(4, new java.sql.Date(User_birthday.getTime()));
            pre.setString(5, User_id);

            pre.executeUpdate();
            pre.close();
            close();
            return true;
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return false;
    }

    public boolean User_information_null(String User_id)
    {

        conn=get_Connection();
        PreparedStatement pre=null;
        try
        {

            pre=conn.prepareStatement("select User_name, User_telephone,User_idcard,User_sex,User_birthday from User where User_id=?");
            pre.setString(1, User_id);
            ResultSet res=pre.executeQuery();
            String str=null;
            while(res.next())
            {
                for(int i=1; i <= 5; i++)
                {
                    str=res.getString(i);
                    if(str == null)
                        return true;
                }

            }
            pre.close();
            close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return false;
    }

    
    public ResultSet rent_list_insert(String User_id, String House_id, int User_state, int House_state, Date End_time)
    {
        conn=get_Connection();
        try
        {

            PreparedStatement pre=conn.prepareStatement("insert into rent_list(User_id, House_id, User_state, House_state, End_time) values(?,?,?,?,?)");
            pre.setString(1, User_id);
            pre.setString(2, House_id);
            pre.setInt(3, User_state);
            pre.setInt(4, House_state);
            pre.setDate(5, new java.sql.Date(End_time.getTime()));

            pre.executeUpdate();
            pre.close();

            pre=conn.prepareStatement("select *from User where User_id=?");
            pre.setString(1, User_id);
            ResultSet res=pre.executeQuery();
            return res;
        }

        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }
    
    
}








