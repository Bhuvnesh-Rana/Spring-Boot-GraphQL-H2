package com.graphQL.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;

import com.graphQL.DAO.StudentDAO;
import com.graphQL.Service.StudentService;

// @RestController
@Controller
public class StudentController {
    
    @Autowired
    private StudentService studentService;
    // @PostMapping("/stu")
    // public String addStudent(@RequestBody StudentDAO studentDAO){
    //     return studentService.addStudent(studentDAO);
    // }

    // @PutMapping("/stu/{id}")
    // public String updateStudent(@RequestBody StudentDAO studentDAO, int id){
    //     return studentService.updateStudent(studentDAO, id);
    // }

    // @GetMapping("/stu")
    @QueryMapping("getAllStudent")
    public List<StudentDAO> getAllStudents(){
        return studentService.getAllStudents();
    }

    // @GetMapping("/stu/{id}")
    @QueryMapping("getStudentById")
    public StudentDAO getStudenById(@Argument int id){
        return studentService.getStudentById(id);
    }

    // @DeleteMapping("/stu/{id}")
    // public void delete(@PathVariable int id){
    //     studentService.deleteStudentById(id);
    // }
}
