package com.example.lesson03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson03.domain.Review;
import com.example.lesson03.mapper.ReviewMapper;

@Service
public class ReviewBO {
	
	@Autowired
	private ReviewMapper reviewMapper;
	
	// input: id
	// output: Review 테이블
	
	// select일 경우, BO 클래스의 메소드명은 get으로 시작하는 경우가 많다.
	public Review getReview(int id) {
		return reviewMapper.selectReview(id);
	}
}
