import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 18/12/2019
 */

public class Person {

    int navn; // Test Testesen
    int alder; // 18
    int by; // Næstved
    int postNummer; // 4700
    int vej; // Femøvej
    int husnummer; // 3B
    int nationalitet; // Dansk
    int fritidsinteresser; // Snitning, LOL, strikke
    int smarthomeDevices; // Xbox, 3 Smartlamper, Køleskab m.m.
    int hojde; // 1.56 m
    int vaegt;  // 76 kg
    int karaktergennemsnit; // 5.33
    int eksamensKarakterer; // 7, 12, -3, 4, 2, 10
    int opdateretDato; // Sun Jan 08 00:00:00 CET 1978


    public static void main(String[] args) {
        Date date = new Date("01/08/1978");
        System.out.println(date.toString());
    }

}
