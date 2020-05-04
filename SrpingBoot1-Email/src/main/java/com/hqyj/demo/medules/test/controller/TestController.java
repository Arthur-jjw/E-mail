package com.hqyj.demo.medules.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    
	@RequestMapping("/test/login.do")
	@ResponseBody
	public String test() {
    	
    return "This is a SpringBoot Deamon";	
    	
    }
}
