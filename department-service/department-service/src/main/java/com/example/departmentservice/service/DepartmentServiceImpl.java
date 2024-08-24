package com.example.departmentservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.departmentservice.entity.DepartmentMaster;
import com.example.departmentservice.repository.DepartmentRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Service
@AllArgsConstructor
@Slf4j
public class DepartmentServiceImpl{
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	// Read operation
    public List<DepartmentMaster> fetchDepartmentList()
    {
    	
    	List<DepartmentMaster> department = new ArrayList<DepartmentMaster>(); 
    	departmentRepository.findAll().forEach(department1 ->department.add(department1));
    	//for(EmployeeMaster e )
    	department.forEach((DepartmentMaster e)-> {
    		System.out.println("Name : " + e.toString()); 
    	});
    		
    	//System.out.println("department"+department.get(0).toString());
    	return department;
		
    }

    
    public DepartmentMaster saveDepartment(DepartmentMaster department) {
        return departmentRepository.save(department);
    }

    
    public DepartmentMaster getDepartmentById(Integer departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

}
