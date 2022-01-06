package com.gateway.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoPostgresApplication {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(DemoPostgresApplication.class, args);
	}


	@RequestMapping("/add")
	@PostMapping
	public int addStudent(@RequestBody Student student) {

		String sql = "INSERT INTO students (name,email) VALUES ('" + student.getName()+ "', '"+student.getEmail() +"')";
		
		int row = jdbcTemplate.update(sql);
		if (row > 0) {
			return 1;
		}
		return 0;
	}
	
	@RequestMapping("/getall")
	@GetMapping
	public List<Student> getAllStudent() {


	        String sql = "SELECT name,email FROM students";

	        return jdbcTemplate.query(
	                sql,
	                (rs, rowNum) ->
	                        new Student(
	                        		rs.getString("name"),
	                        		rs.getString("email")
	                        )
	        );
	    }
	}
	
	


