package com.pinheiro.POI.configs;

import com.pinheiro.POI.entity.PointOfInterest;
import com.pinheiro.POI.repository.PointOfInterestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;

@Component
public class Instantiation implements CommandLineRunner {
    @Autowired
    private PointOfInterestRepository repository;

    @Override
    public void run(String... args) throws Exception {
        PointOfInterest poi1 = new PointOfInterest("Lanchonete", 27L, 12L);
        PointOfInterest poi2 = new PointOfInterest("Posto", 31L, 18L);
        PointOfInterest poi3 = new PointOfInterest("Joalheria", 15L, 12L);
        PointOfInterest poi4 = new PointOfInterest("Floricultura", 19L, 21L);
        PointOfInterest poi5 = new PointOfInterest("Pub", 12L, 8L);
        PointOfInterest poi6 = new PointOfInterest("Supermercado", 23L, 6L);
        PointOfInterest poi7 = new PointOfInterest("Churrascaria", 28L, 2L);

        repository.saveAll(Arrays.asList(poi1, poi2, poi3, poi4, poi5, poi6, poi7));
    }
}
