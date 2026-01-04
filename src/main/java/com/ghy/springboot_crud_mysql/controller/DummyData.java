package com.ghy.springboot_crud_mysql.controller;

import com.ghy.springboot_crud_mysql.model.Student;
import com.ghy.springboot_crud_mysql.service.StudentServiceImpl;
import org.springframework.stereotype.Component;

@Component
public class DummyData {

    private final StudentServiceImpl studentService;

    public DummyData(StudentServiceImpl studentService){
        this.studentService = studentService;
    }

    public void insert(){
        Student student1 = new Student();
        student1.setName("Hemanth G");
        student1.setCourse("Java");
        student1.setEmail("ghy@gmail.com");
        Student student2 = new Student();
        student2.setName("Vijay G");
        student2.setCourse("Python");
        student2.setEmail("gvy@gmail.com");
        Student student3 = new Student();
        student3.setName("Yoshik B");
        student3.setCourse("Power Bi");
        student3.setEmail("by@gmail.com");
        Student student4 = new Student();
        student4.setName("Jashwanth T");
        student4.setCourse("AIML");
        student4.setEmail("tj@gmail.com");

        studentService.save(student1);
        studentService.save(student2);
        studentService.save(student3);
        studentService.save(student4);

    }
}
