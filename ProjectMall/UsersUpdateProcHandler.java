package com.dbshop;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UsersUpdateProcHandler implements DbshopHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String zipCode = request.getParameter("zipCode");
		String address = request.getParameter("address");
		String address2 = request.getParameter("address2");
		String phone = request.getParameter("phone");
		
		UsersDto usersDto = new UsersDto(id, pw, name, email, zipCode, address, address2, phone);
		Dao dao = new Dao();
		dao.updateUsers(usersDto);
		
		
		return "Main.do";
	}

}
