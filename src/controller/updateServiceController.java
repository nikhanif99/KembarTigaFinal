package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kembarDAO.serviceDAO;

import model.service;

/**
 * Servlet implementation class updateServiceController
 */
@WebServlet("/updateServiceController")
public class updateServiceController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private serviceDAO dao;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateServiceController() {
        super();
        dao= new serviceDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int SERVICEID = Integer.parseInt(request.getParameter("SERVICEID"));
    	
		request.setAttribute("s", serviceDAO.getservice(SERVICEID));
		RequestDispatcher view = request.getRequestDispatcher("updateServiceForm.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service s = new service();
		int SERVICEID = Integer.parseInt(request.getParameter("SERVICEID"));

		s.setSERVICEID(Integer.parseInt(request.getParameter("SERVICEID")));
		s.setSERVICETYPE(request.getParameter("SERVICETYPE"));
		s.setEDITINGRATE(Double.parseDouble((request.getParameter("EDITINGRATE"))));
		dao.updateservice(s);
		System.out.println("connect update service controller");
		
		request.setAttribute("s", serviceDAO.getservice(SERVICEID));
		RequestDispatcher view = request.getRequestDispatcher("updateServiceForm.jsp");
        view.forward(request, response);
	}

}
