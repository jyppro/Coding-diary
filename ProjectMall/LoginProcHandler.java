package com.dbshop;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginProcHandler implements DbshopHandler {

   @Override
   public String process(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {

      String id = request.getParameter("id");
      String pw = request.getParameter("pw");
      
      String save = request.getParameter("save");
            

      Dao dao = new Dao();
      UsersDto usersDto = dao.login(id, pw);
      
      //======================================
   
      
      String goPage = null;
      if(usersDto.getIdx() > 0) { 
         HttpSession session = request.getSession();
         
         if(save == null && usersDto.getIdx() != 0) { 
            Cookie cookie = new Cookie("saveid",usersDto.getId());
            cookie.setMaxAge(0);
            response.addCookie(cookie);
            session.setAttribute("userInfo", usersDto);
         }else if(save != null && save.equals("true") && usersDto.getIdx() != 0) {   
            Cookie cookie = new Cookie("saveid",usersDto.getId());
            cookie.setMaxAge(60*60*24*7);
            response.addCookie(cookie);
            session.setAttribute("userInfo", usersDto);
         }
         
         if(usersDto.getUseyn() == 2){
            goPage = "/userDrop.jsp";
         }else{
            session.setAttribute("userInfo", usersDto); 
            goPage = "redirect:/Main.do";
         }
      }else {
         goPage = "/loginerr.jsp";
      }
      return goPage;
   }

}