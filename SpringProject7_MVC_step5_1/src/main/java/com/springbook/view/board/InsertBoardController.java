package com.springbook.view.board;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
public class InsertBoardController{
	
		
	  @RequestMapping(value="/insertBoard.do") 
	  public String insertBoard(BoardVO vo, BoardDAO boardDAO) { 
		  boardDAO.insertBoard(vo); 
		  return "getBoardList.do";
	  }
	 
	
//	  @RequestMapping(value="/insertBoard.do") 
//	  public ModelAndView insertBoard(BoardVO vo, BoardDAO boardDAO) {
//		  boardDAO.insertBoard(vo); 
//		  ModelAndView mav = new ModelAndView();
//			mav.setViewName("redirect:getBoardList.do");
//			return mav;
//		 
//	  }	 
	
	
//	  @RequestMapping(value="/insertBoard.do") 
//	  public String  insertBoard(HttpServletRequest request) { 
//		  String title = request.getParameter("title"); 
//		  String writer =request.getParameter("writer");
//		  String content =request.getParameter("content"); 
//		  BoardVO vo = new BoardVO();
//		  vo.setTitle(title); 
//		  vo.setWriter(writer); 
//		  vo.setContent(content);
//		  BoardDAO boardDAO = new BoardDAO(); 
//		  boardDAO.insertBoard(vo); 
//		  return "getBoardList.do"; 
//	  }
	 	
}
