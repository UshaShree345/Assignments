package com.capgemini.springmvc.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class SpringController {
	@GetMapping("/hello")
	
	public String displayHello(ModelMap map) {
		
		map.addAttribute("hello", "Happy Holi");
		return "hello";
	}
		@GetMapping("/form")
		public String form() {
			System.out.println("From DATA");
			return "form";
		}
		@PostMapping("/formdata")
		public String fromData(HttpServletRequest req) {
			
			int id=Integer.parseInt(req.getParameter("id"));
			String name=req.getParameter("name");
			String email=req.getParameter("email");
			req.setAttribute("id", id);
			req.setAttribute("name", name);
			req.setAttribute("email", email);
			
			
			return "formData";
			
			
		}
		@PostMapping("/requestParam")
		public String submitData(@RequestParam(name="id") int id,
				@RequestParam(name="name") String name,
				@RequestParam(name="email") String email,ModelMap map) {
			
			map.addAttribute("id" ,id);
			
			map.addAttribute("name" ,name);
			map.addAttribute("email" ,email);
			
			
			
			return "formData";
		}
		@PostMapping("/submitForm")
		public String submitFormData( int id,String name, String email,ModelMap map) {
			
			map.addAttribute("id" ,id);
			
			map.addAttribute("name" ,name);
			map.addAttribute("email" ,email);
			
			
			
			return "formData";
		}
		
//		@PostMapping("/submitDto")
//		public String submitFormData( User user,ModelMap map) {
//			
//			map.addAttribute("id" ,user.getId());
//			
//			map.addAttribute("name" ,user.getName());
//			map.addAttribute("email" ,user.getEmail());
//			
//			
//			
//			return "formData";
//		}
		@GetMapping("/forward")
		public String forward() {
			return "forward:hello";
		}
		
		@GetMapping("/redirect")
		
		public String redirect() {
			return "redirect:http://www.google.com";
		} 
		@GetMapping("/path/{name}")
		public String path(@PathVariable("name") String name, ModelMap map) {
			map.addAttribute("name", name);
			return "path";
		}
		
		@GetMapping("/create-cookie")
		
		public String createCookie(HttpServletResponse response,ModelMap map) {
			
			Cookie cookie = new Cookie("api-key", "Api-123456789qwerty");
			cookie.setMaxAge(24*7*60*60);
			response.addCookie(cookie);
			return "create-cookie";
		} 
		@GetMapping("/get-cookie")
		public String getCookie(@CookieValue(name="api-key", required= false) String apiKey,
				ModelMap map) {
			map.addAttribute("cookieName",apiKey);
			return "get-cookie";
		}
		
		@GetMapping("/handle")
		public String handle() {
			
			System.out.println(1/0);
			return "error"; 
		}
		
			
	
	

}//End of the class