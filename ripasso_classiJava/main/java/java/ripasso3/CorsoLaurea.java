package java.ripasso3;

import java.util.ArrayList;
import java.util.Random;

public class CorsoLaurea {

    private String nome;
    private ArrayList<Studente> immatricolati;
    public static int prossimaMatricola;
    public static final int MIN_CREDITI = 180;


    public CorsoLaurea(String unNomeStudente){
        nome = unNomeStudente;
    }


    public String getNome(){
        return nome;
    }

    public void iscrivi(String unNomeStudente){
        Studente s = new Studente(unNomeStudente, prossimaMatricola);
        immatricolati.add(s);
        prossimaMatricola++;
    }

    public void ritira(String unNomeStudente){
        Studente s = trovaStudente(unNomeStudente, immatricolati);
        if (s != null)
            immatricolati.remove(s);
    }

    public void appello(String unNomeEsame, ArrayList<Studente> iscritti){
        Random r = new Random();
        int voto;
        for (Studente s: iscritti
             ) {
            voto = r.nextInt(30);
            if(voto > 17)
            s.promosso(unNomeEsame, voto);
        }
    }

    public void laurea(){
        for (Studente s : immatricolati
             ) {
            if (s.crediti() >= MIN_CREDITI)
                immatricolati.remove(s);
        }
    }

    public static Studente trovaStudente(String nome, ArrayList<Studente> list) {
        for (Studente s: list
             ) {
            if(s.getNome().equals(nome))
                return s;
        }
        return null;
    }
}
