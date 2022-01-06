package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ApiController {

	@Autowired
	private RestTemplate restTemplate;
	
	private static String url = "https://jsonplaceholder.typicode.com/posts";
	
	@GetMapping("/getjson")
	public List<Object> getData(){
		Object[] data = restTemplate.getForObject(url, Object[].class);
		return Arrays.asList(data);
	}
	
	
}
