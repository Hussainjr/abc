package com.practice.demo.service;

import com.practice.demo.Repository.StudentRepository;
import com.practice.demo.config.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public void save()
    {
        Student s=new Student();
        s.setName("James");
        s.setEmail("James@23gmail.com");
        s.setAge(33);

        studentRepository.save(s);
    }
}
