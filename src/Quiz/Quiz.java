package Quiz;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Spørgsmål SM = new Spørgsmål();

        SM.setSpoergmael("Hvordan beregnes P/E");
        SM.setSvar("aktiekurs/EPS","Aktiekurs/egenkapital","Aktiekurs/udbytte","noget helt fjerde");
        SM.setRigtigeNummer(0);


        System.out.println(SM.getSpoergmael());
        System.out.println(SM.getSvar());
        int geat =input.nextInt();
        if (geat==SM.getRigtigeNummer()) {
            System.out.println("du gættede korrekt!");
            SM.setPoint(+2);
            SM.getPoint();
        } else System.out.println("desværre");

    }
}
