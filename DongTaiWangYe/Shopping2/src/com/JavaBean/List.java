package com.JavaBean;

public class List {
	private String userID;// ��
	private String goodsID;
	private String start_date;// ��ʼ�������������

	private int number;// �������������
	private double price;//������ ԭ��Ʒ��Ϣ���Ըı䣬����Ҫ���浱ʱ�ļ۸�)
	
	private String end_date;// ����:ȷ���ջ����ڣ�����:���޽���

	private int station;//1��������ɣ�0��������, -1:δ����

	public List() {
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStation() {
		return station;
	}

	public void setStation(int station) {
		this.station = station;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getGoodsID() {
		return goodsID;
	}

	public void setGoodsID(String goodsID) {
		this.goodsID = goodsID;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public static void main(String[] args) {
		int x=4;
   System.out.print(": "+((x>4)? 99.9:9));
	}
}
