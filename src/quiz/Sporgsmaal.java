/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 17/12/2019
 */
package quiz;

import java.security.InvalidParameterException;

public class Sporgsmaal implements Translatable {

    private String sporgsmaalsTekst;
    private int point;
    private Svar svar[];
    private int rigtigeSvarIndex;

    public String getSporgsmaalsTekst() {
        return sporgsmaalsTekst;
    }

    public void setSporgsmaalsTekst(String sporgsmaalsTekst) {
        this.sporgsmaalsTekst = sporgsmaalsTekst;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Svar[] getSvar() {
        return svar;
    }

    public void setSvar(Svar[] svar) {
        //if (sporgsmaal.length()>100) { throw InvalidParameterException(Exception ex);}
        this.svar = svar;
    }

    public int getRigtigeSvarIndex() {
        return rigtigeSvarIndex;
    }

    public void setRigtigeSvarIndex(int rigtigeSvarIndex) {
        this.rigtigeSvarIndex = rigtigeSvarIndex;
    }

    @Override
    public String translate(Language language) {
        return null;
    }
}
