package controller;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.client;
import kembarDAO.clientDAO;

/**
 * Servlet implementation class clientRegisterAccount
 */
@WebServlet("/clientRegisterAccount")
public class clientRegisterAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
     private clientDAO dao;  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public clientRegisterAccount() {
        super();
        dao = new clientDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		client c = new client();
		c.setCLIENTID(request.getParameter("CLIENTID"));
		c.setCLIENTNAME(request.getParameter("CLIENTNAME"));
		c.setCLIENTPHONENO(request.getParameter("CLIENTPHONENO"));
		c.setCLIENTADDRESS(request.getParameter("CLIENTADDRESS"));
		c.setCLIENTEMAILADD(request.getParameter("CLIENTEMAILADD"));
		c.setCLIENTPASS(request.getParameter("CLIENTPASS"));
		
		try {
			dao.registerClient(c);
		} catch (NoSuchAlgorithmException e) {
			System.out.println("tak masuk controller register client");
			e.printStackTrace();
		}
		RequestDispatcher view = request.getRequestDispatcher("clientLogin.jsp");
		view.forward(request, response);	
		
		
	}

}
