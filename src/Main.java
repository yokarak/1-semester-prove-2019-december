/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 13/12/2019
 */

public class Main {

    public static void main(String[] args) {
        System.out.println(hello("András"));
    }
    // lidt bøvlet at bruge det der var i forvejen,
    // blev nød til at lave hello om til en klasseVariabel, grundet at PSVM er static og "ikke-Statiske" metoder ikke
    //kan blive kaldt i en static.

    public static String hello(String navn){
        String result = "hello";
      if (navn.equals("András")) {
          result = "Hello András";
      }else if (navn.equals(""))
      {result= "Hello World";}
      return result;
    }


}
