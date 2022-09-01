package com.saeyan.dto;

public class BoardDAO {
	private BoardDAO() {
		
	}
	public static BoardDAO instance = new BoardDAO();
	public static BoardDAO getInstance() {
		return instance;
	}
}
