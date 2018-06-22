package com.app.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	
	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", "Themeleaf Test");
		model.put("description", "Test Description");
		return "welcome";
	}

}
