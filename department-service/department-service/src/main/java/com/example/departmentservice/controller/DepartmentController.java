package com.example.departmentservice.controller;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.departmentservice.entity.DepartmentMaster;

import com.example.departmentservice.service.DepartmentServiceImpl;

import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;




@RestController
//@RequestMapping("api/departments")
@AllArgsConstructor
//@CrossOrigin(origins = "http://localhost:3000")
public class DepartmentController {
	
	
	 @Autowired
	 private final KafkaProducer kafkaProducer;
	 
	 @Autowired
	 private DepartmentServiceImpl departmentService;

	    @PostMapping
	    public ResponseEntity<DepartmentMaster> saveDepartment(@RequestBody DepartmentMaster department){
	    	DepartmentMaster savedDepartment = departmentService.saveDepartment(department);
	        return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
	    }

	    @GetMapping("{id}")
	    public ResponseEntity<DepartmentMaster> getDepartmentById(@PathVariable("id") Integer departmentId){
	    	DepartmentMaster department = departmentService.getDepartmentById(departmentId);
	        return ResponseEntity.ok(department);
	    }
	    
	    // Read operation
	    @GetMapping("/department") 
	    public List<DepartmentMaster> fetchEmployeeList()
	    {
	    	
	    	List<DepartmentMaster> department = new ArrayList<DepartmentMaster>(); 
	    	//DepartmentMaster emp17 = new DepartmentMaster();
	    	//emp17.setId(3);
	    	//emp17.setName("Ricky");
	    	department = departmentService.fetchDepartmentList();
	    	//System.out.println("inside controller"+emp.size());
	    	//System.out.println(emp.get(0).toString());
	    	//emp.add(emp17);
	        //return employeeService.fetchEmployeeList();
	    	return department;
	    }
	    
	    @PostMapping("/send")
	    public void sendMessageToKafka(@RequestBody String message) {
	        kafkaProducer.sendMessage(message);
	    }

}
