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

import kembarDAO.bookingDAO;
import kembarDAO.staffDAO;
import model.booking;


@WebServlet("/UpdateApproval")
public class UpdateApproval extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private bookingDAO bookdao;
    private staffDAO dao;
    /**
     * @see HttpServlet#HttpServlet()
     */ 
    public UpdateApproval() {
        super();
        bookdao = new bookingDAO();
        dao = new staffDAO();
     // TODO Auto-generated constructor stub
    }
    
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int BOOKINGID = Integer.parseInt(request.getParameter("BOOKINGID"));
		booking b = bookdao.getBookingById(BOOKINGID);
		request.setAttribute("b",b);
		request.setAttribute("stf", dao.getStaff()); 
		RequestDispatcher view = request.getRequestDispatcher("UpdateApproval.jsp");
		view.forward(request, response);
		System.out.println(BOOKINGID);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("masuk dopost update approval");
		booking b = new booking();
		
		
		System.out.println(request.getParameter("BOOKINGID")); //for debugging purpose	
		
		b.setBOOKINGID(Integer.parseInt(request.getParameter("BOOKINGID")));
		b.setSTAFFID(request.getParameter("STAFFID"));
		String date = request.getParameter("BOOKINGSTARTDATE");
        Date dt;
        try {
            dt = new SimpleDateFormat("yyyy-MM-dd").parse(date);
            java.sql.Date sqlDate = new java.sql.Date(dt.getTime());
            b.setBOOKINGSTARTDATE(sqlDate);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
      
		String dateEND = request.getParameter("BOOKINGENDDATE");
        Date dtEND;
        try {
            dtEND = new SimpleDateFormat("yyyy-MM-dd").parse(dateEND);
            java.sql.Date sqlDate = new java.sql.Date(dtEND.getTime());
            b.setBOOKINGENDDATE(sqlDate);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
		
        b.setBOOKINGLOCATION(request.getParameter("BOOKINGLOCATION"));
		b.setSERVICETYPE(request.getParameter("SERVICETYPE"));
		b.setHOURS(Double.parseDouble(request.getParameter("HOURS")));
		
		b.setBOOKINGSTATUS(request.getParameter("BOOKINGSTATUS"));
		
		b.setTOTALPRICE(Double.parseDouble(request.getParameter("TOTALPRICE")));
		
		bookdao.UpdateApproval(b);
		
		request.setAttribute("psn", bookdao.getAllBooking());
		RequestDispatcher view = request.getRequestDispatcher("ListBooking.jsp");
		view.forward(request, response);
	}
}