package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kembarDAO.staffDAO;

/**
 * Servlet implementation class deleteStaffController
 */
@WebServlet("/deleteStaffController")
public class deleteStaffController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private staffDAO dao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteStaffController() {
        super();
        dao = new staffDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String STAFFID = (request.getParameter("STAFFID"));
		dao.deleteStaff(STAFFID);
		
		request.setAttribute("s", staffDAO.getAllStaff());
		
		
        response.sendRedirect("ListStaffController");
	}

	

}
