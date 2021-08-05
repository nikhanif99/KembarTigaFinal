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
import model.service;

@WebServlet("/ListBookingHistory")
public class ListBookingHistory extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private bookingDAO bookdao;
	private staffDAO dao;
	/**
     * @see HttpServlet#HttpServlet()
     */
	public ListBookingHistory() {
		super();
		bookdao = new bookingDAO();
		dao = new staffDAO();		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("stf", dao.getStaff());
        request.setAttribute("psn", bookingDAO.getCompletedBooking());        
		RequestDispatcher view = request.getRequestDispatcher("bookinghistory.jsp");
        view.forward(request, response);	
	}
}
