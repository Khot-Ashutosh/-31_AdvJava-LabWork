package com.cdac.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac.service.LoginService;


@WebServlet("/Login2")
public class Login2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		LoginService loginService = new LoginService();
		boolean isValid = loginService.loginCheck(username,password);
		
		if(isValid) {
			String rememberMe = request.getParameter("rememberMe");
			if(rememberMe != null && rememberMe.equals("yes")){
				Cookie c1 = new Cookie("uname",username);
				c1.setMaxAge(60*60);
				Cookie c2 = new Cookie("pass",password);
				c2.setMaxAge(60*60);
				response.addCookie(c1);
				response.addCookie(c2);
			}
			response.sendRedirect("Welcome.html");
		}
		else
		response.sendRedirect("Login2.html");
	}

}
