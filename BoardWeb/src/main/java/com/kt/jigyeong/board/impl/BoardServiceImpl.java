package com.kt.jigyeong.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kt.jigyeong.board.BoardService;
import com.kt.jigyeong.board.BoardVO;
import com.kt.jigyeong.common.LogAdvice;

@Service("boardService")
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardDAOMybatis boardDAO;
	private LogAdvice log;
	
	public void insertBoard(BoardVO vo) {
		System.out.println("insert Service ~~~");
		boardDAO.insertBoard(vo); 
	}

	public void updateBoard(BoardVO vo) {
		boardDAO.updateBoard(vo);
	}

	public void deleteBoard(BoardVO vo) {
		boardDAO.deleteBoard(vo);
	}

	public BoardVO getBoard(BoardVO vo) {
		return boardDAO.getBoard(vo);
	}

	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("getBoardList Service ~~~");
		return boardDAO.getBoardList(vo);
	}
	
}
