package com.yass.gestionrh.services;

import com.yass.gestionrh.entities.PerformanceEvaluation;

public interface IPerformanceEvaluationService {
    PerformanceEvaluation createPEvaluation(PerformanceEvaluation evaluation);
    void deletePEvaluationById(Long id);

}
