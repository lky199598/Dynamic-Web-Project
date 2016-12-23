package JavaBean;

import java.io.Serializable;
import java.util.Date;

/**
 * �� ����Ϣ�־û���
 * 
 * @author Administrator
 * 
 */
public class Order implements Serializable{
	private Integer order_id;// ����
	private Date tradeDate;// ��������
	private String status;// ����״̬
	private Double amount;// �������
	
	private Customer customer;// �ͻ�
   

	public Order() {
	}


	public Integer getOrder_id() {
		return order_id;
	}




	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}




	public Date getTradeDate() {
		return tradeDate;
	}




	public void setTradeDate(Date tradeDate) {
		this.tradeDate = tradeDate;
	}




	public String getStatus() {
		return status;
	}




	public void setStatus(String status) {
		this.status = status;
	}




	public Double getAmount() {
		return amount;
	}




	public void setAmount(Double amount) {
		this.amount = amount;
	}




	public Customer getCustomer() {
		return customer;
	}




	public void setCustomer(Customer customer) {
		this.customer = customer;
	}




	public String toString() {
		return "��������:" + this.order_id + "    |    �ͻ�:"
				+ this.getCustomer().getName() + "    |     ��������:"
				+ this.getTradeDate() + "    |   ����״̬ :" + this.getStatus()
				+ "    |   �������:" + this.getAmount();
	}

	public static void main(String[] args) {
		Order o = new Order();
		o.setAmount((double) 80);
	}
}
