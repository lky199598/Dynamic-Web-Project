package File;

import java.io.File;
import java.io.IOException;

public class UseFile {
	public static void main(String[] args) {
		File dir1 = new File("D:/IOTest/dir1");
		
		if (!dir1.exists()) { // ���D:/IOTest/dir1�����ڣ��ʹ���ΪĿ¼
			dir1.mkdir();// �����˳���·����ָ����Ŀ¼��
		}
		
		// ������dir1Ϊ��Ŀ¼,��Ϊ"dir2"��File����
		File dir2 = new File(dir1, "dir2");
		if (!dir2.exists()) { // ����������ڣ��ʹ���ΪĿ¼
			dir2.mkdirs();// �����˳���·����ָ����Ŀ¼���������б��赫�����ڵĸ�Ŀ¼��
		} 
		
		
		File dir4 = new File(dir1, "dir3/dir4");
		if (!dir4.exists()) {
			dir4.mkdirs();
		}
		
		
		// ������dir2Ϊ��Ŀ¼,��Ϊ"test.txt"��File����
		File file = new File(dir2, "test.txt");
		if (!file.exists()) { // ����������ڣ��ʹ���Ϊ�ļ�
			try {
				file.createNewFile();				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
