import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 13/12/2019
 */

public class Quickmaths {


    public static void main(String[] args) {
        Start();


    }

    static int gennemsnit(int a, int b) {
        return (a+b)/2;  // mest simplificerede muligt, ellers int result =(a+b)/2; => return result;
    }

   static int sum(int a, int b) {
        return a+b;
    }

    static void Start() {
        Scanner input = new Scanner(System.in);
        boolean running=true;
        while (running){
            System.out.print("Indtast A: ");
            int a = input.nextInt();
            System.out.print("Indtast B: ");
            int b = input.nextInt();
            System.out.println("Sum: "+sum(a,b));
            System.out.println("Gennemsnit: "+gennemsnit(a,b));
            if (a+b==0) {running=false;}
            if (running==false) {
                System.out.println("Exiting Program");
                break;
            }
        }
    }


}
