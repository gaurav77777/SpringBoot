package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




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
    	
    	List<EmployeeMaster> emp = new ArrayList<EmployeeMaster>(); 
    	EmployeeMaster emp17 = new EmployeeMaster();
    	emp17.setId(3);
    	emp17.setName("Ricky");
    	emp = employeeService.fetchEmployeeList();
    	System.out.println("inside controller"+emp.size());
    	System.out.println(emp.get(0).toString());
    	//emp.add(emp17);
        //return employeeService.fetchEmployeeList();
    	return emp;
    }

}
