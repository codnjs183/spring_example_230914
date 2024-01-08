package com.example.lesson07;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson07.entity.StudentEntity;

@RestController
@RequestMapping("/lesson07/ex01")
public class Lesson07Ex01RestController {

	// U: update
	@GetMapping("/2")
	public StudentEntity update() {
		// id가 5번인 dreamJob 변경
	}
	
}
