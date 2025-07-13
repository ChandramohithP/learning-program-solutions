package com.cognizant.spring_learn.dao;
import com.cognizant.spring_learn.model.Employee;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public class EmployeeDao {
    private static List<Employee> EMPLOYEE_LIST;
    @Autowired
    private ApplicationContext context;
    @PostConstruct
    public void init()
    {
        EMPLOYEE_LIST = context.getBean("employeeList", List.class);
    }
    public List<Employee> getAllEmployees() {
        return EMPLOYEE_LIST;
    }
}
