package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kembarDAO.clientBookingDAO;
import kembarDAO.serviceDAO;
import model.booking;

/**
 * Servlet implementation class UpdateBooking
 */
@WebServlet("/clientUpdateBookingController")
public class clientUpdateBookingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private clientBookingDAO bookdao;
	private serviceDAO dao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public clientUpdateBookingController() {
        super();
        bookdao = new clientBookingDAO();
        dao = new serviceDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub		
        
		String bookingID = request.getParameter("BOOKINGID");
		request.setAttribute("psnlistservice", dao.listservice());
		request.setAttribute("book", clientBookingDAO.getBookingByID(bookingID));
		RequestDispatcher view = request.getRequestDispatcher("clientBookingUpdate.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		booking b = new booking();
		int BOOKINGID = Integer.parseInt(request.getParameter("BOOKINGID"));
		b.setBOOKINGID(Integer.parseInt(request.getParameter("BOOKINGID")));
		b.setBOOKINGLOCATION(request.getParameter("BOOKINGLOCATION"));
		b.setSERVICEID(Integer.parseInt(request.getParameter("SERVICEID")));
		
		String startdate = request.getParameter("BOOKINGSTARTDATE");
        Date st;
        try {
            st = new SimpleDateFormat("yyyy-MM-dd").parse(startdate);
            java.sql.Date sqlDate = new java.sql.Date(st.getTime());
            b.setBOOKINGSTARTDATE(sqlDate);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
        
        String enddate = request.getParameter("BOOKINGENDDATE");
        Date et;
        try {
            et = new SimpleDateFormat("yyyy-MM-dd").parse(enddate);
            java.sql.Date sqlDate = new java.sql.Date(et.getTime());
            b.setBOOKINGENDDATE(sqlDate);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
        
        b.setHOURS(Double.parseDouble(request.getParameter("HOURS")));
       
        System.out.println("masuk controller tak");
        bookdao.updateBooking(b);
        booking book = bookdao.getBookingByID(request.getParameter("BOOKINGID"));
        request.setAttribute("book", book);
        response.sendRedirect("clientViewBookingListController");
	}

}
