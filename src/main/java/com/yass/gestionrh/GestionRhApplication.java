package com.yass.gestionrh;

import com.yass.gestionrh.entities.Departement;
import com.yass.gestionrh.entities.Employee;
import com.yass.gestionrh.entities.PerformanceEvaluation;
import com.yass.gestionrh.entities.Position;
import com.yass.gestionrh.services.DepartementService;
import com.yass.gestionrh.services.EmployeeService;
import com.yass.gestionrh.services.PerformanceEvaluationService;
import com.yass.gestionrh.services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class GestionRhApplication implements CommandLineRunner {
    @Autowired
    PerformanceEvaluationService performanceEvaluationService;
    @Autowired
    EmployeeService employeeService;
    @Autowired
    PositionService positionService;
    @Autowired
    DepartementService departementService;

    public static void main(String[] args) {
        SpringApplication.run(GestionRhApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Departement departement1 = new Departement();
        departement1.setDepartementName("Informatique");
        departement1.setDescription("Développer des applications");


        Position position1 = new Position();
        position1.setPositionName("Ingénieur");
        position1.setDescription("PO");

        Employee emp1 = new Employee();
        emp1.setFirstName("Yassmine");
        emp1.setLastName("Zaag");
        emp1.setEmail("yassminezaag99@gmail.com");
        emp1.setAddress("Sousse");
        emp1.setDateOfBirth(LocalDate.of(1999,01,25));
        emp1.setPhoneNumber("11111111");
        emp1.setDateOfHire(LocalDate.of(2023,05,26));
        emp1.setPositionHeld("Ingénieur");

        emp1.setPosition(position1);

        emp1.setDepartement(departement1);


        departement1.getEmployees().add(emp1);

        departementService.createDepartement(departement1);

        position1.getEmployees().add(emp1);

        positionService.createPosition(position1);



        employeeService.createEmployee(emp1);




        PerformanceEvaluation evaluation1 = new PerformanceEvaluation();
        evaluation1.setEmployeeEvaluated("Yassmine");
        evaluation1.setEvaluateur("Salim");
        evaluation1.setGivenMark(20);
        evaluation1.setEmployee(emp1);

        performanceEvaluationService.createPEvaluation(evaluation1);



    }
}
