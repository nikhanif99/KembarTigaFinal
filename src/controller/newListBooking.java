package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kembarDAO.bookingDAO;
import kembarDAO.staffDAO;

/**
 * Servlet implementation class newListBooking
 */
@WebServlet("/newListBooking")
public class newListBooking extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private bookingDAO bookdao;
	private staffDAO dao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public newListBooking() {
        super();
        bookdao = new bookingDAO();
        dao = new staffDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	request.setAttribute("stf", dao.getStaff());
		//double TOTALPRICE = Double.parseDouble(request.getParameter("TOTALPRICE"));
		request.setAttribute("psn", bookingDAO.getAllBookingNew()); 
		
		        
			RequestDispatcher view = request.getRequestDispatcher("newListBooking.jsp");
	        view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
