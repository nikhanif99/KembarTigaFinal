package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kembarDAO.staffDAO;

/**
 * Servlet implementation class viewStaffAssign
 */
@WebServlet("/viewStaffAssign")
public class viewStaffAssign extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private staffDAO dao;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public viewStaffAssign() {
        super();
        dao = new staffDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("stf", dao.getStaff()); 
        
        RequestDispatcher view = request.getRequestDispatcher("UpdateApproval.jsp");
        view.forward(request, response);	
	}
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

