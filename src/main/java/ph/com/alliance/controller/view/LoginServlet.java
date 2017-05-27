package ph.com.alliance.controller.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.removeAttribute("username");
		response.sendRedirect(request.getContextPath() + "/");
	  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("DO POST");
		String idnumber = request.getParameter("idnumber");
		String password = request.getParameter("password");
		System.out.println("ID: " + idnumber);
		System.out.println("Password: " + password);
		if(idnumber.length() == 3 && password.equals("glaiza")){
			HttpSession session = request.getSession();
			session.setAttribute("idnumber", idnumber);
			System.out.println("DO POST CALLED");
			response.sendRedirect(request.getContextPath() + "/login/main");
		}
		else{
			request.setAttribute("message", "Account invalid");
			System.out.println("INVALID");
			request.getRequestDispatcher(request.getContextPath() + "/");//.forward(request, response);
		}
	}
	
	/*@RequestMapping(value = "/main", method = RequestMethod.POST)
    public String viewProfile(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
		try {
			this.doPost(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println("/main MODULE VIEW CONTROLLER CALLED.");
        return "main";
    }*/

}
