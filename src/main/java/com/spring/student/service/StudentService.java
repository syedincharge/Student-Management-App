package com.spring.student.service;

import java.util.List;

import com.spring.student.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudents();
	Student getStudentById(Long id);
	Student saveStudent(Student student);
	Student updateStudent(Student student);
	void deleteStudentById(Long id);
	

}
