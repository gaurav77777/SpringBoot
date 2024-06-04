package com.example.demo;



import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willDoNothing;
import static org.mockito.Mockito.*;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;
import java.util.Optional;



@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTests {
	
	@Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeServiceImpl employeeService;

    private Optional<EmployeeMaster> employee;
    //private Optional<EmployeeMaster> employee;

    @BeforeEach
    public void setup(){
        //employeeRepository = Mockito.mock(EmployeeRepository.class);
        //employeeService = new EmployeeServiceImpl(employeeRepository);
       
    	employee = Optional.of(EmployeeMaster.builder()
                .id(1)
                .name("RameshOne")
                .departmrntId(1)
                .build());
    }

    // JUnit test for saveEmployee method
    @DisplayName("JUnit test for saveEmployee method")
    @Test
    public void givenEmployeeObject_whenSaveEmployee_thenReturnEmployeeObject(){
        // given - precondition or setup
		/*
		 * when(employeeRepository.findByEmail(employee.getEmail()))
		 * .thenReturn(Optional.empty());
		 */

        //when(employeeRepository.save(employee)).thenReturn(employee);
        when(employeeRepository.findById(1)).thenReturn(employee);

        System.out.println(employeeRepository);
        System.out.println(employeeService);

        // when -  action or the behaviour that we are going test
        EmployeeMaster savedEmployee = employeeService.fetchEmployee(1);

        System.out.println(savedEmployee);
        // then - verify the output
        assertThat(savedEmployee).isNotNull();
    }

}
