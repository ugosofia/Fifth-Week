package java.ripasso3;

public class Esame {

    private String nome;
    private int crediti;
    private int voto;


    public Esame(String NomeEsame, int numCrediti){
        nome = NomeEsame;
        crediti = numCrediti;
    }


    public String getNome(){
        return nome;
    }

    public String getCrediti(){
        return "" + crediti;
    }

    public String getVoto(){
        return voto + "";
    }

    public void setVoto(int unVoto){
        this.voto = unVoto;
    }

    @Override
    public String toString() {
        return "Esame{" +
                "nome='" + nome + '\'' +
                ", crediti=" + crediti +
                ", voto=" + voto +
                '}';
    }
}
