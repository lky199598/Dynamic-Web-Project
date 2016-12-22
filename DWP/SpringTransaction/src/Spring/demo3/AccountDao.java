package Spring.demo3;
/*
 * ת�ʰ����DAO��ӿ�
 */

public interface AccountDao {
/**
 * @param out:ת���˺�
 * @param money��ת�����
 */
	public void outMoney(String out, Double money);
	
	/**
	 * @param in��ת���˺�
	 * @param money��ת�˽��
	 */
	public void inMoney(String in, Double money);
	
}
