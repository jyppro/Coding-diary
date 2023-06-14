package com.springbook.view.user;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

@Controller
public class LoginController {

	@RequestMapping("/login.do")
	public String login(UserVO vo, UserDAO userDAO) {
		if (userDAO.getUser(vo) != null)
			return "getBoardList.do";
		else
			return "login.jsp";
	}
	
//	@RequestMapping("/login.do")
//	public ModelAndView login(HttpServletRequest request) {
//		String id = request.getParameter("id");
//		String password = request.getParameter("password");
//
//		UserVO vo = new UserVO();
//		vo.setId(id);
//		vo.setPassword(password);
//
//		UserDAO userDAO = new UserDAO();
//		UserVO user = userDAO.getUser(vo);
//
//		ModelAndView mav = new ModelAndView();
//		if (user != null) {
//			mav.setViewName("redirect:getBoardList.do"); 
//		} else {
//			mav.setViewName("redirect:login.jsp"); 
//		}
//		return mav;
//
//	}	
	

}
