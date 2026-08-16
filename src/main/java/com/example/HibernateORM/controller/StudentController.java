package com.example.HibernateORM.controller;

import com.example.HibernateORM.model.Student;
import com.example.HibernateORM.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student studentreq){
        return null;
    }

    @GetMapping
    public ResponseEntity<Student> getStudentById(@PathVariable Long id){
        return null;

    }

    @GetMapping
    public ResponseEntity<Student> getAllStudents(){
        return null;
    }
    @PatchMapping
    public ResponseEntity<Student> updateStudent(@PathVariable Long id){
        return null;
    }
}
