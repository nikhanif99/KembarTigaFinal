package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.booking;
import kembarDAO.bookingDAO;

/**
 * Servlet implementation class paymentMethodController
 */
@WebServlet("/paymentMethodController")
public class paymentMethodController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HttpSession session; 
	private bookingDAO bookdao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public paymentMethodController() {
        super();
        bookdao = new bookingDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		session = request.getSession(true);
     	String CLIENTID = (String)session.getAttribute("sessionCLIENTID");
		
		String updateID = request.getParameter("BOOKINGID");
		System.out.print(updateID);
		
		int BOOKINGID = Integer.parseInt(request.getParameter("BOOKINGID"));
		booking b = bookdao.getBookingById(BOOKINGID);
		request.setAttribute("u", updateID);
		request.setAttribute("b", bookdao.getBookingById(BOOKINGID)); 
		RequestDispatcher view = request.getRequestDispatcher("PaymentReceipt.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
