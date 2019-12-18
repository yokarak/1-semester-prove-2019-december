/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 13/12/2019
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public String hello(String navn) {
        if (navn.length() == 0) {
            return "Hello World!";
        }
        return "Hello " + navn + "!";
    }
}
