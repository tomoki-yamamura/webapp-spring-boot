package com.example.webapp.student;

import java.util.List;

public class StudentService {
  public List<Student> getStudents() {
		return List.of(
			new Student(1L, "Mariam" , "hoge@hoge.com", LocalDate.of(2000, Month.APRIL, 5), 21)
		);
	}
}
