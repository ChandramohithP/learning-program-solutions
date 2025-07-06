package com.example.SpringJPA_MYSQL.service;

import com.example.SpringJPA_MYSQL.model.Student;
import com.example.SpringJPA_MYSQL.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentrepo;
    public List<Student> getAllStudents() {
      return studentrepo.findAll();
    }

    public Student addStudent(Student student)
    {
      return  studentrepo.save(student);

    }

    public Student getStudentById(int id) {

        return studentrepo.findById(id).orElse(new Student());

    }

    public void updateStudent(Student student) {
        studentrepo.save(student);
    }

    public String deleteStudentById(int id) {
        studentrepo.deleteById(id);
        return "delete done";
    }

    public void clearStudentsAll(Student student) {
        studentrepo.deleteAll();
    }
}
