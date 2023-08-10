package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//PrintWriter
		PrintWriter pw=res.getWriter();
		//set res type
		res.setContentType("text/html");
		//read form Data
		
		String name=req.getParameter("name");
		String dob=req.getParameter("dob");
		String gender=req.getParameter("gender");
		String qlfy=req.getParameter("qlfy");
		String[] hobbies=req.getParameterValues("hb");
		
		List al=Arrays.asList(hobbies);
		
		//add bootstrap
		pw.println("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css\">\r\n"
				+ "\r\n"
				+ "<!-- jQuery library -->\r\n"
				+ "<script src=\"https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js\"></script>\r\n"
				+ "\r\n"
				+ "<!-- Popper JS -->\r\n"
				+ "<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"></script>\r\n"
				+ "\r\n"
				+ "<!-- Latest compiled JavaScript -->\r\n"
				+ "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js\"></script>");
		
		pw.println("<div style='width:600px;   margin:auto;   margin-top:50px; '>");
		pw.println("<table class='table table-hover table-striped'>");
		pw.println("<tr>");
		pw.println("<td>Name: </td>");
		pw.println("<td>"+name+"</td>");
		pw.println("</tr>");
		
		pw.println("<tr>");
		pw.println("<td>Date of Birth: </td>");
		pw.println("<td>"+dob+"</td>");
		pw.println("</tr>");
		
		
		pw.println("<tr>");
		pw.println("<td>Gender:</td>");
		pw.println("<td>"+gender+"</td>");
		pw.println("</tr>");
		
		pw.println("<tr>");
		pw.println("<td>Qualification:</td>");
		pw.println("<td>"+qlfy+"</td>");
		pw.println("</tr>");
		
	
		
		pw.println("<tr>");
		pw.println("<td>Hobbies:</td>");
		pw.println("<td>"+al+"</td>");
		pw.println("</tr>");
		
		pw.print("<br>");
		
//		pw.print("name:"+name+"<br>");
//		pw.print("Date of Birth: "+dob+"<br>");
//		pw.print("Gender: "+gender+"<br>");
//		pw.print("Qualification: "+qlfy+"<br>");
//		pw.print("Hobbies: "+al+"<br>");	
		
		pw.println("</div>");
		pw.close();
		}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}

}
