package com.springbook.biz.board;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {
	public static void main(String[] args) {
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		BoardService boardService = (BoardService)container.getBean("boardService");
		BoardVO vo = new BoardVO("임시제목", "홍길동", "임시내용.........");
		boardService.insertBoard(vo);
	}
}
