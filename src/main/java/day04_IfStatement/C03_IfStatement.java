package day04_IfStatement;

import java.util.Scanner;

public class C03_IfStatement {

    public static void main(String[] args) {


        //Kullanicidan bir gun alin
        // eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal  gun” yazdirin.
        // “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
        // “Pazar”  ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin

        //String'lerde == yerine equals kullanilmalidir. Cunku Java da iki tane memory var.
        //Bunlar Steack ve Heap tir.
        //String de referans degerine bakildigi icin == yerine equals kullanilir.


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz,,,");

        //1.Yol
/*
        String gun=input.next().toLowerCase();// toLowerCase == kucuk harf yapar.
        if (gun.equals("cuma")){
            System.out.println("Muslumanlar icin kutsal gun....");
        }
        if (gun.equals("cumartesı")){
            System.out.println("Yahudıler icin kutsal gun....");
        }
        if (gun.equals("pazar")){
            System.out.println("Hrıstıyanlar icin kutsal gun....");
        }
        if (!gun.equals("cuma") && !gun.equals("cumartesi") && !gun.equals("pazar")){
            System.out.println("Kutsal Gun Degil");
        }

 */
    /*    //2.Yol;

        String gun = input.next();
        if (gun.equalsIgnoreCase("cuma")){
            System.out.println("Muslumanlar icin Kutsal gun...");
        }
        if (gun.equalsIgnoreCase("cumartesi")){
            System.out.println("Yahudiler icin Kutsal gun...");
        }
        if (gun.equalsIgnoreCase("pazar")){
            System.out.println("hristiyanlar icin Kutsal gun...");
        }
        if (!gun.equalsIgnoreCase("cuma")&& !gun.equalsIgnoreCase("cumartesi")&& !gun.equalsIgnoreCase("pazar")){
            System.out.println("Kutsal Gun Degildir....");
        }

     */

        //3 Yol;

        String gun= input.next().toLowerCase();

        if (gun.equals("cuma")){
            System.out.println("Muslumanlar icin kutsal gun..");
        } else if (gun.equals("cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");
        } else if (gun.equals("pazar")) {
            System.out.println("Hiristiyanalr icin kutsal gun");
        } else   System.out.println("Kutsal Gun degil");


    }
}
