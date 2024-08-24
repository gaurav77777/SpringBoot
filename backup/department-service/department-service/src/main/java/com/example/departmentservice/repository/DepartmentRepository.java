package com.example.departmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.departmentservice.entity.DepartmentMaster;

public interface DepartmentRepository extends JpaRepository<DepartmentMaster, Integer>{

}
