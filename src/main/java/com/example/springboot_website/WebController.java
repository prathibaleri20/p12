package com.example.springboot_website;

	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;

	@Controller
	public class WebController {

	    @GetMapping("/")
	    public String home(Model model) {
	        model.addAttribute("name1", "Prathiksha");
	        model.addAttribute("name2", "Pallavi");
	        return "index";
	    }
	}

