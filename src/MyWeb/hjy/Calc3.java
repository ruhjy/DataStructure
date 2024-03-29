package com.hjy;

import java.io.IOException;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/calc3")
public class Calc3 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Cookie[] cookies = request.getCookies();

		String value = request.getParameter("value");
		String operator = request.getParameter("operator");
		String dot = request.getParameter("dot");

		String exp = "";

		if (cookies != null) {
			for (Cookie c : cookies) {
				if (c.getName().equals("exp")) {
					exp = c.getValue();
					break;
				}
			}
		}

		if (operator != null && operator.equals("=")) {

			ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
			try {
				exp = String.valueOf(engine.eval(exp));
			} catch (ScriptException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (operator != null && operator.equals("C")) {
			exp = "";
		} else {
			exp += (value == null) ? "" : value;
			exp += (operator == null) ? "" : operator;
			exp += (dot == null) ? "" : dot;
		}

		Cookie expCookie = new Cookie("exp", exp);
		
		if(operator != null && operator.equals("C")) {
			expCookie.setMaxAge(0);
		}
		response.addCookie(expCookie);
		response.sendRedirect("calcpage");

//		Cookie[] cookies = request.getCookies();
//
//		String value = request.getParameter("value");
//		String operator = request.getParameter("operator");
//		String dot = request.getParameter("dot");
//
//		String exp = "";
//		if (cookies != null) {
//			for (Cookie c : cookies) {
//				if (c.getName().equals("exp")) {
//					exp = c.getValue();
//					break;
//				}
//			}
//		}
//
//		if (operator != null && operator.equals("=")) {
//			ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
//			try {
//				exp = String.valueOf(engine.eval(exp));
//			} catch (ScriptException e) {
//				e.printStackTrace();
//			}
//
//		} else {
//			exp += (value == null) ? "" : value;
//			exp += (operator == null) ? "" : operator;
//			exp += (dot == null) ? "" : dot;
//		}
//
//		Cookie expCookie = new Cookie("exp", exp);
//
//		response.addCookie(expCookie);
//		response.sendRedirect("calcpage");
	}
}
