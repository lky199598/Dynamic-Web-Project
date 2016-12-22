package com.po;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class date {

	
/*		Calendar call = Calendar.getInstance();
		call.set(2015, 7-1, 1, 17, 30, 36);
		Date d = call.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");
		System.out.println(sdf.format(d));
		
		System.out.println(call.get(Calendar.YEAR)+"年");
		System.out.println(call.get(Calendar.MONTH)+1+"月");
		System.out.println(call.get(Calendar.DATE)+"日");*/
		
		 
		    public static void main(String[] args) throws Exception {
		        String s = "2015-10-18";
		        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		        Date d = sdf.parse(s);
		        
		        System.out.println(sdf.format(d));
		        System.out.println(d.getYear()+1900+"年");
		    }
}



