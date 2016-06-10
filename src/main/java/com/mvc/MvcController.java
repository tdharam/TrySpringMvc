package com.mvc;

 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MvcController {
	
	@RequestMapping("/hello")
	public ModelAndView doSomething() {
		ModelAndView model = new ModelAndView("hellopage");
		model.addObject("msg", "hello world");
		return model;
	}
	
	
}
