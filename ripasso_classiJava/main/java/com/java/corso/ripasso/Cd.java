package com.java.corso.ripasso;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "CD")
public class Cd {

    @Id
    @Column(name = "cd_id")
    private String id;

    @Column(name= "autore")
    private String autore;

    @Column(name = "genere")
    private String genere;


    public Cd() {
    }


    public Cd(String autore, String genere) {
        this.autore = autore;
        this.genere = genere;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }
}
