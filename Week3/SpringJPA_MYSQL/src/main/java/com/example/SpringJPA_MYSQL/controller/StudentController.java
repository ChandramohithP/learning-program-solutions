package com.example.SpringJPA_MYSQL.controller;

import com.example.SpringJPA_MYSQL.model.Student;
import com.example.SpringJPA_MYSQL.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService service;
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return service.getAllStudents();
    }
    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable("id") int id){
        return service.getStudentById(id);
    }
    @PostMapping("/students")
    public String addStudent(@RequestBody Student student){
         service.addStudent(student);
         return "addded successfully";
    }
    @PutMapping("/students")
    public String updateStudent(@RequestBody Student student){
        service.updateStudent(student);
        return "updated save used for both update and save here ";
    }
    @DeleteMapping("/students/{id}")
    public String deleteStudentById(@PathVariable("id")int id){
        return service.deleteStudentById(id);
    }
    @DeleteMapping("/students/clear")
    public String clearStudentsAll(Student student){
        service.clearStudentsAll(student);
        return "deleted all";
    }

}
