package JavaBean;


/**
 * ������ϸ��Ϣ�־û���
 * 
 * @author Administrator
 * 
 */
public class OrderItem  {
	private Long orderitem_id;// ����
	private Double discount;// �ۿ�
	private Double actPrice;// �۸�
	private Double amount;// ����
	//private Integer position;
	
	private Order order;
	private Commodity commodity;// ������Ʒ
	
   
	public OrderItem() {

	}

	public Long getOrderitem_id() {
		return orderitem_id;
	}

	public void setOrderitem_id(Long orderitem_id) {
		this.orderitem_id = orderitem_id;
	}

	/*public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}*/

	public Commodity getCommodity() {
		return commodity;
	}

	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Double getActPrice() {
		return actPrice;
	}

	public void setActPrice(Double actPrice) {
		this.actPrice = actPrice;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public String toString() {
		return "������ϸ����:" + this.getOrderitem_id() + "    |    ��Ʒ:"
				+ this.getCommodity().getName() + "    |     �ۿ�:"
				+ this.getDiscount() + "    |   �۸� :" + this.getActPrice()
				+ "    |   ����:" + this.getAmount();
	}

}
