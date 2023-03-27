package com.springboot.chapter2.main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/btrace")
public class BtraceController {
	
	@RequestMapping("/arg1")
	public String arg1(@RequestParam("name")String name) {
		return "Hello,"+name;
	}
	
	@RequestMapping("/arg2")
	public User arg2(User user) {
		return user;
	}
	
	@RequestMapping("/constructor")
	public User constructor(User user) {
		return user;
	}
	
	@RequestMapping("/same1")
	public String same(@RequestParam("name")String name) {
		return "Hello,"+name;
	}
	@RequestMapping("/same2")
	public String same(@RequestParam("name")String name,@RequestParam("id")int id) {
		return "Hello,"+name+".Your id is "+id;
	}
	
	@RequestMapping("/exception")
	public String exception() throws Exception{
		try {
			System.out.println("start...");
			System.out.println(1/0);
			System.out.println("end...");
		}catch(Exception e) {
			//throw exception without print detail.
			//e.printStackTrace();
		}
		return "success";
	}

}
