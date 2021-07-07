package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.hs.study.model.dto.ModelDTO;
import kr.hs.study.model.dto.ModelDTO2;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1() {
		return "test1";
	}
	
	//model은 자동으로 request로 넘겨줌..?
	@GetMapping("/test2")
	public String test2(Model model) {
		model.addAttribute("id", "kim");
		model.addAttribute("password", "1111");
		return "test2";
	}
	
	@GetMapping("/test3")
	public String test3() {
		return "login_form";
	}
	
	//자동으로 request영역에 저장되어서 view로 넘어감
	@PostMapping("/test3")
	public String test3_result(@ModelAttribute ModelDTO dto, Model model) {
		model.addAttribute("id", dto.getUid());
		model.addAttribute("password", dto.getUpass());
		model.addAttribute("email", dto.getUemail());
		return "test3";
	}
	
	
	//return 값이 ModelAndView
	@GetMapping("/test4")
	public ModelAndView test4(ModelAndView mv) {
		mv.addObject("id", "lee");
		mv.addObject("password", "1111");
		mv.addObject("email", "lee@gmail.com");
		//view이름까지 지정해줘야 한다.
		mv.setViewName("test4");
		return mv;
	}
	
	//객체에 담긴 값을 model에 담아서 view로 넘김
	@GetMapping("/test5")
	public String test5(@ModelAttribute ModelDTO2 dto, Model model) {
		model.addAttribute("a", dto.getA());
		model.addAttribute("b", dto.getB());
		model.addAttribute("c", dto.getC());
		return "test5";
	}
	
	//객체에 담긴 값을 바로 view로 넘김
	@GetMapping("/test6")
	public String test6(@ModelAttribute ModelDTO2 dto) {
		return "test6";
	}
	
	@GetMapping("/test7")
	public String test7(@ModelAttribute("sample") ModelDTO2 dto) {
		return "test7";
	}
}