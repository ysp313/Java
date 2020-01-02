package com.wildcodeschool.wildandwizard.entity;

import java.util.*;

import javax.persistence.*;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "courses")
    private List<Wizard> wizards = new ArrayList<>();

    // ************constructeurs *************
    public Course() {
    }

    public Course(String name) {
        this.name = name;
    }


    // ************Getters & Setters*************
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


    public List<Wizard> getWizards() {
        return this.wizards;
    }

    public void setWizards(List<Wizard> wizards) {
        this.wizards = wizards;
    }

}
