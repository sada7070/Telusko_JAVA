package com.example.Spring_JPA_demo;

import com.example.Spring_JPA_demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
}
