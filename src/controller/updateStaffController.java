package controller;

import javax.servlet.RequestDispatcher;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import kembarDAO.staffDAO;
import model.staff;


/**
 * Servlet implementation class updateStaffController
 */
@WebServlet("/updateStaffController")
public class updateStaffController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private staffDAO dao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateStaffController() {
        super();
        dao = new staffDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String STAFFID = (request.getParameter("STAFFID"));
		request.setAttribute("s", staffDAO.getStaffById(STAFFID));
		RequestDispatcher view = request.getRequestDispatcher("/updateStaff.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		staff s = new staff();
        s.setSTAFFID(request.getParameter("STAFFID"));      
        s.setSTAFFNAME(request.getParameter("STAFFNAME"));
		s.setSTAFFPHONENO(request.getParameter("STAFFPHONENO"));
		s.setSTAFFROLE(request.getParameter("STAFFROLE"));
		s.setSTAFFEMAIL(request.getParameter("STAFFEMAIL"));
		s.setSTAFFPASS(request.getParameter("STAFFPASS"));
		
		//s.setSUPERVISEID(Integer.parseInt(request.getParameter("SUPERVISEID")));
        dao.staffUpdate(s);
        response.sendRedirect("ListStaffController");
	}

}
