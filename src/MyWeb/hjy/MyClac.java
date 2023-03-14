package com.hjy;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/myclac")
public class MyClac extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ServletContext application = request.getServletContext();
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");

		String param1 = request.getParameter("v");
		String param2 = request.getParameter("operator");

		int value = 0, result = 0;

		if (param1 != null && !param1.equals("")) {
			value = Integer.parseInt(param1);
		}

		if (param2.equals("=")) {
			int x = (Integer) application.getAttribute("value");
			int y = value;
			String oper = (String) application.getAttribute("operator");
			if (oper.equals("+")) {
				result = x + y;
			} else if (oper.equals("-")) {
				result = x - y;
			} else if (oper.equals("/")) {
				result = x / y;
			} else {
				result = x * y;
			}

			response.getWriter().println("result is " + result);
		} else {
			application.setAttribute("value", value);
			application.setAttribute("operator", param2);
		}

	}
}
