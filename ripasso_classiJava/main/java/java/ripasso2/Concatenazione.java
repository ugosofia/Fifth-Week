package java.ripasso2;

public class Concatenazione {

    private String firstString;
    private String secondString;

    public Concatenazione(String firstString, String secondString) {
        this.firstString = firstString;
        this.secondString = secondString;
    }

    public String concatena() {
        String result = this.firstString;

        if(this.secondString.length() == 0)
            return result;

        firstString = result + secondString.charAt(0);
        secondString = secondString.substring(1);

        return concatena();
    }
}
