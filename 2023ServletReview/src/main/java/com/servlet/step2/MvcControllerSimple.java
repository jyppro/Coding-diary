package com.servlet.step2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calcServlet")
public class MvcControllerSimple extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int  num1,num2;
		int result;
		String op;
		
		num1 = Integer.parseInt(request.getParameter("n1"));
		num2 = Integer.parseInt(request.getParameter("n2"));
		op = request.getParameter("operator");

		result = calc(num1,num2,op);		

		 request.setAttribute("result", result);
		  
		 RequestDispatcher dispatcher = request.getRequestDispatcher("step2/calcResultView.jsp");
		 dispatcher.forward(request, response);
		  
	}

	public int calc(int num1, int num2, String op) {
		int result = 0;

		if(op.equals("+")) {
			result = num1 + num2;
		}
		else if(op.equals("-")) {
			result = num1 - num2;
		}
		else if(op.equals("*")) {
			result = num1 * num2;
		}
		else if(op.equals("/")) {
			result = num1 / num2;
		}
		return result;
	}
	
}
