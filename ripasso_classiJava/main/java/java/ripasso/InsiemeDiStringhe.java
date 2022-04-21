package java.ripasso;

public class InsiemeDiStringhe {

    private String[] insieme;

    public InsiemeDiStringhe(String[] T) {
        this.insieme = T;
    }

    public String stringaLunga() {
        int length = this.insieme.length;
        int indice = 0, max = 0;

        if(length == 0)
            return "Insieme vuoto";

        for (int i = 0; i < length; i++) {
            if(insieme[i].length() > max) {
                max = insieme[i].length();
                indice = i;
            }
        }
        return insieme[indice];

    }

    public String spaziStringa() {
        int numSpazi = 0, indice = 0, spaziCount = 0;
        int length = this.insieme.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < this.insieme[i].length(); j++) {
                if(this.insieme[i].charAt(j) == ' ')
                    spaziCount++;
            }
            if(spaziCount > numSpazi) {
                numSpazi = spaziCount;
                indice = i;
            }
            spaziCount = 0;
        }
        return this.insieme[indice];
    }

    public void preStringa(String pre) {
        for (String s: this.insieme
             ) {
            if(s.substring(0, pre.length()).equals(pre)) {
                System.out.println(s);
            }
        }
    }
}
