package com.example.SpringJPA_MYSQL.repository;

import com.example.SpringJPA_MYSQL.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>
{

}
