package com.cognizant.spring_learn.service;

import com.cognizant.spring_learn.dao.EmployeeDao;
import com.cognizant.spring_learn.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao dao;

    public List<Employee> getAllEmployees() {
        return dao.getAllEmployees();
    }

    public void updateEmployee(Employee emp) {
        dao.updateEmployee(emp);
    }

    public void deleteEmployee(int id) {
        dao.deleteEmployee(id);
    }
}

