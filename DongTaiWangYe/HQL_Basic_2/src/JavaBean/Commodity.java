package JavaBean;

/**
 * ��Ʒ��Ϣ�־û���
 * 
 * @author Administrator
 * 
 */
public class Commodity  {
	private Long commodity_id;// ����
	private String name;// ����
	private Double price;// �۸�
	private String unit;// ��λ
	private String category;// ���
	private String description;// ���
	private Seller seller;// �̼�
    
	public Commodity() {
	
	}

	public Long getCommodity_id() {
		return commodity_id;
	}

	public void setCommodity_id(Long commodity_id) {
		this.commodity_id = commodity_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public String toString() {
		return "����:" + this.getCommodity_id() + "    |   ����:" + this.getName()
				+ "    |     �۸�:" + this.getPrice() + "    |   ��λ :"
				+ this.getUnit() + "    |   ����:" + this.getCategory()
				+ "    |   ��Ӫ�̼�:" + this.getSeller().getName() + "    |   ���:"
				+ this.getDescription();
	}

}
