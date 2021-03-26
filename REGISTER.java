package com.mona.servlets;

import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.io.PrintWriter;
//import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class REGISTER
 */
@WebServlet("/REGISTER")
public class REGISTER extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private RegisterDAO dao=new RegisterDAO();

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//doGet(request, response);
		String uname=request.getParameter("uname");
		String password=request.getParameter("password");
		String cno=request.getParameter("cno");
		String email=request.getParameter("email");
		Mem member=new Mem(uname,password,cno,email);
		/*member.setUname(uname);
		member.setPassword(password);
		member.setContact(cno);
		member.setEmail(email);*/
		try 
		{
			dao.reg(member);
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		RequestDispatcher dis=request.getRequestDispatcher("/memResult.jsp");
		dis.forward(request,response);
		
	}

}
