package com.example.HibernateORM.controller;

import com.example.HibernateORM.entity.Student;
import com.example.HibernateORM.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student studentreq){
        studentService.createStudent(studentreq);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id){
       Student student = studentService.getStudentById(id);
        return ResponseEntity.ok(student);
    }

    @GetMapping
    public ResponseEntity<Student> getAllStudents(){
        return null;
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@RequestBody Student studentreq,@PathVariable Long id){
       Student updatedStudent = studentService.updateStudent(studentreq,id);
        return ResponseEntity.ok(updatedStudent);
    }
}
