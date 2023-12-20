package com.example.lesson03.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.lesson03.domain.Review;

@Repository
public interface ReviewMapper {
	
	// input: id output: review
	public Review selectReview(int id);
	
	public int insertReview(Review review);
	
	public int insertReviewAsField(
			@Param("storeId") int storeId,
			@Param("menu") String menu,
			@Param("userName") String userName,
			@Param("point") Double point,
			@Param("review") String review
			);
	
	public int updateReviewById(
			@Param("id") int id,
			@Param("review") String review
			);

	public int deleteReviewById(int id);
}
