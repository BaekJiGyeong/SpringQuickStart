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
	
	// CRUD ����� �޼ҵ� ����
	// �� ���
	public void insertBoard(BoardVO vo) {
		System.out.println("===> Mybatis �� insertBoard() ��� ó��");
		getSqlSession().insert("BoardDAO.insertBoard", vo);
	}
	
	// �� ����
	public void updateBoard(BoardVO vo) {
		System.out.println("===> Mybatis �� updateBoard() ��� ó��");
		getSqlSession().update("BoardDAO.updateBoard", vo);
	}

	// �� ����
	public void deleteBoard(BoardVO vo) {
		System.out.println("===> Mybatis �� deleteBoard() ��� ó��");
		getSqlSession().delete("BoardDAO.deleteBoard", vo);
	}
	
	// �� �� ��ȸ
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("===> Mybatis �� getBoard() ��� ó��");
		return (BoardVO) getSqlSession().selectOne("BoardDAO.getBoard", vo);
	}
	
	// �� ��� ��ȸ
	public List<BoardVO> getBoardList(BoardVO vo){
		return getSqlSession().selectList("BoardDAO.getBoardList", vo);
		
	}
}