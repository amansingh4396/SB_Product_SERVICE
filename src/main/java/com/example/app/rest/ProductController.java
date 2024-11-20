package com.example.app.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController
{

	@GetMapping(value = "/product")
	public String product()
	{
		String msg = "product  page";
		
		return msg ;
		
	}
	
}
