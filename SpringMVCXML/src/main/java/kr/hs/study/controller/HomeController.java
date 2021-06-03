package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller //이 클래스를 bean으로 등록
public class HomeController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	//get방식으로 root로 접속했을 때
	public String home() {
		System.out.println("home");
		return "index";
	}
	
	//get 방슥으로 /test1으로 접속했을 때 콘솔에 test1 출력
	@RequestMapping(value="/test1", method=RequestMethod.GET)
	public String test1() {
		System.out.println("test1");
		return "test1";
	}
}
