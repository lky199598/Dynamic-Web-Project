package FrameWork;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UseList {
    public static void main(String[] args) throws SQLException {
    	
		List<Integer> list = new ArrayList<Integer>(10);
		System.out.println(list);

		Class c = new Integer(8).getClass();
		throw new SQLException();
		
	}
}
