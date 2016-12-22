package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TransformStream
{
	public void testMyInput() throws Exception {
	
		//解码：字节数组-->字符串
		//编码：字符串-->字节数组
		   // 字节流访问文件：FileInputStream, FileOutputStream;
        FileInputStream fis=new FileInputStream("D:/AAAAA/dir1/dir2/dir3/dir333/a.txt");
        FileOutputStream fos=new FileOutputStream("D:/AAAAA/dir1/dir2/dir3/dir333/b.txt");

        // 字节--》字符, 用于将字节流中读取到的字节按指定字符集解码成字符
        InputStreamReader isr=new InputStreamReader(fis, "GBK");
        // 字符--》字节, 用于将要写入到字节流中的字符按指定字符集编码成字节
        OutputStreamWriter osw=new OutputStreamWriter(fos, "GBK");

        // 缓冲流要“套接”在相应的节点流之上，对读写的数据提供了缓冲的功能，提高了读写的效率，同时增加了一些新的方法
        BufferedReader br=new BufferedReader(isr);
        BufferedWriter bw=new BufferedWriter(osw);

        // 转换流：InputStreamReader, OutputStreamWriter, 对应的缓冲流:BufferedReader, BufferedWriter.
        String s=null;
        while((s=br.readLine()) != null)
        {
            bw.write(s);
            bw.newLine();
            bw.flush();
        }

        br.close();
        bw.close();
	}

}
