package controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kembarDAO.bookingDAO;
import kembarDAO.staffDAO;
import model.booking;

/**
 * Servlet implementation class ViewFeedbackController
 */
@WebServlet("/ViewBooking")
public class ViewBooking extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private bookingDAO bookdao;  
	private static String VIEW = "/ViewBooking.jsp";
	private staffDAO dao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewBooking() {
        super();       
        bookdao = new bookingDAO();
        dao = new staffDAO();        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int BOOKINGID = Integer.parseInt(request.getParameter("BOOKINGID"));
	//	request.setAttribute("stf", dao.getStaff());
		request.setAttribute("b", bookdao.getBookingById(BOOKINGID));
		RequestDispatcher view = request.getRequestDispatcher("ViewBooking.jsp");
		view.forward(request, response);
		System.out.print("saas");
	}



}