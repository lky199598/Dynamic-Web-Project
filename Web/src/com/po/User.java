package com.po;

public class User 
{
private String username;
private String password;

private int age;
private char sex;
private String address;

public User()
{	
}
/*
public User(String username, String password)
{
	this.username=username;
	this.password=password;
}

public User(String username, int age, char sex, String Address)
{
	this.username=username;
	this.age=age;
	this.sex = sex;
	this.Address=Address;
}
*/


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


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public char getSex() {
	return sex;
}


public void setSex(char sex) {
	this.sex = sex;
}



}
