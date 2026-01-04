package com.ghy.springboot_crud_mysql.service;

import com.ghy.springboot_crud_mysql.model.Student;
import com.ghy.springboot_crud_mysql.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    final private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student update(Integer id, Student student) {
        Student existing = studentRepository.findById(id)
                .orElseThrow(()->new RuntimeException("student not found"));
        existing.setName(student.getName());
        existing.setCourse(student.getCourse());
        existing.setEmail(student.getEmail());

        return studentRepository.save(existing);

    }

    @Override
    public void deleteById(Integer id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student findById(Integer id) {
        return studentRepository.findById(id)
                .orElseThrow(()->new RuntimeException("student not found"));
    }

    @Override
    public List<Student> findByName(String name) {
        return studentRepository.findByName(name);
    }

    @Override
    public List<Student> findByEmail(String email) {
        return studentRepository.findByEmail(email);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
