package com.spring.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.student.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
