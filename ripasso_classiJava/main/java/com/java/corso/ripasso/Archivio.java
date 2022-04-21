package com.java.corso.ripasso;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ARCHIVIO")
public class Archivio {

    @Id
    private String id;


    @Column(name = "artista")
    private List<Autore> artisti;

    @OneToMany
    @JoinColumn(name="Autore_id")
    public List<Autore> getArtisti() {
        return artisti;
    }

    public void setArtisti(List<Autore> artisti) {
        this.artisti = artisti;
    }


    @Column(name = "cd")
    private List<Cd> cds;
    @OneToMany
    @JoinColumn(name="cd_id")
    public List<Cd> getCds() {
        return cds;
    }
    public void setCds(List<Cd> cds) {
        this.cds = cds;
    }


    @Id
    @Column(name = "genere")
    private String genere;

    public Archivio() {
    }

    public Archivio(List<Autore> artisti, List<Cd> cds, String genere) {
        this.artisti = artisti;
        this.cds = cds;
        this.genere = genere;
    }


    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }
}
