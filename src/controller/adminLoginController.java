package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.staff;
import kembarDAO.staffDAO;
/**
 * Servlet implementation class adminLoginController
 */
@WebServlet("/adminLoginController")
public class adminLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private staffDAO dao;
	HttpSession session;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 session = request.getSession(true);
         String STAFFID = (String)session.getAttribute("sessionSTAFFID");	
			request.setAttribute("s", dao.getStaffById(STAFFID));
			//RequestDispatcher view = request.getRequestDispatcher("homepage.jsp");
			//view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {

			staff STAFF = new staff();
			//retrieve and set email and password
			STAFF.setSTAFFEMAIL(request.getParameter("STAFFEMAIL"));
			STAFF.setSTAFFPASS(request.getParameter("STAFFPASS"));

			staff STAFFlogin = staffDAO.login(STAFF);
			System.out.println("s"+STAFFlogin.getSTAFFEMAIL());
			//set user session if user is valid
			if(STAFFlogin.getSTAFFEMAIL() != null){
				HttpSession session = request.getSession(true);
			    session.setAttribute("sessionSTAFFID", STAFFlogin.getSTAFFID());
				session.setAttribute("sessionSTAFFNAME", STAFFlogin.getSTAFFNAME());  //set current session based on email
				session.setAttribute("sessionSTAFFPHONENO", STAFFlogin.getSTAFFPHONENO()); 
				session.setAttribute("sessionSTAFFROLE", STAFFlogin.getSTAFFROLE()); 
				session.setAttribute("sessionSTAFFEMAIL", STAFFlogin.getSTAFFEMAIL());
				
				String currentid = STAFFlogin.getSTAFFID();
				System.out.println(currentid);
				RequestDispatcher view = request.getRequestDispatcher("homepage.jsp");
				view.forward(request, response);	
			}
			else {
				
				PrintWriter pw=response.getWriter();
				pw.println("<script>");
				pw.println("alert('Invalid Username or Password');");
				pw.println("window.location.href = \"adminLogin.jsp\";");
				pw.println("</script>");
				
			}
			//redirect to invalidLoggin.jsp if user is not valid
		}

		catch (Throwable ex) {
			System.out.println(ex);
		}
	}

}
