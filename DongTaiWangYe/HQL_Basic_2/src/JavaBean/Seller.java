package JavaBean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * �̼���Ϣ�־û���
 * 
 * @author Administrator
 * 
 */
public class Seller{
	private Long seller_id;// ����
	private String name;// ����
	private String tel;// �绰
	private String address;// ��ַ
	private String website;// ��վ
	private Integer star;// �Ǽ�
	private String business;// ��Ӫ��Χ
	//private Set<Commodity> c = new HashSet<Commodity>();
	
		public Seller(){
		
	}
	
	public Seller(String name,String tel,String address){
		this.name = name;
		this.tel = tel;
		this.address = address;
	}

/*	public Set<Commodity> getC() {
		return c;
	}

	public void setC(Set<Commodity> c) {
		this.c = c;
	}*/

	

	public String getName() {
		return name;
	}

	public Long getSeller_id() {
		return seller_id;
	}

	public void setSeller_id(Long seller_id) {
		this.seller_id = seller_id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Integer getStar() {
		return star;
	}

	public void setStar(Integer star) {
		this.star = star;
	}

	public String getBusiness() {
		return business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}

	public String toString() {
		return "����:" + this.getSeller_id() + "    |    ����:" + this.getName()
				+ "    |     �绰:" + this.getTel() + "    |   �Ǽ� :"
				+ this.getStar() + "    |   ��ַ:" + this.getWebsite()
				+ "    |    ��ַ:" + this.getAddress() + "    |   ��Ӫ��Χ:"
				+ this.getBusiness();
	}
}
