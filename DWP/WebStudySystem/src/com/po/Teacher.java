package com.po;

public class Teacher {
	private int id;
	private String name;
	private String sex;
	private int age;

	public Teacher() {
	}

	public Teacher(int id){
		this.id=id;
	}
	public Teacher(int id, String name, String sex, int age, double weight) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


}
