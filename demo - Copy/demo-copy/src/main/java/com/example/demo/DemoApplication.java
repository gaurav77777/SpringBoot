package com.example.demo;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;


@EnableJpaRepositories( basePackages = {"com.*"} )
@ComponentScan(basePackages = {"com.*"})
@SpringBootApplication(scanBasePackages={"com.*"})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
    CommandLineRunner init(EmployeeRepository userRepository) {
        return args -> {
            Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
            	EmployeeMaster user = new EmployeeMaster();
            	user.setName(name);
            	user.setDepartmrntId(1);
                userRepository.save(user);
            });
            userRepository.findAll().forEach(System.out::println);
        };
    }
	
	@Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
