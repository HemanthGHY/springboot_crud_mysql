package com.ghy.springboot_crud_mysql.repository;

import com.ghy.springboot_crud_mysql.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    public List<Student> findByName(String name);

    public List<Student> findByEmail(String email);

}
