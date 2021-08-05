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

import model.client;
import kembarDAO.clientDAO;

/**
 * Servlet implementation class clientLoginController
 */
@WebServlet("/clientLoginController")
public class clientLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    clientDAO dao;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public clientLoginController() {
        super();
        dao = new clientDAO();        // TODO Auto-generated constructor stub
    }



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {

			client c = new client();
			//retrieve and set email and password
			c.setCLIENTID(request.getParameter("CLIENTID"));
			c.setCLIENTPASS(request.getParameter("CLIENTPASS"));

			c = clientDAO.login(c);
			//set user session if user is valid
			if(c.getCLIENTID() != null){
				HttpSession session = request.getSession(true);
				 session.setAttribute("sessionCLIENTID", c.getCLIENTID());
					session.setAttribute("sessionCLIENTNAME", c.getCLIENTNAME());  //set current session based on email
					session.setAttribute("sessionCLIENTPHONENO", c.getCLIENTPHONENO()); 
					session.setAttribute("sessionCLIENTADDRESS", c.getCLIENTADDRESS()); 
				System.out.println(c.getCLIENTID());
				
				
				String currentid = c.getCLIENTID();
		
//				RequestDispatcher view = request.getRequestDispatcher("/studHomepage.jsp");
//				view.forward(request, response);
				System.out.println("masuk login student");
				System.out.println(currentid);
				response.sendRedirect("homepageSessionController");
			}
			
			else{
				PrintWriter pw=response.getWriter();
                pw.println("<script>");
                pw.println("alert('Invalid Username or Password');");
                pw.println("window.location.href =\"clientLogin.jsp\";");
                pw.println("</script>");
			}
		}

		catch (Throwable ex) {
			System.out.println(ex);
		}
	}
	}


