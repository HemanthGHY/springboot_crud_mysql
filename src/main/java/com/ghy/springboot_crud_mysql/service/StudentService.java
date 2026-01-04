package com.ghy.springboot_crud_mysql.service;


import com.ghy.springboot_crud_mysql.model.Student;

import java.util.List;

public interface StudentService {

    Student save(Student student);

    Student update(Integer id,Student student);

    void deleteById(Integer id);

    Student findById(Integer id);

    List<Student> findByName(String name);

    List<Student> findByEmail(String email);

    List<Student> getAllStudents();

}
