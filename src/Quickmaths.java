import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 13/12/2019
 */

public class Quickmaths {

    public static void main(String[] args) {
        Quickmaths q = new Quickmaths();
        q.start();
    }

    public void start() {
        System.out.println("**** Quickmaths ****");
        Scanner s = new Scanner(System.in);
        int a = 1, b = 0;
        while (a != 0 || b != 0) {
            System.out.print("Indtast A: ");
            a = s.nextInt();
            System.out.print("Indtast B: ");
            b = s.nextInt();
            System.out.println("Sum: " + sum(a, b));
            System.out.println("Gennemsnit: " + gennemsnit(a, b));
            System.out.println("--------------");
        }
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public double gennemsnit(int a, int b) {
        return (a + b) / 2;
    }
}
