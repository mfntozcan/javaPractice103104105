package video06;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz.");
       /* String gunIsmi = input.next().toLowerCase();

        if (gunIsmi.equals("cuma")) {
            System.out.println("Muslumanlar icin kutsal gun");
        } else if (gunIsmi.equals("cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");
        } else if (gunIsmi.equals("pazar")) {
            System.out.println("Hristiyanlar icin kutsal gun");
        } else {
            System.out.println("Lutfen gecerli bir gun giriniz....");
        }

        */

        String gunIsmi= input.next();

        if (gunIsmi.equalsIgnoreCase("cuma")){
            System.out.println("Muslumanlar icin Kutsal gun");
        }
        if (gunIsmi.equalsIgnoreCase("cumartesi")){
            System.out.println("Yahudiler icin kutsal gun");
        }
        if (gunIsmi.equalsIgnoreCase("pazar")){
            System.out.println("Hristiyanlar icin kutsal gun");
        }
        if (!gunIsmi.equalsIgnoreCase("cuma") && !gunIsmi.equalsIgnoreCase("cumartesi") && !gunIsmi.equalsIgnoreCase("pazar")){
            System.out.println("Kutsal gun degildir....");
        }

    }
}
