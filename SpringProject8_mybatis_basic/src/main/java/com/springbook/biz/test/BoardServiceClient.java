package com.springbook.biz.test;


import java.util.List;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;



public class BoardServiceClient {
	public static void main(String[] args) {
		
		BoardDAO boardDAO = new BoardDAO();
		BoardVO vo = new BoardVO();
		vo.setTitle("my11111");
		vo.setWriter("홍길동");
		vo.setContent("myBatis 내용입니다.....");
		boardDAO.insertBoard(vo);
		

		List<BoardVO> boardList = boardDAO.getBoardList(vo);
		for (BoardVO board : boardList) {
			System.out.println("---> " + board.toString());
		}		
		

	}
}