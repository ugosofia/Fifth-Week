package com.java.corso.ripasso;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "AUTORE")
public class Autore {

    @Id
    @Column(name = "Autore_id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name="brani")
    private List<Brano> brani;
    @OneToMany
    public List<Brano> getBrani() {
        return this.brani;
    }
    public void setBrani(List<Brano> list) {
        this.brani = list;
    }

    public Autore(String id, String name, List<Brano> list) {
        this.id = id;
        this.name = name;
        this.brani = list;
    }

    public Autore() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
