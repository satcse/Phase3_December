package com.ecommerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@RequestMapping("/")
	@ResponseBody
	public String index()
	{
		return "Main index method";
	}
	
	@RequestMapping("/second")
	@ResponseBody
	public String index2()
	{
		return "Second method";
	}

}
