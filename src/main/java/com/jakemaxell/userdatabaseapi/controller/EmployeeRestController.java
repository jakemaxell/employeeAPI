package com.jakemaxell.userdatabaseapi.controller;

import com.jakemaxell.userdatabaseapi.domain.Employee;
import com.jakemaxell.userdatabaseapi.repository.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeRestController {

    @Autowired
    private EmployeeService employeeService;

    public void setEmployeeService(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/api/employees")
    public List<Employee> getEmployees(){
        List<Employee> employees = employeeService.retrieveEmployees();
        return employees;
    }

    @GetMapping("/api/employees/id/{employeeId}")
    public Employee getEmployee(@PathVariable(name="employeeId")Long employeeId){
        return employeeService.getEmployee(employeeId);
    }

    @GetMapping("/api/employees/department/{departmentName}")
    public List<Employee> getEmployeesByDepartment(@PathVariable(name="departmentName")String department){
        return employeeService.getEmployeeByDepartment(department);
    }
/*
    @GetMapping("/api/employees/{department}")
    public List<Employee> getEmployeeByDepartment(@PathVariable(name="department")String department){
        List<Employee> employees = employeeService.retrieveEmployees();
        List<Employee> accumulator = new ArrayList<>();
        for(Employee employee : employees){
            if(employee.getDepartment().equals(department)){
                accumulator.add(employee);
            }
        }
        return accumulator;
    }*/

    @PostMapping("/api/employees")
    public void saveEmployee(Employee employee){
        employeeService.saveEmployee(employee);
        System.out.println("Employee Saved Successfully");
    }

    @DeleteMapping("/api/employees/{employeeId}")
    public void deleteEmployee(@PathVariable(name="employeeId")Long employeeId){
        employeeService.deleteEmployee(employeeId);
        System.out.println("Employee Deleted Successfully");
    }

    @PutMapping("/api/employees/{employeeId}")
    public void updateEmployee(@RequestBody Employee employee, @PathVariable(name="employeeId")Long employeeId){
        Employee emp = employeeService.getEmployee(employeeId);
        if(emp != null){
            employeeService.updateEmployee(employee);
        }
    }

}
