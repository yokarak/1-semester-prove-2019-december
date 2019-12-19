/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 19/12/2019
 */
package quiz;

public class Quiz extends Sporgsmaal {

    Sporgsmaal[] sporgsmaal = new Sporgsmaal[3];

    public Quiz() {
        sporgsmaal[1].setSporgsmaal("Hvad fejrer vi ved jul?");
        Svar[] svar = {new Svar("Jesu fødsel."), new Svar("Buddha fødsel"), new Svar("Anders and")};
    }

}
