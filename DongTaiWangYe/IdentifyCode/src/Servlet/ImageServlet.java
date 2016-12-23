package Servlet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ImageServlet
 */
@WebServlet("/ImageServlet")
public class ImageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ImageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   doPost(request, response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 //BufferedImage �����������пɷ���ͼ�����ݻ������� Image
		BufferedImage bi = new BufferedImage(68, 22, BufferedImage.TYPE_INT_RGB);
		
		//Graphics ��������ͼ�������ĵĳ�����࣬����Ӧ�ó�����������Ѿ��ڸ����豸��ʵ�֣��Լ�����ͼ���Ͻ��л��ơ� 
		//Graphics �����װ�� Java ֧�ֵĻ������ֲ��������״̬��Ϣ����״̬��Ϣ������������		
		Graphics g = bi.getGraphics();
		
		//Color �����ڷ�װĬ�� sRGB ��ɫ�ռ��е���ɫ���������ڷ�װ�� ColorSpace ��ʶ��������ɫ�ռ��е���ɫ
		Color c = new Color(200,150,255);
		g.setColor(c);//����ͼ�������ĵĵ�ǰ��ɫ����Ϊָ����ɫ��
		g.fillRect(0, 0, 68, 22);//   ���ָ���ľ��Ρ�
	    
		Random r = new Random();
		String str = "";
		char a;
		for(int i=0;i<4;i++)
		{
			if(r.nextInt(2) == 0)
				 a = (char) (r.nextInt(10)+'0');
			else
				a = (char)(r.nextInt(26)+'A');
			g.setColor(new Color(r.nextInt(88), r.nextInt(188), r.nextInt(255)) );
			g.drawString(a+"", (i*15)+3, 18);
			str+=a;
		}
		
		request.getSession().setAttribute("code", str);
	    ImageIO.write(bi, "JPG", response.getOutputStream());
	}

}
