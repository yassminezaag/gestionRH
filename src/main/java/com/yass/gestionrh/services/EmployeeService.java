package com.yass.gestionrh.services;

import com.yass.gestionrh.entities.Employee;
import com.yass.gestionrh.entities.Position;
import com.yass.gestionrh.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IServiceEmployee {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.saveAndFlush(employee);
    }

    @Override
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Employee findByPhoneNumber(String phone) {
        return employeeRepository.findEmployeeByPhoneNumber(phone);
    }

    @Override
    public List<Employee> findByPosition(Position position) {
        return employeeRepository.findByPosition(position);
    }
}
