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
import javax.servlet.http.HttpSession;


import kembarDAO.bookingDAO;
import kembarDAO.paymentDAO;
import model.payment;
import model.booking;
import model.onlinePayment;
import model.cash;


@WebServlet("/AddPayment")
public class AddPayment extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HttpSession session;  
    private bookingDAO bookdao;
    private paymentDAO paydao;
    
    
    public AddPayment() {
        super();
        bookdao = new bookingDAO();
        paydao = new paymentDAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		session = request.getSession(true);
     	String CLIENTID = (String)session.getAttribute("sessionCLIENTID");
		
		int updateID = Integer.parseInt(request.getParameter("BOOKINGID"));
		System.out.print(updateID);
		
		int BOOKINGID = Integer.parseInt(request.getParameter("BOOKINGID"));
		booking b = bookdao.getBookingById(BOOKINGID);
		request.setAttribute("u", updateID);
		request.setAttribute("b", bookdao.getBookingById(BOOKINGID)); 
		String PAYMENTTYPE = request.getParameter("PAYMENTTYPE");
		if (PAYMENTTYPE.equals("ONLINE")) {
			RequestDispatcher view = request.getRequestDispatcher("Payment.jsp");
			view.forward(request, response);	
		}
		else if (PAYMENTTYPE.equals("CASH")) {
		RequestDispatcher view = request.getRequestDispatcher("PaymentCash.jsp");
		view.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		payment p = new payment();
		
		p.setBOOKINGID(Integer.parseInt(request.getParameter("BOOKINGID")));
		p.setPAYMENTAMOUNT(Double.parseDouble(request.getParameter("PAYMENTAMOUNT")));
		p.setPAYMENTTYPE(request.getParameter("PAYMENTTYPE"));
		//p.setPAYMENTSTATUS(request.getParameter("PAYMENTSTATUS"));
		String date = request.getParameter("PAYMENTDATE");
		Date dt;
		try {
			dt = new SimpleDateFormat("yyyy-MM-dd").parse(date);
			java.sql.Date sqlDate = new java.sql.Date(dt.getTime());
			p.setPAYMENTDATE(sqlDate);
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
		
		String type = request.getParameter("PAYMENTTYPE");
		System.out.print(type);
		System.out.print(request.getParameter("BOOKINGID"));
		System.out.print(request.getParameter("PAYMENTAMOUNT"));
		System.out.print(request.getParameter("PAYMENTTYPE"));
		System.out.print(request.getParameter("PAYMENTDATE"));
	
		
		
		if(type.equals("ONLINE PAYMENT")) {
			
			
			int autoid = paydao.newpayment(p);
			System.out.println("servlet autoid"+autoid);
		
				onlinePayment op = new onlinePayment();
				op.setPAYMENTID(autoid);
				op.setCARDNAME(request.getParameter("CARDNAME"));
				op.setBANKNAME(request.getParameter("BANKNAME"));
				op.setCARDNUM(request.getParameter("CARDNUM"));
				op.setCVV(Integer.parseInt(request.getParameter("CVV")));
				paydao.newpayment1(op);
				request.setAttribute("paymentinfo",paydao.viewPaymentById(autoid));
				
				
				RequestDispatcher view = request.getRequestDispatcher("ReceiptOnline.jsp");
				view.forward(request, response);
				
				
		}
		else if (type.equals("CASH")) {
			int autoid = paydao.newpayment(p);
			System.out.println("servlet autoid"+autoid);
			 cash c = new cash();
			 c.setPAYMENTID(autoid);
			 c.setCASHSTATUS(request.getParameter("CASHSTATUS"));
			paydao.addpaymentC1(c);
			request.setAttribute("paymentinfo",paydao.viewPaymentById(autoid));
			request.setAttribute("cashinfo",paydao.viewCashById(autoid));
			RequestDispatcher view = request.getRequestDispatcher("ReceiptCash.jsp");
			view.forward(request, response);
		}
	
		
		
	
}
}