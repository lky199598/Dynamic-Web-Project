package com;

import java.util.Date;

public class User {
	private int n;
	private String User_id;
	private char User_sex;
	private Date User_birthday;

	
	public int getN() {
		return n;
	}




	public void setN(int n) {
		this.n = n;
	}




	public String getUser_id() {
		return User_id;
	}




	public void setUser_id(String user_id) {
		User_id = user_id;
	}




	public char getUser_sex() {
		return User_sex;
	}




	public void setUser_sex(char user_sex) {
		User_sex = user_sex;
	}




	public Date getUser_birthday() {
		return User_birthday;
	}




	public void setUser_birthday(Date user_birthday) {
		User_birthday = user_birthday;
	}


	
	public static void main(String[] args) {
		User user = new User();
		System.out.println("int: "+user.getN()+"\nString: "+user.getUser_id()+"\nchar: "+user.getUser_sex() +"\nDate: "+user.getUser_birthday()+"\n");

		System.out.println(user.getClass().getSimpleName());
	}

}
