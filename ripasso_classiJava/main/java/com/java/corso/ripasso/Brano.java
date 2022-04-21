package com.java.corso.ripasso;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "BRANO")
public class Brano {

    @Id
    @Column(name = "brano_id")
    private String id;

    @Column(name = "nome")
    private String nome;

    @OneToMany(targetEntity=Autore.class, mappedBy="id",
            fetch=FetchType.EAGER)
    @JoinColumn(name = "Autore_id" )
    @Column(name = "autore")
    private List<Autore> autore;

    public List<Autore> getAutore() {
        return autore;
    }
    public void setAutore(List<Autore> list) {
        this.autore = list;
    }

    @Column(name = "genere")
    private String genere;


    @Column(name = "cd")
    private List<Cd> cd;
    @OneToMany
    @JoinColumn(name = "cd_id")
    public List<Cd> getCd() {
        return cd;
    }
    public void setCd(List<Cd> list) {
        this.cd = list;
    }


    public Brano() {
    }

    public Brano(String nome, List<Autore> autore, String genere,  List<Cd> cd) {
        this.nome = nome;
        this.autore = autore;
        this.genere = genere;
        this.cd = cd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

}
