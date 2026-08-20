package com.example.HibernateORM.service;

import com.example.HibernateORM.model.Student;
import com.example.HibernateORM.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Transactional
    public void createStudent(Student studentreq){
    studentRepository.save(studentreq);
    }

    @Transactional
    public void getStudentById(Long id){
        studentRepository.findById(id);
    }

    @Transactional
    public void getAllStudents(){
    }

    @Transactional
    public void updateStudent(Long id){
    }

    @Transactional
    public void deleteStudent(Long id){
        studentRepository.remove(id);
    }
}
