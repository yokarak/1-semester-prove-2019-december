import java.util.Arrays;
import java.util.Collections;
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

    public static void main(String[] args) {
        Loops l = new Loops();
        l.printBrugereArr();
        System.out.println("*******");
        l.printBrugereReverseArr();
        System.out.println("*******");
        l.waitingFor0();
    } // jeg var usikker på om jeg skulle blive ved med at printe brugerne, for hver gang der blev gættet
    //men det var ikke sådan på billedet så lod vær

    /**
     * Viser en liste med brugere i konsollen
     */
    public void printBrugereArr() {

        String brugere[] = {"Anders ", "Birgit ", "Carsten ", "Dennis ", "Esben "};
        for (int i =0; i<brugere.length; i++) {
            System.out.print(brugere[i]);
        }
        System.out.println("");
    }
    /**
     * Viser en liste med brugere i konsollen i omvendt rækkefølge
     */
    public void printBrugereReverseArr() {

        Collections.reverse(Arrays.asList(brugere));
        System.out.println(Arrays.asList(brugere));

    }

    public void waitingFor0() {
        Scanner input = new Scanner(System.in);
        int number = 1;
        while (number != 0) {
            System.out.print("Venter på 0! Skriv et tal... " );
            number =input.nextInt();
        }
        if (number==0) {
            System.out.println("Du har tastet 0. Så er det slut!");
        }
    }
}
