package com.cognizant.spring_learn.controller;
import com.cognizant.spring_learn.model.Employee;
import com.cognizant.spring_learn.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
    @PutMapping
    public void updateEmployee(@RequestBody @Valid Employee employee) {
        employeeService.updateEmployee(employee);
    }
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
    }
    @PostMapping
    public Employee addEmployee(@RequestBody @Valid Employee employee) {
        return employee;
    }
}
