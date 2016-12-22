package com.po;

public class Student {
	private int id;
	private String name;
	private String sex;
	private int age;
	private String classs;

	public Student() {
	}

	public Student(int id){
		this.id=id;
	}
	public Student(int id, String name, String sex, int age, String classs) 
	{
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.classs = classs;
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

	public String getClasss() {
		return classs;
	}

	public void setClasss(String classs) {
		this.classs = classs;
	}



}
