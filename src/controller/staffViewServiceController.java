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
 * Servlet implementation class staffViewServiceController
 */
@WebServlet("/staffViewServiceController")
public class staffViewServiceController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private serviceDAO dao;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public staffViewServiceController() {
        super();
        dao = new serviceDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("psnlistservice", serviceDAO.listservice()); 
        RequestDispatcher view = request.getRequestDispatcher("adminViewService.jsp");
        view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
