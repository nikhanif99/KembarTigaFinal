package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kembarDAO.serviceDAO;
import model.service;

/**
 * Servlet implementation class addServiceController
 */
@WebServlet("/addServiceController")
public class addServiceController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private serviceDAO dao;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addServiceController() {
        super();
        dao = new serviceDAO(); 
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service s = new service();
		
		s.setSERVICETYPE(request.getParameter("SERVICETYPE"));
		s.setEDITINGRATE(Double.parseDouble(request.getParameter("EDITINGRATE")));		
		dao.addservice(s);
		System.out.println("connectedcsAddController");
		response.sendRedirect("staffViewServiceController"); 

	}

}
