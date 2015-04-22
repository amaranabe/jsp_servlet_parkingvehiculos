package com.zubiri.jsp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BorrarVehiculo
 */
@WebServlet("/borrarvehiculo.jr")
public class BorrarVehiculo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    //public BorrarVehiculo() {
     //   super();
        // TODO Auto-generated constructor stub
    //}
	
	public void init()
	{
		System.out.println("Iniciando Borrar Vehiculo");

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType( "text/html; charset=iso-8859-1" );
		PrintWriter out = response.getWriter();

		
		String matricula = request.getParameter("matricula");
		System.out.println("la matricula es:" + matricula);
		
	}
	
	public void destroy()
	{
		System.out.println("Destruyendo Borrar Vehiculo");

	}

}
