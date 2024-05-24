package com.pinheiro.POI.configs;

import com.pinheiro.POI.entity.PointOfInterest;
import com.pinheiro.POI.repository.PointOfInterestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.util.Collections;

public class Instantiation extends CommandLineRunner {
    @Autowired
    private PointOfInterestRepository repository;

    @Override
    public void run(String... args) throws Exception {
        PointOfInterest poi1 = new PointOfInterest("Lanchonete", 27, 12);
        PointOfInterest poi2 = new PointOfInterest("Posto", 31, 18);
        PointOfInterest poi3 = new PointOfInterest("Joalheria", 15, 12);
        PointOfInterest poi4 = new PointOfInterest("Floricultura", 19, 21);
        PointOfInterest poi5 = new PointOfInterest("Pub", 12, 8);
        PointOfInterest poi6 = new PointOfInterest("Supermercado", 23, 6);
        PointOfInterest poi7 = new PointOfInterest("Churrascaria", 28, 2);

        repository.saveAll(Collections.list(poi1, poi2, poi3, poi4, poi5, poi6, poi7));
    }
}
