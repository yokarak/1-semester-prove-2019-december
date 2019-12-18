/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 17/12/2019
 */
package quiz;

import java.security.InvalidParameterException;

public class Sporgsmaal {

    private String sporgsmaal;
    private int point;
    private Svar svar[];
    private int rigtigeSvarIndex;

    public String getSporgsmaal() {
        return sporgsmaal;
    }

    public void setSporgsmaal(String sporgsmaal) {
        this.sporgsmaal = sporgsmaal;
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
}
