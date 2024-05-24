package com.pinheiro.POI.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "tb_pois")
@Entity(name = "tb_pois")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PointOfInterest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long x;
    private Long y;

    public PointOfInterest(String name, Long x, Long y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }
}
