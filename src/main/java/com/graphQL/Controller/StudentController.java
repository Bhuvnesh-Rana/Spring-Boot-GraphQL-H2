package com.graphQL.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.graphQL.Entity.Student;
import com.graphQL.Repository.StudentRepository;

@RestController
public class StudentController {
    
    @Autowired
    private StudentRepository studentRepository;
    @PostMapping("/add")
    public Student add(@RequestBody Student student){
        return studentRepository.save(student);
    }
}
