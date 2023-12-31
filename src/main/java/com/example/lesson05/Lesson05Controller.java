package com.example.lesson05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lesson05")
public class Lesson05Controller {

	@GetMapping("/ex01")
	public String ex01() {
		return "lesson05/ex01";
	}
	
	@GetMapping("/ex02")
	public String ex02(Model model) {
		// List<String>
		List<String> fruits = List.of("사과", "파인애플", "포도", "멜론", "망고");
		model.addAttribute("fruits", fruits);
		
		// List<Map>
		List<Map<String, Object>> users = new ArrayList<>();
		
		Map<String, Object> user = new HashMap<>();
		
		user.put("name", "신보람");
		user.put("age", 30);
		users.add(user);
		
		user = new HashMap<>();
		user.put("name", "바다");
		user.put("age", 6);
		users.add(user);
		
		model.addAttribute("users", users);
		
		return "lesson05/ex02";   
	}
}
