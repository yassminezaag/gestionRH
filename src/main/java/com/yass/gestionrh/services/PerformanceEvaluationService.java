package com.yass.gestionrh.services;

import com.yass.gestionrh.entities.PerformanceEvaluation;
import com.yass.gestionrh.repository.PerformanceEvaluationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerformanceEvaluationService implements IPerformanceEvaluationService{
    @Autowired
    PerformanceEvaluationRepository performanceEvaluationRepository;
    @Override
    public PerformanceEvaluation createPEvaluation(PerformanceEvaluation evaluation) {
        return performanceEvaluationRepository.save(evaluation);
    }

    @Override
    public void deletePEvaluationById(Long id) {
        performanceEvaluationRepository.deleteById(id);
    }
}
