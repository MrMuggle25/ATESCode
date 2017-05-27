package ph.com.alliance.controller.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Example controller class that hadles static view requests.
 * All requests that returns pages (html, xhtml, jsp, jspx, etc.) is handled here. 
 *
 */
@Controller
@RequestMapping("/login")
public class LoginController {
	

	/**
	 * 
	 * @param request
	 * @param response
	 * @param map
	 * @return
	 */
	
	/*@RequestMapping(method=RequestMethod.GET)
    public String viewLoginPage(HttpServletRequest request, HttpServletResponse response, ModelMap map){
    	 	
		return "login";
    }*/
	
	/*@RequestMapping(method=RequestMethod.GET)
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	// Create a session object if it is already not  created.
		HttpSession session = request.getSession(true);
		// Get session creation time.
		Date createTime = new Date(session.getCreationTime());
		// Get last access time of this web page.
		Date lastAccessTime = 
		                new Date(session.getLastAccessedTime());
		
		String title = "Welcome Back to my website";
		Integer visitCount = new Integer(0);
		String visitCountKey = new String("visitCount");
		String userIDKey = new String("userID");
		String userID = new String("ABCD");
		
		// Check if this is new comer on your web page.
		if (session.isNew()){
		 title = "Welcome to my website";
		 session.setAttribute(userIDKey, userID);
		} else {
		 visitCount = (Integer)session.getAttribute(visitCountKey);
		 visitCount = visitCount + 1;
		 userID = (String)session.getAttribute(userIDKey);
		}
		session.setAttribute(visitCountKey,  visitCount);
		
		// Set response content type
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		return "login";
	}*/
	@RequestMapping(value = "/main", method = RequestMethod.GET)
    public String goToMain(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
    	System.out.println("@/login/main MODULE VIEW CONTROLLER CALLED.");
        return "main";
    }
	
	@RequestMapping(value = "/loginAccount", method = RequestMethod.POST)
    public void loginAccount(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
    	System.out.println("@/login/loginAccount MODULE VIEW CONTROLLER CALLED.");
    	String idnumber = request.getParameter("idnumber");
		String password = request.getParameter("password");
		System.out.println("ID Numebr: " + idnumber);
		System.out.println("Passwprd: " + password);
		if(null != idnumber && null != password){
			if(idnumber.length() == 3 && password.equals("glaiza")){
				HttpSession session = request.getSession();
				session.setAttribute("idnumber", idnumber);
				System.out.println("DO POST CALLED");
				try {
					response.sendRedirect(request.getContextPath() + "/login/main");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//return "main";
			}
			else{
				request.setAttribute("message", "Account invalid");
				try {
					request.getRequestDispatcher("/").forward(request, response);
				} catch (ServletException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		else{
			System.out.println("NULL FIELDS");
		}
		//return "login";
        
    }
	
	@RequestMapping(value = "/logout", method = RequestMethod.POST)
    public String logoutAccount(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
    	System.out.println("@/login/logout MODULE VIEW CONTROLLER CALLED.");
        return "logout";
    }
	
    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String viewProfile(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
    	System.out.println("@/modulename/profile MODULE VIEW CONTROLLER CALLED.");
        return "profile";
    }
    
    /**
     * 
     * @param request
     * @param response
     * @param map
     * @return
     */
    @RequestMapping(value = "/messages", method = RequestMethod.GET)
    public String viewMessages(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
    	System.out.println("@/modulename/messages MODULE VIEW CONTROLLER CALLED.");
        return "messages";
    }
    
    /**
     * 
     * @param request
     * @param response
     * @param map
     * @return
     */
    @RequestMapping(value = "/userform", method = RequestMethod.GET)
    public String viewUserForm(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
    	System.out.println("@/modulename/userform MODULE VIEW CONTROLLER CALLED.");
        return "userform";
    }
}
