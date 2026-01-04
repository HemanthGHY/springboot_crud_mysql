package com.ghy.springboot_crud_mysql.controller;

import com.ghy.springboot_crud_mysql.model.Student;
import com.ghy.springboot_crud_mysql.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class studentController {

    private final StudentServiceImpl studentService;

    public studentController(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    @Autowired
    private DummyData dummyData;

    @GetMapping("/hello")
    public String hello(){
        dummyData.insert();
        return "hello";
    }

    @PostMapping("/student")
    public Student saveStudent(@RequestBody Student student){
        return studentService.save(student);
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable Integer id){
        return studentService.findById(id);
    }

    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/student/name/{name}")
    public List<Student> getStudentByName(@PathVariable String name){
        return studentService.findByName(name);
    }

    @GetMapping("/student/email/{email}")
    public List<Student> getStudentByEmail(@PathVariable String email){
        return studentService.findByEmail(email);
    }

    @PutMapping("/student/update/{id}")
    public Student updateStudent(@PathVariable Integer id,@RequestBody Student student){
        student.setId(id);
        return  studentService.update(student.getId(),student);
    }

    @DeleteMapping("/student/delete/{id}")
    public void deleteStudent(@PathVariable Integer id){
        studentService.deleteById(id);
    }
}
