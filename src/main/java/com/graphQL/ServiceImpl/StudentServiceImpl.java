package com.graphQL.ServiceImpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graphQL.DAO.StudentDAO;
import com.graphQL.Entity.Student;
import com.graphQL.Repository.StudentRepository;
import com.graphQL.Service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public String addStudent(StudentDAO studentDAO) {
        Student st = new Student();
        BeanUtils.copyProperties(studentDAO, st);
        studentRepository.save(st);

        return "Student saved";
    }
    
}
