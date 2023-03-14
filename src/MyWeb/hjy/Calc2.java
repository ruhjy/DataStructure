package com.hjy;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/calc2")
public class Calc2 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ServletContext application = request.getServletContext();
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		String v_ = request.getParameter("v");
		String op = request.getParameter("operator");
		
		int v = 0, result = 0;
		if(v_ != null && !v_.equals("")) {
			v = Integer.parseInt(v_);
		}
		
		if(op.equals("=")) {
			int x = (Integer)application.getAttribute("value");
			int y = v;
			String operator = (String)application.getAttribute("operator");
			if(operator.equals("+")) {
				result = x + y;
			} else {
				result = x - y;
			}
			response.getWriter().println("result = " + result);
		} else {
			application.setAttribute("value", v);
			application.setAttribute("operator", op);
		}
		

	}
}
