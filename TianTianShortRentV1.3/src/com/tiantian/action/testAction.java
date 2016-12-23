package com.tiantian.action;

public class testAction {
	private String hello="123";
	private String world="456";
	public String getHello() {
		return hello;
	}
	public void setHello(String hello) {
		this.hello = hello;
	}
	public String getWorld() {
		return world;
	}
	public void setWorld(String world) {
		this.world = world;
	}
	
	public String test(){
		this.setHello("123");
		this.setWorld("456");
		return "success";
	}
	
	public String NewFile1(){
	
		this.setHello("123");
		this.setWorld("456");
		return "success";
	}
	
	public String hehehehe(){
		return "success";
	}
}
