package day03_ifStatement;

import java.util.Scanner;

public class C05_IfStatement {

    public static void main(String[] args) {

        //Ex1:
        //Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
        // dort islemden biri ile isleme koyup sonucu yazdiriniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen \n toplama islemi icin 1\n cikarma islemi icin 2 \n bolme islemi icin 3 \n carpma islemi icin 4\n giriniz");

        int islem = input.nextInt();//kullanicinin islem tercihi icin bir veriable olusturduk.

        System.out.println("Lutfen iki tam sayi giriniz : ");//Kullaniciya bildirimde bulundum.

        double num1 = input.nextDouble();//1.sayi assig edildi.
        double num2 = input.nextDouble();//2.sayi assig edildi.

        if (islem == 1) {
            System.out.println("Toplama islemi sonucu : " + num1 + "+" + num2 +"=" + (num1 + num2));
        } else if (islem == 2) {
            System.out.println("Cikarma islemi sonucu : " + num1 + "-" + num2 + "=" + (num1 - num2));
        } else if (islem == 3) {
            System.out.println("Bolme islemi sonucu : " + num1 + "/" + num2 + "=" + (num1 / num2));
        } else if (islem == 4) {
            System.out.println("Carpma islemi sonucu : " + num1 + "*" + num2 + "=" + (num1 * num2));
        } else System.out.println("Hatali Giris Yaptiniz");

    }
}
