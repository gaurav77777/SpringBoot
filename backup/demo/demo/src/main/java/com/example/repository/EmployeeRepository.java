package com.example.repository;



import com.example.entity.EmployeeMaster;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeMaster, Long>{

}
