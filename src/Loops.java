import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 17/12/2019
 */

public class Loops {

    private String brugere[] = {"Anders", "Birgit", "Carsten", "Dennis", "Esben"};

    public String[] getBrugere() {
        return brugere;
    } 

    /**
     * Viser en liste med brugere i konsollen
     */
    public void printBrugereArr() {

        // TODO Din kode her
        for (int i = 0; i < brugere.length; i++) {
            System.out.print(brugere[i] + " ");
        }

        System.out.println();

    }

    /**
     * Viser en liste med brugere i konsollen i omvendt rækkefølge
     */
    public void printBrugereReverseArr() {
        // TODO Din kode her
        for (int i = brugere.length - 1; i >= 0; i--) {
            System.out.print(brugere[i] + " ");
        }
        System.out.println();

    }

    public void waitingFor0() {
        // TODO Din kode her
        Scanner scanner = new Scanner(System.in);
        System.out.print("Venter på 0! Skriv et tal... ");
        while (!scanner.next().equals("0")) {
            System.out.print("Venter på 0! Skriv et tal... ");
        }
        System.out.println("Du har tastet 0. Så er det slut!");
    }

    public static void main(String[] args) {
        Loops l = new Loops();
        l.printBrugereArr();
        System.out.println("*******");
        l.printBrugereReverseArr();
        System.out.println("*******");
        l.waitingFor0();

    }
}
