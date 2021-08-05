package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kembarDAO.clientBookingDAO;

/**
 * Servlet implementation class DeleteBooking
 */
@WebServlet("/clientDeleteBooking")
public class clientDeleteBooking extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private clientBookingDAO bookdao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public clientDeleteBooking() {
        super();
        bookdao = new clientBookingDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String BOOKINGID = (request.getParameter("BOOKINGID"));
		bookdao.deleteBooking(BOOKINGID);
		request.setAttribute ("book", bookdao.listbooking());
		response.sendRedirect("clientViewBookingListController");
	}
}
