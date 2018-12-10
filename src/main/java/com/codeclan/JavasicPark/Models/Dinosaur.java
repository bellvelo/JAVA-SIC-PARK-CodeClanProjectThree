package com.codeclan.JavasicPark.Models;

import com.fasterxml.jackson.annotation.JsonValue;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="dinosaurs")
public class Dinosaur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="name")
    private String name;

    @Column(name ="dino_species")
    private DinoSpecies dinoSpecies;

    @Column(name = "dino_diet")
    private DinoDietType dinoDietType;
    @Column(name = "image_path")
    private String dinoImage;


    @ManyToOne
    @JoinColumn(name = "paddock_id", nullable = false) //means we can only create a dino if it has a paddock
    private Paddock paddock;


    public Dinosaur(String name, DinoSpecies dinoSpecies, DinoDietType dinoDietType, Paddock paddock,
                    String dinoImage) {
        this.name = name;
        this.dinoSpecies = dinoSpecies;
        this.dinoDietType = dinoDietType;
        this.paddock = paddock;
        this.dinoImage = dinoImage;
    }

    public Dinosaur() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonValue
    public DinoSpecies getDinoSpecies() {
        return dinoSpecies;
    }

    public void setDinoSpecies(DinoSpecies dinoSpecies) {
        this.dinoSpecies = dinoSpecies;
    }

    public DinoDietType getDinoDietType() {
        return dinoDietType;
    }

    public void setDinoDietType(DinoDietType dinoDietType) {
        this.dinoDietType = dinoDietType;
    }

    public String getDinoImage() {
        return dinoImage;
    }

    public void setDinoImage(String dinoImage) {
        this.dinoImage = dinoImage;
    }

    public Paddock getPaddock() {
        return paddock;
    }

    public void setPaddock(Paddock paddock) {
        this.paddock = paddock;
    }

//    TODO remove dino (front end)
//    TODO add dino (front end)

}
