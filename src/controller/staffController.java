package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import kembarDAO.staffDAO;
import model.staff;

/**
 * Servlet implementation class staffController
 */
@WebServlet("/staffController")
public class staffController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private staffDAO dao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public staffController() {
        super();
        dao = new staffDAO();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		staff s = new staff();
		
		s.setSTAFFID(request.getParameter("STAFFID"));
		s.setSTAFFNAME(request.getParameter("STAFFNAME"));
		s.setSTAFFPHONENO(request.getParameter("STAFFPHONENO"));
		s.setSTAFFROLE(request.getParameter("STAFFROLE"));
		s.setSTAFFEMAIL(request.getParameter("STAFFEMAIL"));
		
		
		
		dao.add(s);
		response.sendRedirect("ListStaffController"); 
		
		
	}

}
