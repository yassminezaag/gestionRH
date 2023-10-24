package com.yass.gestionrh.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Position extends AuditModel{
    private String positionName;
    private String description;
    @OneToMany(mappedBy = "position")
    @JsonManagedReference
    Set<Employee> employees = new HashSet<Employee>();
}
