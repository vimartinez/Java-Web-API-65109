package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Saludo")
public class Saludo extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public Saludo() {
		
	}


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nombre = req.getParameter("saludotxt");
		System.out.println("se recibió: "+ nombre);
		resp.getWriter().append("Saludo Get: Hola " + nombre).append(req.getContextPath());
	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nombre = req.getParameter("saludotxt");
		System.out.println("se recibió: "+ nombre);
		resp.getWriter().append("Saludo Post: Hola " + nombre).append(req.getContextPath());
	}
	
	
}
