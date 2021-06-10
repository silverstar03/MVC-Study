package kr.hs.study.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

import kr.hs.study.model.dto.TestDTO;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		String c = request.getParameter("c");
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("c:" + c);
		return "result";
	}
	
	@GetMapping("/test2")
	public String test2(HttpServletRequest request) {
		String a=request.getParameter("a");
		String b=request.getParameter("b");
		String[] c = request.getParameterValues("c");
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		for(String value : c) {
			System.out.println("c: " + value);
		}
		return "result";
	}
	
	@GetMapping("/test3")
	public String test3() {
		return "login_form";
	}
	@PostMapping("/test3")
	public String test3_result(HttpServletRequest request) {
		String id = request.getParameter("uid");
		String pw = request.getParameter("upass");
		System.out.println("id:"+id);
		System.out.println("password:"+pw);
		return "result";
	}
	
	@GetMapping("/test4")
	public String test4(WebRequest request) {
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		String c = request.getParameter("c");
		
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("c:" + c);
		return "result";
	}
	
	
	//PathVariable은 형변환이 가능하다
	@GetMapping("/test5/{a}/{b}/{c}")
	public String test5(@PathVariable int a,
						@PathVariable int b,
						@PathVariable int c) {
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("c:" + c);
		
		return "result";
	}
	
	@GetMapping("/test6")
	public String test6(@RequestParam int a,
						@RequestParam int b,
						@RequestParam int c) {
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("c:" + c);
		
		return "result";
		
	}
	
	@GetMapping("/test7")
	public String test7(@RequestParam int a,
						@RequestParam int b,
						@RequestParam int c[]) {
		System.out.println("a:" + a);
		System.out.println("b:" + b);
//		for (int value : c) {
//			System.out.println("c: " + value);
//		}
		System.out.println("c:" + c);
		return "result";
	}
	
	@GetMapping("/test8")
	public String test8(@RequestParam Map<String, String> map) {
		String a = map.get("a");
		String b = map.get("b");
		String c = map.get("c");
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("c:" + c);
		
		return "result";
		
	}
	
	//map은 key가 중복되면 안되고 List는 키가 중복될 때 map 대신
	@GetMapping("/test9")
	public String test9(@RequestParam Map<String, String>map,
						@RequestParam List<String> c) {
		String a=map.get("a");
		String b=map.get("b");
		for(String val : c) {
			System.out.println("c:" + val);
		}
		
		return "result";
	}
	
	@GetMapping("/test10")
	public String test10(@ModelAttribute TestDTO dto) {
		System.out.println(dto.getA());
		System.out.println(dto.getB());
		System.out.println(dto.getC());
		return "result";
	}
	
}
