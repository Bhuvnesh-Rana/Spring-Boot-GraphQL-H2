package com.graphQL.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graphQL.Entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{
    
}
