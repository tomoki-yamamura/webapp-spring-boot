package com.example.webapp.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

  private final StudentService studentService

  public StudentController(StudentService studentService) {
    this.studentService = new StudentService();
  }

  @GetMapping
	public List<Student> getStudents() {
		// return List.of(
		// 	new Student(1L, "Mariam" , "hoge@hoge.com", LocalDate.of(2000, Month.APRIL, 5), 21)
		// );
    return studentService.getStudents()
	}
}
