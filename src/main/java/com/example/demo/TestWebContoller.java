package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequestMapping("/test")
public class TestWebContoller {
		
		// 요청 파라미터 처리
		@GetMapping("/hello2")
		@ResponseBody // 별도의 뷰가 아닌 return 값을 http 응답 body에 출력함
		public String hello2(@RequestParam(value = "msg", required = false) String msg) {
			return msg;
		}
		
		// 경로 파라미터 사용 
		@GetMapping("/hello3/{msg}")
		public String hello3(@PathVariable String msg, Model m) {
			m.addAttribute("msg", msg);
			return "hello";
		}
	
}
