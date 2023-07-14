package com.servletcurd;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteServlet extends HttpServlet
{

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		String sid=request.getParameter("id");  
        int id1=Integer.parseInt(sid);   
        StudentData.delete1(id1);  
        response.sendRedirect("ViewServlet"); 
	}
}
