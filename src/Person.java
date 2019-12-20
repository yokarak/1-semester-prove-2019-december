/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 18/12/2019
 */

public class Person {


    String navn; // Test Testesen
    short alder; // 18
    String by; // Næstved
    short postNummer; // 4700
    String vej; // Femøvej
    short husnummer; // 3B
    String nationalitet; // Dansk
    String fritidsInteresser; // Snitning, LOL, strikke
    String smarthomeDevices; // Xbox, 3 Smartlamper, Køleskab m.m.
    int hojde; // 1.56 m TypeCasting eksempel
    double vaegt;  // 76 kg    de halve kilo er jo vigtigt ;-)
    double karaktergennemsnit; // 5.33
    int eksamensKarakterer; // 7, 12, -3, 4, 2, 10       man kan da kun få 7 eller op ad, hvad laver -3 der :-D
    String opdateretDato; // Sun Jan 08 00:00:00 CET 1978


    @Override
    public String toString() {
        return "Navn: " + navn + "\nBy: " + by + "\nAlder: " +alder+ "\nPostNummer: " +postNummer + "\nVej " + vej + "\nHusnummer: " +husnummer
        + "\nNationalitet: " + nationalitet + "\nFritidsInteresser: " + fritidsInteresser + "\nSmartHomeDevices: " + smarthomeDevices + "\nHøjde: "
        + hojde + "\nVægt: " + vaegt + "\nEksamensKarakterer: " + eksamensKarakterer + "\nKarakterGennemsnit: " + karaktergennemsnit +
        "\nOpdateret Dato: " + opdateretDato;
    } // bemærk at pga. af at højde bliver typecasted to int, så fjernes 0.8 helt og derved er næsten halveret i værdi

    public static void main(String[] args) {

        Person person = new Person();
        person.navn = "Anders Bille";
        person.by = "Sakskøbing ";
        person.alder =23;
        person.postNummer = 4990;
        person.vej = "arhh, den får i dog ikke, eller har i lyst til at brænde stedet ned? :D ";
        person.husnummer =3;
        person.nationalitet = "Dansk";
        person.fritidsInteresser = "min forlovede, hund, Aktier, gaming og serie/film for resten af tiden ";
        person.smarthomeDevices ="gælder en hund der spiser ting, så man skal købe nyt? eller varmer ens føder når man gamer?";
        person.hojde = (int) 1.80;
        person.vaegt =84;
        person.eksamensKarakterer = 7; // håber jeg da :D
        person.karaktergennemsnit = 6.9;
        person.opdateretDato ="Fri Dec 20 10:14:03 CET 2019";
        System.out.println(person);
    }

}
