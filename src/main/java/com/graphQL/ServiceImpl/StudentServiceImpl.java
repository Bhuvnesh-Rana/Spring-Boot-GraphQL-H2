package com.graphQL.ServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public String updateStudent(StudentDAO studentDAO, int id) {
        Student student = studentRepository.findById(id).get();
        student.setId(studentDAO.getId());
        student.setName(studentDAO.getName());
        student.setAddress(studentDAO.getAddress());
        student.setGender(studentDAO.getGender());
        student.setRollNo(studentDAO.getRollNo());
        studentRepository.save(student);

        return "Student data updated.";
    }

    @Override
    public List<StudentDAO> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        List<StudentDAO> studentDAOs  = students.stream().map(a -> entityToDao(a)).collect(Collectors.toList());

        return studentDAOs;
    }

    @Override
    public StudentDAO getStudentById(int id) {
        Student student = studentRepository.findById(id).get();
        return entityToDao(student);
    }

    @Override
    public void deleteStudentById(int id) {
        studentRepository.deleteById(id);
    }

    private StudentDAO entityToDao(Student student){
        StudentDAO studentDAO = new StudentDAO();
        studentDAO.setId(student.getId());
        studentDAO.setName(student.getName());
        studentDAO.setAddress(student.getAddress());
        studentDAO.setGender(student.getGender());
        studentDAO.setRollNo(student.getRollNo());

        return studentDAO;
    }
    
}
