package com.JavaBean;

public class User {
	private String userID;
	private String loginPassword;//��¼����

	private String paymentPassword;//֧������	
	private String name;
	private boolean sex;//1:�У�0:Ů
	private String birthday;//��������
	private String telephone;
	private String email;//����
	private String picture;//����ͼƬ

	
	public User(){}


	public String getUserID() {
		return userID;
	}


	public void setUserID(String userID) {
		this.userID = userID;
	}


	public String getLoginPassword() {
		return loginPassword;
	}


	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}


	public String getPaymentPassword() {
		return paymentPassword;
	}


	public void setPaymentPassword(String paymentPassword) {
		this.paymentPassword = paymentPassword;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isSex() {
		return sex;
	}


	public void setSex(boolean sex) {
		this.sex = sex;
	}


	public String getBirthday() {
		return birthday;
	}


	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPicture() {
		return picture;
	}


	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	
}
