package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.EmployeeMaster;
import com.example.service.EmployeeServiceImpl;


@RestController
public class HelloController {
	
	@Autowired 
	private EmployeeServiceImpl employeeService;

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	
	// Read operation
    @GetMapping("/employees") 
    public List<EmployeeMaster> fetchEmployeeList()
    {
        return employeeService.fetchEmployeeList();
    }

}
