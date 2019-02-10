package com.caffeine.coffee.pojo;

import javax.persistence.*;

@Entity
@Table(name = "Coffee")
public class Coffee {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private String location;

    @Column(name = "description")
    private String description;

    @Column(name = "roasttype")
    private String roasttype;

    @Column(name = "caffeeine")
    private String caffeeine;

    public Coffee(String name, String location, String description, String roasttype, String caffeeine) {
        this.name = name;
        this.location = location;
        this.description = description;
        this.roasttype = roasttype;
        this.caffeeine = caffeeine;
    }

    public Coffee() {
    }

    public Long getId() {
        return id;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRoasttype() {
        return roasttype;
    }

    public void setRoasttype(String roasttype) {
        this.roasttype = roasttype;
    }

    public String getCaffeeine() {
        return caffeeine;
    }

    public void setCaffeeine(String caffeeine) {
        this.caffeeine = caffeeine;
    }
}
