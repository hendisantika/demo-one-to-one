package com.hendisantika.demoone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoOneApplication {

	private static final Logger log = LoggerFactory.getLogger(DemoOneApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoOneApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner demo(EmployeeRepository repository) {
//		return (args) -> {
//			// create employee object
//			Employee employee = new Employee();
//			employee.setName("Hendi Santika");
//			employee.setEmail("hendisantika@example.com");
//			employee.setPassword("pwd");
//
//			// create Address object
//			Address address = new Address();
//			address.setAddress("Konohagakure");
//
//			employee.setAddress(address);
//
//			// actual save call for the object
//			// save students
//			log.info("Data --> " + employee);
//			repository.save(employee);
//		};
//	}

}
