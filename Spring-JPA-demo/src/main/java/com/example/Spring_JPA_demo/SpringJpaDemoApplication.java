package com.example.Spring_JPA_demo;

import com.example.Spring_JPA_demo.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJpaDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJpaDemoApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

		s1.setRollNo(101);
		s1.setName("Ram");
		s1.setMarks(81);

		s2.setRollNo(102);
		s2.setName("Kiran");
		s2.setMarks(39);

		s3.setRollNo(103);
		s3.setName("Sham");
		s3.setMarks(52);

		repo.save(s1);
		repo.save(s2);
		repo.save(s3);
	}
}
