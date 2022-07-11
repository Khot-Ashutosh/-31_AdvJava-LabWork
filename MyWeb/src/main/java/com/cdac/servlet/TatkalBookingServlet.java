package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TatkalBookingServlet
 */
//@WebServlet("/TatkalBookingServlet")
public class TatkalBookingServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		ServletConfig cfg = getServletConfig();
		int startTime = Integer.parseInt(cfg.getInitParameter("startTime"));
		//int startTime = 11;
		
		LocalTime time = LocalTime.now();
		int timeRightNow = time.getHour();
		
		if(timeRightNow >= startTime)
			out.write("<h1>You can proceed to booking...</h1>");
		else
			out.write("<h1>Booking is not available right now..</h1>");
			
	}

}
