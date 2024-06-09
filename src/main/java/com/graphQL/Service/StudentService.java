package com.graphQL.Service;

import java.util.List;

import com.graphQL.DAO.StudentDAO;

public interface StudentService{
    String addStudent(StudentDAO studentDAO);
    String updateStudent(StudentDAO studentDAO, int id);
    List<StudentDAO> getAllStudents();
    StudentDAO getStudentById(int id);
    void deleteStudentById(int id);
}
