package com.yass.gestionrh.services;

import com.yass.gestionrh.entities.Position;

import java.util.List;

public interface IPositionService {
    Position createPosition(Position position);
    List<Position> findAllPost();
    void deletePostById(Long id);
    Position updatePost(Position position);
}
