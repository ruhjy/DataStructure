package com.hjy;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/calc")
public class Calc extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();

		String x_ = request.getParameter("x");
		String y_ = request.getParameter("y");
		String operator = request.getParameter("operator");

		int x = 0, y = 0, result = 0;

		if (x_ != null && !x_.equals(""))
			x = Integer.parseInt(x_);
		if (y_ != null && !y_.equals(""))
			y = Integer.parseInt(y_);

		if (operator.equals("덧셈"))
			result = x + y;
		if (operator.equals("뺄셈"))
			result = x - y;
		
		
			out.println("result = " + result);
		

	}
}
