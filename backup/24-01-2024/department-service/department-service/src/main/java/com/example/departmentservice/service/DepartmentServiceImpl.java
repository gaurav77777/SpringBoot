package com.example.departmentservice.service;

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

    
    public DepartmentMaster saveDepartment(DepartmentMaster department) {
        return departmentRepository.save(department);
    }

    
    public DepartmentMaster getDepartmentById(Integer departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

}
