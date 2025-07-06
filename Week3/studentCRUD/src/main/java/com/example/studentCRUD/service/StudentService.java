package com.example.studentCRUD.service;

import com.example.studentCRUD.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    List<Student> students=new ArrayList<>(Arrays.asList(new Student(1,"arjun","cse","ai"),new Student(2,"baku","aids","java")));
    public List<Student> getStudents(){
        return students;
    }
    public Student getStuByrollno(int rollno){


            for(int i=0;i<students.size();i++)
            {
                if(students.get(i).getRollno()==rollno)
                {
                    return students.get(i);
                }

            }return null;


    }

    public void addStudent(Student student)
    {
        students.add(student);
    }

    public String updateStudent(Student student) {
        for(int i=0;i<students.size();i++){
            if(students.get(i).getRollno()==student.getRollno()){
                students.set(i,student);
                return "students updated";
            }
        }return "element not found";
    }

    public String deleteStudents(int rollno) {
        for(int i=0;i<students.size();i++){
            if(students.get(i).getRollno()==rollno){
                students.remove(i);
                return "delete successfully pereformed";
            }
        }return "not deleted element not found enter corect element";
    }
}
