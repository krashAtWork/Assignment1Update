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

@WebServlet("/ToDisplayList")
public class ToDisplayList extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Set<String> validUsers = new LinkedHashSet<String>();// create a dummy
																// table
		validUsers.add("Krashagi");
		validUsers.add("Kushagra");
		validUsers.add("Mummy");
		validUsers.add("Papa");

		String newUserName = request.getParameter("Username");// get the
																// username from
																// form
		if (newUserName.isEmpty()) { // another jsp saying username is empty
			request.setAttribute("error", "username is empty");
			System.out.println("username is empty");
			String destination = "error.jsp";
			RequestDispatcher rd = request.getRequestDispatcher(destination);
			rd.forward(request, response);
			

		} else {
			boolean added = validUsers.add(newUserName);
			if (added) {
				request.setAttribute("added", validUsers);
				System.out.println("Username was unique, u received a wand");
				String destination = "signUpList.jsp";
				RequestDispatcher rd = request.getRequestDispatcher(destination);
				rd.forward(request, response);
				for (String valUser : validUsers) {
					System.out.println(valUser);
				}

			} else {
				request.setAttribute("error", "duplicate user");
				System.out.println("duplicate user");
				String destination = "error.jsp";
				RequestDispatcher rd = request.getRequestDispatcher(destination);
				rd.forward(request, response);
			}

		}
	}
}
