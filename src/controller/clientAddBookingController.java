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
import kembarDAO.clientDAO;
import kembarDAO.serviceDAO;
import model.booking;
import model.client;
import kembarDAO.staffDAO;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class AddBooking
 */
@WebServlet("/clientAddBookingController")
public class clientAddBookingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private clientBookingDAO bookdao;
	private clientDAO cdao;
	private serviceDAO dao;
	HttpSession session;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public clientAddBookingController() {
        super();
        bookdao = new clientBookingDAO();
        dao = new serviceDAO();
        cdao = new clientDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//listservice s = serviceDAO.listservice();
		session = request.getSession(true);
     	String CLIENTID = (String)session.getAttribute("sessionCLIENTID");
     	client c = clientDAO.getclient(CLIENTID);
     	request.setAttribute("c", c);
		request.setAttribute("psnlistservice", dao.listservice());
		RequestDispatcher view = request.getRequestDispatcher("clientBookingForm.jsp");
		view.forward(request, response);
		System.out.println(CLIENTID);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		booking b = new booking();
		String id = request.getParameter("CLIENTID");
		System.out.println(id);
		b.setCLIENTID(request.getParameter("CLIENTID"));
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

        bookdao.add(b);
       
        //request.setAttribute("psnlistservice", serviceDAO.listservice());
        //request.setAttribute("book", clientBookingDAO.listbooking());
        
        response.sendRedirect("clientViewBookingListController");
        
        //response.sendRedirect("ViewBookingList");
	}

}
