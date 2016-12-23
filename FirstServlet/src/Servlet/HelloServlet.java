package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("utf-8");
		
		System.out.println("处理Get()请求...");
	
		PrintWriter out  = response.getWriter();
		response.setContentType("text/html;charset=utf-8");
		out.println("处理Get()请求...");
		out.print("<br><h1>第一个Servlet</h1>");
		out.print("<strong>Hello myFirstServlet!</strong><br>");//<strong>是加粗
		
		//response.sendRedirect(request.getContextPath()+"/show.jsp");
		request.getRequestDispatcher("/show.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	response.setCharacterEncoding("utf-8");
		
		System.out.println("处理Post()请求...");
		
		PrintWriter out  = response.getWriter();
		response.setContentType("text/html;charset=utf-8");
		out.println("处理Post()请求...");
		out.print("<br><h1>第一个Servlet</h1>");
		out.print("<strong>Hello myFirstServlet!</strong><br>");//<strong>是加粗
	}

}
