package com.yass.gestionrh.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PerformanceEvaluation extends AuditModel{
    private String employeeEvaluated;
    private String evaluateur;
    private Date evaluationDate;
    private int givenMark;
    @ManyToOne
    @JsonBackReference
    private Employee employee;

}
