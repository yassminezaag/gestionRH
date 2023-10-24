package com.yass.gestionrh.services;

import com.yass.gestionrh.entities.Departement;

import java.util.List;

public interface IDepartementService {
    Departement createDepartement(Departement departement);
    List<Departement> findAllDepart();
    void deleteDepartById(Long id);
}
