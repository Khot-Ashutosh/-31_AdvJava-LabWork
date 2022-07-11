package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac.service.RegisterService2;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		long mobileNo = Long.parseLong(request.getParameter("mobileNo"));
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		PrintWriter out = response.getWriter();
		out.write("<html><body>");
		
		RegisterService2 registerService2 = new RegisterService2();
		boolean present = registerService2.isCustomerPresent(email);
		
		if(present) {
			out.print("<h1><h1>It seems you are already a registered user!</h1> ");
		}else {
			registerService2.register(name, email, mobileNo, username, password);
			out.write("<h1>Registration successful!</h1>");
		}
		out.write("</body></html>");
	}

}
