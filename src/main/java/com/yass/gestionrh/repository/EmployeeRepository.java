package com.yass.gestionrh.repository;

import com.yass.gestionrh.entities.Employee;
import com.yass.gestionrh.entities.Position;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findEmployeeByPhoneNumber(String phone);
    List<Employee> findByPosition(Position position);
}
