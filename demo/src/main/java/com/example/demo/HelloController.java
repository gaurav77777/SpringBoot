package com.example.demo;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class HelloController {
	
	@Autowired 
	private EmployeeServiceImpl employeeService;
	
	@Autowired
	private EmployeeRepository employeeRepository;

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
    
    @PostMapping("/employees")
    public ResponseEntity addEmployee(@RequestBody EmployeeMaster e) throws URISyntaxException{
    	
    	EmployeeMaster savedClient = employeeRepository.save(e);
        return ResponseEntity.created(new URI("/addemployees/" + savedClient.getId())).body(savedClient);
    	//employeeRepository.save(e);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity deleteClient(@PathVariable Integer id) {
    	employeeRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
    
 // get employee by id rest api
    @GetMapping("/employees/{id}")
    public ResponseEntity <EmployeeMaster> getEmployeeById(@PathVariable Integer id) {
    	EmployeeMaster employee = employeeRepository.findById(id).get();
        return ResponseEntity.ok(employee);
    }
    
    
    @PutMapping("/employees/{id}")
    public ResponseEntity < EmployeeMaster > updateEmployee(@PathVariable Integer id, @RequestBody EmployeeMaster employeeDetails) {
    	EmployeeMaster employee = employeeRepository.findById(id).get();

    	employee.setName(employeeDetails.getName());
		/*
		 * employee.setFirstName(employeeDetails.getFirstName());
		 * employee.setLastName(employeeDetails.getLastName());
		 * employee.setEmailId(employeeDetails.getEmailId());
		 */

    	EmployeeMaster updatedEmployee = employeeRepository.save(employee);
        return ResponseEntity.ok(updatedEmployee);
    }

}
