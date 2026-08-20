package com.example.HibernateORM.service;

import com.example.HibernateORM.entity.Student;
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
    public Student getStudentById(Long id){
      Student student = studentRepository.findById(id);
      return student;
    }

    @Transactional
    public void getAllStudents(){
    }

    @Transactional
    public void updateStudent(Long id){
    }

    @Transactional
    public void deleteStudent(Student studentToremove){
        studentRepository.remove(studentToremove);
    }

    @Transactional
    public Student updateStudent(Student studentreq ,Long id){
        Student student1 = studentRepository.findById(id);
        if(student1==null) throw new RuntimeException();
        student1.setName(studentreq.getName());
        student1.setAge(studentreq.getAge());
        student1.setEmail(studentreq.getEmail());
        return student1;
    }
}
