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
	
	// input: Review			output: 성공한 행의 개수(int)
	// insert의 경우 BO 클래스의 메소드명은 add로 시작하는 경우가 많다.
	public int addReview(Review review) {
		return reviewMapper.insertReview(review);
	}
	
//	reviewBO.addReviewAsField(4, "콤비네이션R", "바다", 5.0, "역시 맛있다!");
	public int addReviewAsField(int storeId, String menu, String userName, Double point, String review) {
		return reviewMapper.insertReviewAsField(storeId, menu, userName, point, review);
	}
	
	public int updateReviewById(int id, String review) {
		return reviewMapper.updateReviewById(id, review);
	}
	
	// input: id			output: x
	public void deleteReviewById(int id) {
		reviewMapper.deleteReviewById(id);
	}
}
