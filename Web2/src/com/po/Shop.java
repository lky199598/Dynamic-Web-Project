package com.po;

import java.util.Vector;

public class Shop {

	private Vector<String> v=new Vector<String>();
	private String item="";
	private String submit="";
	public Vector<String> getV() {
		return v;
	}
	public void setV(Vector<String> v) {
		this.v = v;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getSubmit() {
		return submit;
	}
	public void setSubmit(String submit) {
		this.submit = submit;
	}
	
	public void Add_Remove()
	{
		if(submit.equals("Ìí¼Ó"))
			v.add(item);
		else if(submit.equals("É¾³ý"))
			v.remove(item);	
	}
}
