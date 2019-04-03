package com.niit.Eshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserDetailController {
	 @RequestMapping("/login")
		public String test1()
		{
			return "login";
		}
	 @RequestMapping("/AddUserDetail")
		public String test2()
		{
			return "AddUserDetail";
		}

}
