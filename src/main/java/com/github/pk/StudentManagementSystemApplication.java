package com.github.pk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.pk.entity.Student;
import com.github.pk.repository.StudentRepository;

//simple student management springboot application, frontend using html with the help of bootstrap styling and thymeleaf..

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
		
		System.out.println("Hello");
	}
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//		Student s1=new Student("Pratik", "Kadukar", "kadukarpratik@gmail.com", "7030354953");
//		Student s2=new Student("Shubham", "Thote", "thoteshubham@gmail.com", "7856235694");
//		Student s3=new Student("Sagar", "Talhan", "talhansagar@gmail.com", "4523658965");
//		studentRepository.save(s1);
//		studentRepository.save(s2);
//		studentRepository.save(s3);
//		
	}

}
