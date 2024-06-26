package com.example.webapp.student;

import java.time.LocalDate;

public class Student {
  private Long id;
  private String name;
  private String email;
  private LocalDate dob;
  private Integer age;

  public Student() {
  }

  public Student(Long id, String name, String email, LocalDate dob, Integer age) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.dob = dob;
    this.age = age;
  }

  public Long getID() {
    return id;
  }
  public String getName() {
    return name;
  }
  public String getEmail() {
    return email;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public void setDob(LocalDate dob) {
    this.dob = dob;
  }
  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", email='" + email + '\'' +
            ", dob='" + dob + '\'' +
            ", age='" + age + '\'' +
            '}';
  }
}
