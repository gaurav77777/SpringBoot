package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	// Read operation
    public List<EmployeeMaster> fetchEmployeeList()
    {
    	
    	List<EmployeeMaster> emp = new ArrayList<EmployeeMaster>(); 
    	employeeRepository.findAll().forEach(emp1 ->emp.add(emp1));
    	//for(EmployeeMaster e )
    	emp.forEach((EmployeeMaster e)-> {
    		System.out.println("Name : " + e.toString()); 
    	});
    		
    	System.out.println("emp"+emp.get(0).toString());
    	return emp;
		/*
		 * return (List<EmployeeMaster>) employeeRepository.findAll();
		 */
    }
    
    public EmployeeMaster fetchEmployee(Integer id)    
    {
    	EmployeeMaster employee = employeeRepository.findById(id).get();
    	
    	return employee;
    }
    
    
    
    
    
    public DepartmentDto getDepartment(Integer id)
    {
    	System.out.println("Inside getDepartment");
    	//ResponseEntity<DepartmentDto> responseEntity = restTemplate.getForEntity("http://localhost:8081/" + id, DepartmentDto.class);
    	ResponseEntity<DepartmentDto> responseEntity = restTemplate.getForEntity("http://localhost:8081/" + id, DepartmentDto.class);
    	DepartmentDto departmentDto = responseEntity.getBody();
    	//String departmentDto = responseEntity.getBody();
    	System.out.println("Inside getDepartment 1"+departmentDto);
    	
    	return departmentDto;
    	
    }

}
