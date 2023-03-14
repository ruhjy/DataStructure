package com.hjy;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/calc3")
public class Calc3 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ServletContext application = request.getServletContext();
		HttpSession session = request.getSession();
		
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		String v_ = request.getParameter("v");
		String op = request.getParameter("operator");
		
		int v = 0, result = 0;
		if(v_ != null && !v_.equals("")) {
			v = Integer.parseInt(v_);
		}
		
		if(op.equals("=")) {
			int x = (Integer)session.getAttribute("value");
			int y = v;
			String operator = (String)session.getAttribute("operator");
			if(operator.equals("+")) {
				result = x + y;
			} else {
				result = x - y;
			}
			response.getWriter().println("result = " + result);
		} else {
			session.setAttribute("value", v);
			session.setAttribute("operator", op);
		}
		

	}
}
