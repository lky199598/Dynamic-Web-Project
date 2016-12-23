package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;

import dao.Cart;
import dao.ItemsDao;
import entity.Items;

/**
 * Servlet implementation class CartServlet
 */
@WebServlet("/CartServlet")
public class BuyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ItemsDao itemsdao = new ItemsDao();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BuyServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		String action = request.getParameter("action");


	 if (action.equals("BuyShopping")) {
			BuyShopping(request);
			request.getRequestDispatcher("/BuyShoppingSuccess.jsp").forward(request, response);
		} else if (action.equals("DeleteBuyRecord")) {
			DeleteBuyRecord(request);
			request.getRequestDispatcher("/Buy.jsp").forward(request, response);
		}

	}
	
	public void BuyShopping(HttpServletRequest request) {
		int Buy_id = Integer.parseInt(request.getParameter("buy_id"));

		String name = request.getParameter("name");
		String city = request.getParameter("city");
		String picture = request.getParameter("picture");
		double price = Double.parseDouble(request.getParameter("price"));
		int buy_number = Integer.parseInt(request.getParameter("buy_number"));

		itemsdao.BuyShopping(Buy_id, name, city, picture, price, buy_number);

	}

	public void DeleteBuyRecord(HttpServletRequest request) {
		int Buy_id = Integer.parseInt(request.getParameter("buy_id"));
		itemsdao.DeleteBuyRecord(Buy_id);
	}

}
