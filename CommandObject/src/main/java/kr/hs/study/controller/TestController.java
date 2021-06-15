package kr.hs.study.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.model.ModelDTO;
import kr.hs.study.model.ModelDTO2;
import kr.hs.study.model.ModelDTO3;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	//public String test1(@ModelAttribute ModelDTO dto) { @ModelAttribute 생략가능
	public String test1(ModelDTO dto) {
		System.out.println(dto.getA());
		System.out.println(dto.getB());
		System.out.println(dto.getC());
		
		return "result";
	}
	
	@GetMapping("/test2")
	public String test2(ModelDTO dto) {
		return "login_form";
	}
	
	@PostMapping("/test2")
	public String test2_result(ModelDTO2 dto2) {
		String id = dto2.getUid();
		String pw = dto2.getUpass();
		System.out.println("id:"+id);
		System.out.println("password:"+pw);
		return "result";
	}
	
	@GetMapping("/test3")
	public String test3(ModelDTO3 dto3) {
		System.out.println(dto3.getA());
		System.out.println(dto3.getB());
		for(int value : dto3.getC()) {
			System.out.println(value);
		}
		return "result";
	}
	
	
}
