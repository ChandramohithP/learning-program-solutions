package com.cognizant.spring_learn.dao;
import com.cognizant.spring_learn.exception.EmployeeNotFoundException;
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
    public void init() {
        EMPLOYEE_LIST = context.getBean("employeeList", List.class);
    }
    public List<Employee> getAllEmployees() {
        return EMPLOYEE_LIST;
    }
    public void updateEmployee(Employee updated) {
        for (int i = 0; i < EMPLOYEE_LIST.size(); i++) {
            if (EMPLOYEE_LIST.get(i).getId() == updated.getId()) {
                EMPLOYEE_LIST.set(i, updated);
                return;
            }
        }
        throw new EmployeeNotFoundException("Employee not found");
    }

    public void deleteEmployee(int id) {
        boolean removed = EMPLOYEE_LIST.removeIf(e -> e.getId() == id);
        if (!removed) {
            throw new EmployeeNotFoundException("Employee not found for id: " + id);
        }
    }
}
