package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kembarDAO.serviceDAO;

/**
 * Servlet implementation class deleteServiceController
 */
@WebServlet("/deleteServiceController")
public class deleteServiceController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private serviceDAO dao;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteServiceController() {
        super();
       dao = new serviceDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int SERVICEID = Integer.parseInt(request.getParameter("SERVICEID"));
		 dao.deleteservice(SERVICEID);
		 request.setAttribute("psnlistservice", dao.listservice()); 
		 RequestDispatcher view = request.getRequestDispatcher("adminViewService.jsp");
	     view.forward(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
