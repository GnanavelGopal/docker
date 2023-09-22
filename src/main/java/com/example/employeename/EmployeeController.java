package com.example.employeename;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@GetMapping(value = "/employee")
	public String getName() {
		return "Employee name is Gnanavel";
	}
}
