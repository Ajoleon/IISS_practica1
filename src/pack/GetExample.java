package pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 public class GetExample extends HttpServlet {
	 
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
		 PrintWriter out = response.getWriter(); out.println("<html><head><title>Servlet Test</title></head>"); out.println("<body ><center><h1> THIS IS A SERVLET TEST </h1>");
		 String answer = request.getParameter("username");
		 out.println("<h2> The username is: " + answer + "</h2>");
		 Date date = new Date();
		 out.println("<h3>The time at the server is " + date.toString() +"</h3>"); out.println("</center></body></html>");
		 out.close();
	}
 }
	
