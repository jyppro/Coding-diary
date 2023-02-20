package com.dbshop;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieUtil {

   public static String getCookieValue(String key, HttpServletRequest req) {
      
      String value = null;
      
      Cookie[] cookies = req.getCookies();
      if(cookies != null && cookies.length>0) {
         for(int i=0; i<cookies.length; i++) {
            if(cookies[i].getName().equals(key)) {
               value = cookies[i].getValue();
            }
         }
      }
      return value;
   }
   
   
   public String deleteCookie(String key, HttpServletRequest req, HttpServletResponse res) {
      String result = "Ű�� �´� ��Ű�� ����";
      
      Cookie[] cookies = req.getCookies();
      if(cookies != null && cookies.length>0) {
         for(int i=0; i<cookies.length; i++) {
            if(cookies[i].getName().equals(key)) {
               Cookie cookie = new Cookie(cookies[i].getName(),"");
               cookie.setMaxAge(0);
               res.addCookie(cookie);
               
               result = "�����Ϸ�";
               break;
            }
         }
      }
      return result;
   }
   
   public static String insertCookie(String key, String val, HttpServletResponse res) {
      String result = "�Է½���";
      
      Cookie cookie = new Cookie(key, val);
      res.addCookie(cookie);
      
      result = "�Է¿Ϸ�";
      
      return result;
   }
}