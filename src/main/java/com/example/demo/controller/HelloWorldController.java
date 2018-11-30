package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//RestController这个用法就是默认返回值都是以json 形式进行返回
@RestController
public class HelloWorldController {

	@RequestMapping("/hello")
	public String index() {
		return "Hello World springboot";
	}
}
