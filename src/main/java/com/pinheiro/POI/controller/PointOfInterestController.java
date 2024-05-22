package com.pinheiro.POI.controller;

import com.pinheiro.POI.dtos.PointOfInterestDTO;
import com.pinheiro.POI.entity.PointOfInterest;
import com.pinheiro.POI.service.PointOfInterestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/points-of-interest")
public class PointOfInterestController {

    @Autowired
    private PointOfInterestService service;
    @PostMapping
    public ResponseEntity<Void> createPoi(@RequestBody PointOfInterestDTO data){
        service.createPoi(data);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public List<PointOfInterest> getAll(){
        return service.getAll();
    }
}
