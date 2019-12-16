package com.wildcodeschool.wildandwizard.entity;

import java.util.List;

import javax.persistence.*;

@Entity
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long capacity;
    private String country;

    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
    private List<Wizard> wizards;


    public School() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCapacity() {
        return this.capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Wizard> getWizards() {
        return this.wizards;
    }

    public void setWizards(List<Wizard> wizards) {
        this.wizards = wizards;
    }
    
}