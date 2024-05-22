package com.pinheiro.POI.service;

import com.pinheiro.POI.dtos.PointOfInterestDTO;
import com.pinheiro.POI.entity.PointOfInterest;
import com.pinheiro.POI.repository.PointOfInterestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PointOfInterestService {

    @Autowired
    private PointOfInterestRepository repository;

    public void createPoi(PointOfInterestDTO dto){
        PointOfInterest newPoi = new PointOfInterest();
        newPoi.setName(dto.name());
        newPoi.setX(dto.x());
        newPoi.setY(dto.y());
        repository.save(newPoi);
    }

    public List<PointOfInterest> getAll(){
        return repository.findAll();
    }
}
