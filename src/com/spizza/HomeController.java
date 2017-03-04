package com.spizza;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String redirectToFlow() {
		return "redirect:/pizza"; 
	}
	
}
