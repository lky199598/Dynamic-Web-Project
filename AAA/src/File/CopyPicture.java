package File;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyPicture {
	
	private FileInputStream fis = null;
	private FileOutputStream fos = null;
	private BufferedInputStream bis=null;
	private BufferedOutputStream bos = null;
	
	void close()
	{
		if(bos != null)
			try {
				bos.close();
				bos = null;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		if(bis != null)
			try {
				bis.close();
				bis = null;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		if(fos != null)
			try {
				fos.close();
				fos = null;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(fis  != null)
			try {
				fis.close();
				fis = null;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	void findFile(File f)
	{
		File[] file  = f.listFiles();
		for(File fs : file)
			if(fs.isFile())
			System.out.println(fs.getName());		
		
	}
	
	 void findFile1(File f)
	{
		System.out.println("\n");
		String[] file  = f.list();
		for(String fs : file)
			System.out.println(fs);		
		
	}
	
	 void copyFile(String src, String dest)
	{
		File f1 = new File(src);
				
		String s1 = f1.getName();
		dest+="\\"+s1;
		
		File f2 = new File(dest);
		
		try {
			fis =  new FileInputStream(f1);
			fos = new FileOutputStream(f2);
			
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
						
			byte[] b = new byte[1024];
			int len;
			while( (len = bis.read(b)) != -1)
				fos.write(b, 0, len);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			close();
		}
		System.out.println("���Ƴɹ���");
	}
	
	 void copyTextFile()
	 {
		    Scanner input=new Scanner(System.in);
		    
	        BufferedReader br=null;
	        BufferedWriter bw=null;

	        try
	        {
	            System.out.println("������Դ�ļ�: ");
	            String s1=input.next();
	            File f1=new File(s1);
	            if(!f1.exists())
	            {
	                System.out.println("\nԴ�ļ�������!\n");
	                throw new FileNotFoundException();
	            }
	            else
	                System.out.println("\nԴ�ļ�����!\n");

	            System.out.println("\n������Ŀ���ļ�: ");
	            String s2=input.next();
	            File f2=new File(s2);

	            if(!f2.exists())
	            {
	                System.out.println("Ŀ���ļ�������!\n");
	                boolean flag=f2.createNewFile();
	                if(flag)
	                    System.out.println("\nĿ���ļ������ɹ���");
	                else
	                {
	                    System.out.println("\nĿ���ļ�����ʧ�ܣ�\n");
	                    throw new IOException();
	                }
	            }
	            else
	                System.out.println("\nĿ���ļ�����!\n");

	            System.out.println("\n��ʼ�ļ�����");

	            br=new BufferedReader(new FileReader(f1));
	            bw=new BufferedWriter(new FileWriter(f2));

	            String str=null;
	            while((str=br.readLine()) != null)
	            {
	                bw.write(str);
	                bw.newLine();
	                bw.flush();
	            }
	            System.out.println("\n�ļ����Ƴɹ���");
	        }
	        catch(FileNotFoundException e)
	        {
	            e.printStackTrace();
	        }
	        catch(IOException e)
	        {
	            e.printStackTrace();
	        }

	        finally
	        {

	            try
	            {
	                br.close();
	                bw.close();
	            }
	            catch(IOException e)
	            {
	                System.out.println("\n�ļ��رմ���!\n");
	                e.printStackTrace();
	            }

	        }
	    }
	 
	 
	 
	public static void main(String[] agrs)
	{
		CopyPicture cp = new CopyPicture();
		cp.copyFile("D:\\�ҵ�ͼƬ\\����.jpg", "D:\\�ҵ�ͼƬ\\a");		
	}

}
