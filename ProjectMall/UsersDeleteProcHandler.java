package com.dbshop;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UsersDeleteProcHandler implements DbshopHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
	    UsersDto usersDto = (UsersDto)session.getAttribute("userInfo");
	   
	    Dao dao = new Dao();
	    int result = dao.deleteUsers(usersDto.getId());
	    
	    if(result==1) {
	    	session.invalidate();
	    }
		
		return "Main.do";
	}

}
