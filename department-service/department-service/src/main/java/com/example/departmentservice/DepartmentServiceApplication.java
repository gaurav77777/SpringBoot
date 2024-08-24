package com.example.departmentservice;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import com.example.departmentservice.entity.DepartmentMaster;
import com.example.departmentservice.repository.DepartmentRepository;

@SpringBootApplication
public class DepartmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}
	
	
	@Bean
    CommandLineRunner init(DepartmentRepository userRepository) {
        return args -> {
            Stream.of("Engineering", "Finanace", "Administration", "Accounts").forEach(name -> {
            	DepartmentMaster department = new DepartmentMaster();
            	department.setDepartmentName(name);
                userRepository.save(department);
            });
            userRepository.findAll().forEach(System.out::println);
        };
    }

}
