package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // JSP로 보내는 컨트롤러
// Response Body는 있으면 안된다. >> RestController도 사용 불가능
public class Lesson01Ex02Controller {

	// url: http://localhost/lesson01/ex02
	@RequestMapping("/lesson01/ex02")
	public String ex02() {
		// return 되는 String은 jsp의 경로이다. (@ResponseBody annotation이 없을 때)
		// return "/WEB-INF/jsp/lesson01/ex02.jsp";
		return "lesson01/ex02";
	}
}
