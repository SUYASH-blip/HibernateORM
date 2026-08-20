package com.example.HibernateORM.controller;

import com.example.HibernateORM.entity.Student;
import com.example.HibernateORM.service.StudentService;
import org.springframework.http.HttpStatus;
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
        studentService.createStudent(studentreq);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<Student> getStudentById(@PathVariable Long id){
        studentService.getStudentById(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();

    }

    @GetMapping
    public ResponseEntity<Student> getAllStudents(){
        return null;
    }

    @PatchMapping
    public ResponseEntity<Student> updateStudent(@RequestBody Student studentreq,@PathVariable Long id){
       Student updatedStudent = studentService.updateStudent(studentreq,id);
        return ResponseEntity.ok(updatedStudent);
    }
}
