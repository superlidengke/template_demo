package com.pickshell.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@RequestMapping(value = "/movies")
	@ResponseBody
	public String createMovie(@RequestParam String movie) {
		System.out.println("Adding movie!! " + movie);
		return "created";
	}
}