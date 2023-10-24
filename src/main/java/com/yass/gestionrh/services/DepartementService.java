package com.yass.gestionrh.services;

import com.yass.gestionrh.entities.Departement;
import com.yass.gestionrh.repository.DepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartementService implements IDepartementService{
    @Autowired
    DepartementRepository  departementRepository;
    @Override
    public Departement createDepartement(Departement departement) {
        return departementRepository.save(departement);
    }

    @Override
    public List<Departement> findAllDepart() {
        return departementRepository.findAll();
    }

    @Override
    public void deleteDepartById(Long id) {
        departementRepository.deleteById(id);
    }
}
