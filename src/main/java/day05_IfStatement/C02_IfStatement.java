package day05_IfStatement;

import java.util.Scanner;

public class C02_IfStatement {

// Kullanicidan yasini isteyin
// 65 veya daha buyukse emekli olabilirsin
// 65'den kucukse emekli olamazsin "? sene daha calisman lazim" yazdirin

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yasinizi pozitif sayi olarak giriniz....");

        int yas = input.nextInt();

       /*  if (yas>=65){
            System.out.println("Emekli Olabilirsin");
        } else {
            System.out.print("Emekli olamazsiniz =");
            System.out.println(65-yas + " sene daha calismalisin");
        }

     */

        // Nested if else

        if (yas >= 0) {
            if (yas >= 65) {
                System.out.println("Emekli olabilirsin");
            } else {
                System.out.println("Emekli olamazsin...");
                System.out.println(65 - yas + "sene daha calismalisin..");
            }
        } else {
            System.out.println("Lutfen sifirdan buyuk bir sayi giriniz...");
        }


    }


}
