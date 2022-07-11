package com.cdac.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac.service.LoginService;


@WebServlet("/login.cdac")
public class Login extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		LoginService loginService = new LoginService();
		
		boolean isValid = loginService.loginCheck(username,password);
		
		if(isValid) {
			response.sendRedirect("Welcome.html");
		}else {
			response.sendRedirect("Login.html");
		}
	}

}
