package Quiz;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Spørgsmål implements Translatable{
        private int point;
        private int rigtigeSvarIndex; // det nummer det rigtige spørgsmål er i array oven over
        private String spoergmael;
        private Svar[] svar;






    public String getSpoergmael() {
        if (spoergmael.length() >=100) {
            throw new IllegalArgumentException ("Spørgsmål må maks være 100 tegn");
        }
        return spoergmael;
    }

    public void setSpoergmael(String spoergmael) {
        if (spoergmael.length() >= 100) {
            throw new IllegalArgumentException("Spørgsmål må maks være 100 tegn");
        }
        this.spoergmael = spoergmael;
    }

    public void setSvar(Svar[] svar) {
        this.svar = svar;
    }


    @Override
    public String translate(Language l) {

    }
}
