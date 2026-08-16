package com.example.HibernateORM.service;

import com.example.HibernateORM.model.Student;
import com.example.HibernateORM.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public void createStudent(Student studentreq){

    }
    public void getStudentById(Long id){

    }
    public void getAllStudents(){

    }
    public void updateStudent(Long id){
        
    }
}
