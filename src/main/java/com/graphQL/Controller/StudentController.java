package com.graphQL.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.graphQL.DAO.StudentDAO;
import com.graphQL.Service.StudentService;

@RestController
public class StudentController {
    
    @Autowired
    private StudentService studentService;
    @PostMapping("/add")
    public String add(@RequestBody StudentDAO studentDAO){
        return studentService.addStudent(studentDAO);
    }
}
