package com.ecom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CategoryController {
	
	@RequestMapping("/addcatpage")
	public String getAddCategoryPage()
	{
		return "AddCategoryPage";
	}

}
