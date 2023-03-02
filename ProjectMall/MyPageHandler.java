package com.dbshop;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyPageHandler implements DbshopHandler {

   @Override
   public String process(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {

      String idx = request.getParameter("idx"); 
      String pw = request.getParameter("pw");
      
      HttpSession session = request.getSession();
      UsersDto usersDto = (UsersDto)session.getAttribute("userInfo");
      
      Dao dao = new Dao();
      boolean result = dao.pwChk(idx, usersDto.getId(), pw);
      
      String goPage = "";
      if(result == true) {
         usersDto = dao.getMyInfo(usersDto.getId());
         request.setAttribute("usersDto", usersDto);
         
         goPage = "/myPage.jsp";
      }else {
         goPage = "/pwchkerr.jsp";
      }
      return goPage;
   }

}