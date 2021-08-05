package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class serviceSessionController
 */
@WebServlet("/serviceSessionController")
public class serviceSessionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HttpSession session;  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public serviceSessionController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		session = request.getSession(true);
     	String CLIENTID = (String)session.getAttribute("sessionCLIENTID");
     	RequestDispatcher view = request.getRequestDispatcher("serviceAL.jsp");
	      view.forward(request, response);
	      System.out.println(CLIENTID);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
