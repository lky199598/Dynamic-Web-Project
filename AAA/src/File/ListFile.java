package File;

import java.io.File;

public class ListFile {

	public static void listAll(File file) throws Exception {
		
		if (file.isFile()) {
			System.out.println(file);
		}

		else if (file.isDirectory()) 
		{
			//����һ������·�������飬��Щ·������ʾ�˳���·������ʾ��Ŀ¼�е��ļ�
			File[] fs = file.listFiles();
			
			for (int i = 0; i < fs.length; i++)
			{
				listAll(fs[i]);//�ݹ����
			}
		}
	}

}
