package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmpServlet
 */
@WebServlet("/EmpServlet")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","ashutosh","cdac123");
			PreparedStatement st = con.prepareStatement("select * from emp");
			
			ResultSet rs = st.executeQuery();
			PrintWriter out = response.getWriter();
			out.write("<html><body>");
			out.write("<table border=1 width=25% height=25%>");  
            out.write("<tr><th>empid</th><th>empname</th>");
			
            while(rs.next()) {
            	int s1= rs.getInt("empid");
				String s2= rs.getString("empname");
				
				out.write("<tr><td>" + s1 + "</td><td>" + s2 + "</td></tr>");
				out.write("</table");
				out.write("</html></body>");
            }
			
		}catch(Exception e) {
			
		}finally {
			try {
				con.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
		}
	}

}
