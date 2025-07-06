package com.example.studentCRUD.controller;

import com.example.studentCRUD.model.Student;
import com.example.studentCRUD.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService service;
    @GetMapping("/students")
    public List<Student> getStudents(){
        return service.getStudents();
    }
    @GetMapping("/students/{rollno}")
    public Student getStubyrollno(@PathVariable("rollno") int rollno){
        return service.getStuByrollno(rollno);
    }
    @PostMapping("/students")
    public String addStudents(@RequestBody Student student){
        service.addStudent(student);
        return "sucsess";
    }
    @PutMapping("/students")
    public String updateStudents(@RequestBody Student student){
        return service.updateStudent(student);
    }
    @DeleteMapping("/students/{rollno}")
    public String deleteStudents(@PathVariable int rollno){
        return service.deleteStudents(rollno);
    }
}
