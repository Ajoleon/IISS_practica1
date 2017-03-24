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
 * Servlet implementation class index
 */
@WebServlet("/Nuevo")
public class Nuevo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String tlf = request.getParameter("tlf");
		String dir = request.getParameter("dir");
		String email = request.getParameter("email");
		HttpSession session = request.getSession(true );
		String user = (String)session.getAttribute("nombre");
		Cookie c = new Cookie("emailCookie", email); 
		c.setMaxAge(60*60*24*365*2);
		c.setPath("/");
		response.addCookie(c);
		UsuarioDTO usuario  = new UsuarioDTO(user,email,dir,tlf);
		session.setAttribute("usuario", usuario);
		session.setAttribute("total", 0);
		String url = "/shop.jsp";
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
