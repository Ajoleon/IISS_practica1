package pack;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class index
 */
@WebServlet("/Shop")
public class Shop extends HttpServlet {
	private static final String[] productos = {"Pienso para perro. 1 kg","Atún para gatos. 5 kg","Alpiste para pajaro. 1 kg",
			" Comida para peces. Bote de 0.5 kg","Masticador para perro","Arenero para gatos","Pecera","Jaula para pajaros"};
	private static final String [] precios = {"10","5","4","12","25","30","50","40"};
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "";
		HttpSession session = request.getSession(true);
		int seleccion = 0;
		HashMap itemsGuardados = (HashMap) session.getAttribute("itemsGuardados");
		int total = (int) session.getAttribute("total");
		if(request.getParameter("suma")!=null){
			seleccion = Integer.parseInt(request.getParameter("suma"))-1;
			
			if(itemsGuardados!=null){
				System.out.println("añado otro prod");

				Producto pro =(Producto) itemsGuardados.get(seleccion);
				if(pro!=null){
					pro.setCantidad(pro.getCantidad()+1);
					itemsGuardados.put(seleccion, pro);
					total = total + Integer.parseInt(pro.getPrecio());
				}else{
					System.out.println("creo prod ");

					Producto pro1 = new Producto(productos[seleccion],precios[seleccion],seleccion);
					pro1.setCantidad(1);
					itemsGuardados.put(seleccion, pro1);
					total = total + Integer.parseInt(pro1.getPrecio());
				}
				
			}else{
				System.out.println("creo lista");
				itemsGuardados = new HashMap();
				Producto pro = new Producto(productos[seleccion],precios[seleccion],seleccion);
				pro.setCantidad(1);
				itemsGuardados.put(seleccion, pro);
				total = Integer.parseInt(pro.getPrecio());

			}
		url ="/cart.jsp";
		}
		if(request.getParameter("resta")!=null){
			int resta = Integer.parseInt(request.getParameter("resta"));
			System.out.println(resta);
			
				Producto res = (Producto) itemsGuardados.get(resta);
				itemsGuardados.remove(resta);
				total = total - (res.getCantidad()*Integer.parseInt(res.getPrecio()));
				System.out.println("entro");
		url = "/cart.jsp";	
		}
		if(url.equals("")){
			url ="/shop.jsp";
		}
		session.setAttribute("itemsGuardados", itemsGuardados);
		session.setAttribute("total", total);
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