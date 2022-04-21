package java.ripasso;

public class Main {
    public static void main(String[] args) {
        String[] array = {"ciao", "mondo", "numero di spazi ", "numero spazi" };


        InsiemeDiStringhe insieme = new InsiemeDiStringhe(array);
        insieme.preStringa("m");
        System.out.println("La stringa con più spazi è " +  insieme.spaziStringa());
        System.out.println(insieme.stringaLunga());


    }
}
