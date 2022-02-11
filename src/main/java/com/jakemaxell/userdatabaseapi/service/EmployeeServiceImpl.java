package com.jakemaxell.userdatabaseapi.service;

import com.jakemaxell.userdatabaseapi.controller.EmployeeRestController;
import com.jakemaxell.userdatabaseapi.domain.Employee;
import com.jakemaxell.userdatabaseapi.repository.EmployeeRepository;
import com.jakemaxell.userdatabaseapi.repository.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void setEmployeeRepository(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> retrieveEmployees(){
        List<Employee> employees = employeeRepository.findAll();
        return employees;
    }

    public Employee getEmployee(Long employeeId){
        Optional<Employee> optEmp = employeeRepository.findById(employeeId);
        return optEmp.get();
    }

    public List<Employee> getEmployeeByDepartment(String department){
        List<Employee> employees = employeeRepository.findAll();
        List<Employee> accumulated = new ArrayList<>();

        for(Employee employee : employees){
            if(employee.getDepartment().toLowerCase().equals(department.toLowerCase())){
                accumulated.add(employee);
            }
        }
        return accumulated;
    }

    public void saveEmployee(Employee employee){
        employeeRepository.save(employee);
    }

    public void deleteEmployee(Long employeeId){
        employeeRepository.deleteById(employeeId);
    }

    public void updateEmployee(Employee employee){
        employeeRepository.save(employee);
    }

}
