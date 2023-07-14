package com.servletcurd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentData
{
	public static Connection getConnection() 
	{
		Connection con1=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			
		}
		catch(Exception e1) 
		{
			System.out.println(e1);
		}
		return con1;
	}
	public static int save(Student e1) 
	{
		int status=0;

		try 
		{
			Connection con1=Student.getConnection();
		    PreparedStatement ps1=con1.prepareStatement("insert into student(id,name,age,course,city) values (?,?,?,?,?)");    
			
		    
		    ps1.setInt(1,e1.getId1());
            ps1.setString(2,e1.getName1());     
            ps1.setString(3,e1.getAge1());      
            ps1.setString(4,e1.getCourse1());   
            ps1.setString(5,e1.getCity1());     
                
            status=ps1.executeUpdate();     
                
            con1.close();   
		}
		catch(Exception ex1) 
		{
			ex1.printStackTrace();
		}
		
		return status;
	}	
	
	public static int update1(Student e1)
	{      
        int status=0;   
        try{    
            Connection con1=StudentData.getConnection();     
            PreparedStatement ps1=con1.prepareStatement("update student set id=?, name=?,age=?,course=?,city=? where id=?");     
                           
            ps1.setString(1,e1.getId1());   
            ps1.setString(2,e1.getName());     
            ps1.setString(3,e1.getAge1());      
            ps1.setString(4,e1.getCourse1());   
            ps1.setString(5,e1.getCity1());     
                
                
            status=ps1.executeUpdate();     
                
            con1.close();   
        }   
        catch(Exception ex1) 
        
        {
        	ex1.printStackTrace();
        } 
        
        return status;  
       
	    }
		public static int delete1(int id1) 
		{
			int status=0; 
			try 
			{
				Connection con1=StudentData.getConnection();     
	            PreparedStatement ps1=con1.prepareStatement("delete from student where id=?");      
	            ps1.setInt(1,id1);      
	            status=ps1.executeUpdate();
	            con1.close(); 
			}
			catch(Exception e1) 
			{
				e1.printStackTrace();
			}
			return status;
		}
		
		public static Student getStudentById(int id1) throws SQLException 
		{
			 
		   Student student = new Student();
		   try
		   {
			   Connection con1=StudentData.getConnection();
			   PreparedStatement ps1=con1.prepareStatement("select * from student where id=?");
			   ps1.setInt(1,id1);
			   ResultSet rs1=ps1.executeQuery();
			   
			   if(rs1.next()) 
			   {
				   student.setId1(rs1.getString(1));    
				   student.setName(rs1.getString(2));      
				   student.setAge1(rs1.getString(3));   
				   student.setCourse1(rs1.getString(4));    
				   student.setCity1(rs1.getString(5));
				   
			   }
			   con1.close();
			   
		   }
			catch(Exception ex1) 
		   {
				{
				  ex1.printStackTrace();
				} 
		   }
		   return student;
		  }
		   public static List<Student> getAllStudent()
		   {
			   List<Student>list=new ArrayList<Student>(); 
			   try 
			   {
				   Connection con1=StudentData.getConnection() ;
				   PreparedStatement ps1=con1.prepareStatement("select * from student where id=?"); 
				   ResultSet rs1=ps1.executeQuery(); 
				   while(rs1.next()) 
				   {
					   Student e1=new Student() ;
					   e1.setId1(rs1.getString(1));    
		                e1.setName(rs1.getString(2));      
		                e1.setAge1(rs1.getString(3));   
		                e1.setCourse1(rs1.getString(4));    
		                e1.setCity1(rs1.getString(5));
		                list.add(e1);
				   }
				   con1.close();
				   
			   }
			   catch(Exception e1)
			   {
				   e1.printStackTrace();
			   }
		        return list; 
		   }
}
