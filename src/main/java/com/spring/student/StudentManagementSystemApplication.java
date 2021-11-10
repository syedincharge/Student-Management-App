package com.spring.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	
	//@Autowired
	//private StudentRepository studentRepository;
/*
	@Override
	public void run(String... args) throws Exception {
		
		
		  Student student1 = new Student("Rizvi", "Syed","syed@gmail.com");
		  studentRepository.save(student1);
		  Student student2 = new Student("Rizvi",
		  "Shazan","shazan@gmail.com"); studentRepository.save(student2);
		  Student student3 = new Student("Jundab", "Mohammad","junbaib@gmail.com");
		  studentRepository.save(student3); 
		  Student student4 = new Student("Rizvi", "Sabur","saburd@gmail.com"); 
		  studentRepository.save(student4);
		  Student student5 = new Student("Fatima", "Nargis","nargis@gmail.com");
		  studentRepository.save(student5);
		 
	}
 */
}
