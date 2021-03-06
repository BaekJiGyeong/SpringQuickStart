package com.kt.jigyeong.board.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kt.jigyeong.board.BoardVO;

@Repository("boardDAO")
public class BoardDAOMybatis extends SqlSessionDaoSupport{
	@Autowired
	public void setSqlSessionFactory (SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	// CRUD 기능의 메소드 구현
	// 글 등록
	public void insertBoard(BoardVO vo) {
		System.out.println("===> Mybatis 로 insertBoard() 기능 처리");
		getSqlSession().insert("BoardDAO.insertBoard", vo);
	}
	
	// 글 수정
	public void updateBoard(BoardVO vo) {
		System.out.println("===> Mybatis 로 updateBoard() 기능 처리");
		getSqlSession().update("BoardDAO.updateBoard", vo);
	}

	// 글 삭제
	public void deleteBoard(BoardVO vo) {
		System.out.println("===> Mybatis 로 deleteBoard() 기능 처리");
		getSqlSession().delete("BoardDAO.deleteBoard", vo);
	}
	
	// 글 상세 조회
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("===> Mybatis 로 getBoard() 기능 처리");
		return (BoardVO) getSqlSession().selectOne("BoardDAO.getBoard", vo);
	}
	
	// 글 목록 조회
	public List<BoardVO> getBoardList(BoardVO vo){
		return getSqlSession().selectList("BoardDAO.getBoardList", vo);
		
	}
}
