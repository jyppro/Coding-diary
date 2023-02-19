package com.dbshop;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public Controller() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String cmd = request.getRequestURI();
		cmd = cmd.substring(cmd.lastIndexOf("/"));

		DbshopHandler handler = null;

		if (cmd.equals("/Join.do")) {
			handler = new JoinHandler();
		} else if (cmd.equals("/Login.do")) {
			handler = new LoginHandler();
		} else if (cmd.equals("/LoginProc.do")) {
			handler = new LoginProcHandler();
		} else if (cmd.equals("/Logout.do")) {
			handler = new LogoutHandler();
		} else if (cmd.equals("/MyPage.do")) {
			handler = new MyPageHandler();
		} else if (cmd.equals("/MainKind.do")) {
			handler = new MainKindHandler();
		} else if (cmd.equals("/Tos.do")) {
			handler = new TosHandler();
		} else if (cmd.equals("/UsersUpdate.do")) { 
			handler = new UsersUpdateHandler();
		} else if (cmd.equals("/UsersUpdateProc.do")) {
			handler = new UsersUpdateProcHandler();
		} else if (cmd.equals("/UsersDeleteProc.do")) {
			handler = new UsersDeleteProcHandler();
		} else {
			handler = new MainHandler();
		}

		if (!cmd.equals("/CheckIdAjax.do")) {
			String viewPage = handler.process(request, response);
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);
		}
	}

}