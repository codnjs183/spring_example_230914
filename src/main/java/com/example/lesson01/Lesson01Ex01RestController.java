package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/ex01")
@RestController
public class Lesson01Ex01RestController {

	// url: http://localhost/lesson01/ex01/3
	@RequestMapping("/3")
	public String ex01_3() {
		return "@RestController 사용해서 String을 리턴 해본다.";
	}
	
	// url: http://localhost/lesson01/ex01/4
	@RequestMapping("/4")
	public Map<String, Object> ex01_4() {
		Map<String, Object> map = new HashMap<>();
		map.put("aaa", 11);
		map.put("bbb", 22);
		map.put("ccc", 33);
		map.put("ddd", 44);
		
		return map;
	}
	
	// url: http://localhost/lesson01/ex01/5
	@RequestMapping("/5")
	public Data ex01_5() {
		Data data = new Data(); // 일반 자바 bean(개체)
		data.setId(10);
		data.setName("신보람");
		
		return data; // 일반 bean 개체도 Json으로 변환된다
	}
	
	@RequestMapping("/6")
	public ResponseEntity<Data> ex01_6() {
		Data data = new Data();
		data.setId(11);
		data.setName("바다");
		
		return new ResponseEntity<>(data, HttpStatus.INTERNAL_SERVER_ERROR); // OK -- 200 ; Internal_Server_Error -- 500;
	}
	
}
