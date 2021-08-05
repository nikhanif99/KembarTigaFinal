package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kembarDAO.clientBookingDAO;
import kembarDAO.serviceDAO;
import model.client;
import kembarDAO.clientDAO;

/**
 * Servlet implementation class ViewBookingList
 */
@WebServlet("/clientViewBookingListController")
public class clientViewBookingListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private clientBookingDAO bookstaffDAO;
	private serviceDAO staffDAO;
	private clientDAO clientDAO;
	HttpSession session;  
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public clientViewBookingListController() {
        super();
        bookstaffDAO = new clientBookingDAO();
        staffDAO  = new serviceDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 //request.setAttribute("psnlistservice", staffDAO.listservice());
		session = request.getSession(true);
     	 String CLIENTID = (String)session.getAttribute("sessionCLIENTID");
		 request.setAttribute("book", clientBookingDAO.listbookingByEmail(CLIENTID)); 
		 System.out.println(CLIENTID);
	      RequestDispatcher view = request.getRequestDispatcher("clientBookingList.jsp");
	      view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
