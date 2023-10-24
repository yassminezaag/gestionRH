package com.yass.gestionrh.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee extends AuditModel{
    private String firstName, lastName;
    private LocalDate dateOfBirth;
    private String address;
    private String phoneNumber;
    private String email;
    private LocalDate dateOfHire;
    private String positionHeld;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    private Departement departement;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    private Position position;

    @OneToMany(mappedBy = "employee")
    @JsonManagedReference
    private List<PerformanceEvaluation> performanceEvaluations = new ArrayList<PerformanceEvaluation>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(email, employee.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email);
    }
}
