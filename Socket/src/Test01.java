
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/*
 * InetAddress��,InetAddress�����ڱ�ʶ�����ϵ�Ӳ����Դ����ʾ������Э��(IP)��ַ��
 */
public class Test01 {

	public static void main(String[] args) throws UnknownHostException {
		// ��ȡ������InetAddressʵ��
		InetAddress address = InetAddress.getLocalHost();
		System.out.println("��������" + address.getHostName());
		System.out.println("IP��ַ��" + address.getHostAddress());
		byte[] bytes = address.getAddress();// ��ȡ�ֽ�������ʽ��IP��ַ
		System.out.println("�ֽ�������ʽ��IP��" + Arrays.toString(bytes));
		System.out.println(address);// ֱ�����InetAddress����

		System.out.println("\n");
		
		// ���ݻ�������ȡInetAddressʵ��
		// InetAddress address2=InetAddress.getByName("LKYLKY-PC");
		InetAddress address2 = InetAddress.getByName("169.254.45.233");
		System.out.println("��������" + address2.getHostName());
		System.out.println("IP��ַ��" + address2.getHostAddress());
	}

}
