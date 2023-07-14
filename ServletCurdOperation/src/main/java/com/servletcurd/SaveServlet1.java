package com.servletcurd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaveServlet1 extends HttpServlet
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");     
        PrintWriter out=response.getWriter();   
        out.println("<h1>Update Student</h1>"); 
        
        String id1=request.getParameter("id");      
        String name1=request.getParameter("name");      
        String age1=request.getParameter("age");    
        String course1=request.getParameter("course");      
        String city1=request.getParameter("city");      
            
        Student e1=new Student();   
        e1.setId1(id1); 
        e1.setName(name1);     
        e1.setAge1(age1);   
        e1.setCourse1(course1);     
        e1.setCity1(city1);     
            
        int status=StudentData.save(e1);     
        if(status>0)
        {   
            out.print("<p>Record saved successfully!</p>");     
            request.getRequestDispatcher("student.html").include(request, response);    
        }else
        {      
            out.println("Sorry! unable to save record");    
        }   
            
        out.close();    
    }   
        
}
