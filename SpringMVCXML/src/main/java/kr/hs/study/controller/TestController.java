package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//요청 주소의 루트 : webapp
//View의 루트: /WEB-INF/views/


@Controller
@RequestMapping("/sub1")
public class TestController {
	//@RequestMapping(value="/", method={RequestMethod.GET, RequestMethod.POST}
//	@RequestMapping(value="/test2", method=RequestMethod.GET)
	@GetMapping("/test2") 
	public String test2() {
		System.out.println("sub1/test2");
		return "sub1/test2";
//		return "/WEB-INF/views/sub1/test2.jsp"; //절대경로라서 root(webapp)에서 시작
		//return "WEB-INF/views/sub1/test2.jsp";   상대경로: 현재 나의 위치 
	}
	
	@RequestMapping(value="/test3", method=RequestMethod.GET)
	public String test3() {
		System.out.println("sub1/test3");
		return "sub1/test3";	//상대경로  현재 나의 위치를 기준으로 잡음
//		return "/sub1/test3";   //절대경로  jsp의 절대경로는 views=> WEB-INF/views가 루트가 됨 
		
	}
	
	@RequestMapping(value="/test4", method=RequestMethod.GET)
	public String test4() {
		System.out.println("sub1/test4");
		return "sub1/test4";
	}
}
