package com.yass.gestionrh.services;

import com.yass.gestionrh.entities.Position;
import com.yass.gestionrh.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PositionService implements IPositionService{
    @Autowired
    PositionRepository positionRepository;
    @Override
    public Position createPosition(Position position) {
        return positionRepository.save(position);
    }

    @Override
    public List<Position> findAllPost() {
        return positionRepository.findAll();
    }

    @Override
    public void deletePostById(Long id) {
        positionRepository.deleteById(id);
    }

    @Override
    public Position updatePost(Position position) {
        return positionRepository.saveAndFlush(position);
    }
}
