package com.concretedetailer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Francis on 20-12-2022.
 */
@Controller
public class AppController {

	@GetMapping("/")
	public String viewHomePage() {
		return "index";
	}

	@GetMapping("/login")
	public String viewLoginPage() {
		return "login";
	}

}