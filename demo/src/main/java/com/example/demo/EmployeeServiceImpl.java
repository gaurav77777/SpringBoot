package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
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

}
