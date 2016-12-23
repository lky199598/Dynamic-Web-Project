package Servlet;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

import custom.CaptchaServiceSingleton;

/**
 * Servlet implementation class CustomServlet
 */
@WebServlet("/CustomServlet")
public class CustomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   byte[] captChallengeAsJpeg = null;
	         
	        ByteArrayOutputStream jpegOutputStream = new ByteArrayOutputStream();
	         
	        String captchaId = request.getSession().getId();
	        BufferedImage challenge = CaptchaServiceSingleton.getService().getImageChallengeForID(captchaId,request.getLocale());
	         
	        JPEGImageEncoder jpegEncoder = JPEGCodec.createJPEGEncoder(jpegOutputStream);
	        jpegEncoder.encode(challenge);
	         
	        captChallengeAsJpeg = jpegOutputStream.toByteArray();
	         
	         response.setHeader("Cache-Control", "no-store");
	         response.setHeader("Pragma", "no-cache");
	         response.setDateHeader("Expires", 0);
	         response.setContentType("image/jpeg");
	          
	         ServletOutputStream respOutputStream = response.getOutputStream();
	         respOutputStream.write(captChallengeAsJpeg);
	         respOutputStream.flush();
	         respOutputStream.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
