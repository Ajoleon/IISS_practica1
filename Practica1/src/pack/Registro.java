package pack;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class Registro
 */
@WebServlet("/Registro")
public class Registro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub	
		//Leemos parametros
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		String url = new String("");
		if(user.equals("admin") && pass.equals("admin")){
			HttpSession session = request.getSession(true);
			session.setAttribute("name","administrador");
			
			url = "/Admin.jsp";
		}else{
			
		
			HttpSession session = request.getSession(true );
			session.setAttribute("nombre",user);
			url = "/registro.jsp";
			// Primero se comprueba si existe si la sesion tiene un usuario
			
			
		
		}
		getServletContext().getRequestDispatcher(url).forward(request, response);	

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
