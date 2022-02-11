package com.jakemaxell.userdatabaseapi.repository;

import com.jakemaxell.userdatabaseapi.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
