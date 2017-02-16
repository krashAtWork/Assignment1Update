package packageV2;

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet(urlPatterns = { "/loginServlet", "/signupScreen" })
public class ToSignUp extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*
		 * boolean uniqueFlag = true; boolean emptyFlag = false; String path =
		 * request.getServletPath();// obtain path
		 */
		doPost(request, response);

	}

	/*
	 * if (path.equals("/listCntrl")) {
	 * 
	 * 
	 * // get the username from form String newUserName =
	 * request.getParameter("Username");
	 * if (newUserName.isEmpty()) { // another jsp saying username is empty
	 * System.out.println("username is empty"); emptyFlag = true; }
	 */
	/*
	 * add it to a list list -LinkedhashSet because it gives the list in the
	 * same order as it is added and set interface ensures there are unique
	 * elements
	 */
	/*
	 * Set<String> validUsers = new LinkedHashSet<String>();
	 * 
	 * // create a dummy table validUsers.add("Krashagi");
	 * validUsers.add("Kushagra"); validUsers.add("Mummy");
	 * validUsers.add("Papa");
	 */
	// only allow the newUsername if it is not empty, check if list is
	// empty if yes add straight away

	/**if(emptyFlag==false)

	{
		 * 
		 * if (validUsers.isEmpty()) { validUsers.add(newUserName); } else { //
		 * else check if this username already exists in a list
		 * 
		 * for (final String valUser : validUsers) { if
		 * (newUserName.equals(valUser)) {
		 * System.out.println("Username already exists"); uniqueFlag = false;
		 * System.out.println(uniqueFlag); } } } if (uniqueFlag == true) {
		 * System.out.println(uniqueFlag + "user is unique added");
		 * validUsers.add(newUserName);
		 * 
		 * }
		 * 
		 * for (String valUser : validUsers) { System.out.println(valUser);
		 * 
		 * }
		 * 
		 * }**
	String destination = "signUpList.jsp";
	RequestDispatcher rd =
		 * request.getRequestDispatcher(destination); rd.forward(request,
		 * response);
	}**}*

	**/

	protected void doPost(HttpServletRequest request, HttpServletResponse
			response) throws ServletException, IOException { 
			String destination = "signUpPage.jsp";
			RequestDispatcher rd = request.getRequestDispatcher(destination);
			rd.forward(request, response);		 
		}
}
