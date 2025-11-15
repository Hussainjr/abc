package com.practice.demo.Repository;

import com.practice.demo.config.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
