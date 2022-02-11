package com.jakemaxell.userdatabaseapi.repository;

import com.jakemaxell.userdatabaseapi.domain.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> retrieveEmployees();

    public Employee getEmployee(Long employeeId);

    public List<Employee> getEmployeeByDepartment(String department);

    public void saveEmployee(Employee employee);

    public void deleteEmployee(Long employeeId);

    public void updateEmployee(Employee employee);

}
