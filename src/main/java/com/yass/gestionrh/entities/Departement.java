package com.yass.gestionrh.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Departement extends AuditModel{
    private String departementName;
    private String description;

    @OneToMany(mappedBy = "departement")
    @JsonManagedReference
    Set<Employee> employees = new HashSet<Employee>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Departement that = (Departement) o;
        return Objects.equals(departementName, that.departementName) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departementName, description);
    }

}
