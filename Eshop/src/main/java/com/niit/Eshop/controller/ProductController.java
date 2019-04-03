package com.niit.Eshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ProductController {
	 @RequestMapping("/ProductDetails")
			public String test1()
			{
				return "ProductDetails";
			}
	 @RequestMapping("/ProductList")
		public String test2()
		{
			return "ProductList";
		}

}
