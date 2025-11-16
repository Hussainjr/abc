package com.practice.demo.controller;

import com.practice.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/saveStudent")
    public void saveStudent()
    {
        studentService.save();
    }

    public void update()
    {
        //
        System.out.println("from conflict-branch");
    }

    public void delete()
    {

    }

}
