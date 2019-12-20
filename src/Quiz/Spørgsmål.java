package Quiz;

public class Spørgsmål {
        private int point;
        private String svar[]; //
        private int rigtigeNummer; // det nummer det rigtige spørgsmål er i array oven over
        private String spoergmael;


    public String getSpoergmael() {
        if (spoergmael.length() >=100) {
            throw new IllegalArgumentException ("Spørgsmål må maks være 100 tegn");
        }
        return spoergmael;
    }

    public void setSpoergmael(String spoergmael){
        if (spoergmael.length() >=100) {
            throw new IllegalArgumentException ("Spørgsmål må maks være 100 tegn");
        }
        this.spoergmael = spoergmael;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String[] getSvar() {
        return svar;
    }

    public void setSvar(String svar, String svar2, String svar3, String svar4) {
        this.svar= new String[]{"svar", "svar2", "svar3", "svar4"};
    }

    public int getRigtigeNummer() {
        return rigtigeNummer;
    }

    public void setRigtigeNummer(int rigtigeNummer) {
        this.rigtigeNummer = rigtigeNummer;
    }


}
