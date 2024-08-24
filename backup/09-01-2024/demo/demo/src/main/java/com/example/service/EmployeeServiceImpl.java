package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.EmployeeMaster;
import com.example.repository.EmployeeRepository;
import java.util.List;

@Service
public class EmployeeServiceImpl{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	// Read operation
    public List<EmployeeMaster> fetchEmployeeList()
    {
        return (List<EmployeeMaster>)
        		employeeRepository.findAll();
    }

}
