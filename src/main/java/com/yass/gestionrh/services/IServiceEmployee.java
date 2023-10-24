package com.yass.gestionrh.services;

import com.yass.gestionrh.entities.Employee;
import com.yass.gestionrh.entities.Position;

import java.util.List;

public interface IServiceEmployee {
    Employee createEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    List<Employee> findAllEmployees();
    void deleteEmployeeById(Long id);
    Employee findByPhoneNumber(String phone);
    List<Employee> findByPosition(Position position);
}
