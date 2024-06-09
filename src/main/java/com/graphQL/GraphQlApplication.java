package com.graphQL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.graphQL.DAO.StudentDAO;
import com.graphQL.Service.StudentService;

@SpringBootApplication
public class GraphQlApplication implements CommandLineRunner{

	@Autowired
	private StudentService studentService;

	public static void main(String[] args) {
		SpringApplication.run(GraphQlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		StudentDAO sd = new StudentDAO();
		sd.setName("Happy");
		sd.setAddress("#1234");
		sd.setGender('M');
		sd.setRollNo(12);

		StudentDAO sd1 = new StudentDAO();
		sd1.setName("Lapd");
		sd1.setAddress("#221");
		sd1.setGender('F');
		sd1.setRollNo(14);

		studentService.addStudent(sd);
		studentService.addStudent(sd1);
	}

}
