package java.ripasso3;

import java.util.ArrayList;

public class Studente {

    private String nome;
    private int matricola;
    private ArrayList<Esame> esamiSostenuti;
    private ArrayList<Esame> pianoStudio;




    public Studente(String unNomeStudente, int unaMatricola){
        nome = unNomeStudente;
        matricola = unaMatricola;
    }


    public String getNome(){
        return nome;
    }
    public String getMatricola(){
        return matricola + "";
    }


    public void aggiungiEsame(String unNomeEsame, int numCrediti){
        Esame e = new Esame(unNomeEsame, numCrediti);
        pianoStudio.add(e);
    }


    public void promosso(String unNomeEsame, int unVoto){
        int crediti = 0;
        for (Esame e: pianoStudio
             ) {
            if (e.getNome().equals(unNomeEsame))
                crediti = Integer.parseInt(e.getCrediti());
        }
        Esame e  = new Esame(unNomeEsame, crediti);
        e.setVoto(unVoto);
        esamiSostenuti.add(e);
    }

    public void cancella(String unNomeEsame){
        Esame e = trovaEsame(unNomeEsame);
        pianoStudio.remove(e);
    }


    public double media(){
        double media = 0;
        for (Esame e: esamiSostenuti
             ) {
            media += Double.parseDouble(e.getVoto());
        }
        return media / esamiSostenuti.size();
    }


    public double crediti(){

        int creditiTot = 0;

        for (Esame e: esamiSostenuti
        ) {
            creditiTot += Integer.parseInt(e.getCrediti());
        }
        return creditiTot;
    }


    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", matricola=" + matricola +
                ", esamiSostenuti=" + esamiSostenuti +
                ", pianoStudio=" + pianoStudio +
                '}';
    }

    public Esame trovaEsame(String nome) {
        for (Esame e : pianoStudio
        ) {
            if(e.getNome().equals(nome))
                return e;
        }
        return null;
    }
}
