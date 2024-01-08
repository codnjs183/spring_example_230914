package com.example.lesson03.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Review {
	private int id;
	private int storeId;
	private String menu;
	private String userName;
	private Double point; // null 허용이므로 점수가 반드시 들어오지 않을 수 있다 >> double 대신 Double 사용
	private String review;
	private Date createdAt;
	private Date updatedAt;
}
