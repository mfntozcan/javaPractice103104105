package day02_variables;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {


    /*
  Soru 3) Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son 2 basamagindaki rakamlarin toplamini bulunuz
         *   Ex :
         *   input  : 12345==>1+2+4+5=12
         *   output : 12

     */
       /* Scanner input = new Scanner(System.in);
        System.out.println("lutfen 5 basamakli bir sayi giriniz");

        int sayi3 = input.nextInt();
        int birlerB = sayi3%10;
        int onlarB = (sayi3/10) % 10;
        int yuzlerB = (sayi3/100) % 10;
        int binlerB = (sayi3/1000) % 10;
        int onbinlerB = (sayi3/10000) % 10;
        int ilkIkib = onbinlerB + binlerB;
        int sonikiB = onlarB + birlerB;

        System.out.println("ilk iki rakam + son iki rakam= " + (ilkIkib+ sonikiB));

        */
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen 5 basamakli bir sayi giriniz");
        int num=input.nextInt();

        int ilkIkirkm=num / 1000;
        System.out.println("ilkIkirkm ="+ilkIkirkm);//12

        int ilkIkiTop = (ilkIkirkm%10)+(ilkIkirkm/10);//2+1
        System.out.println("ilkIkiTop ="+ ilkIkiTop);//3

        int sonIkiRkm = num%100;
        System.out.println("sonIkiRkm ="+sonIkiRkm);//45
        int sonIkiTop=(sonIkiRkm%10)+(sonIkiRkm/10);
        System.out.println("sonIkiTop ="+ sonIkiTop);

        int toplam=ilkIkiTop+sonIkiTop;
        System.out.println("Tomlam ="+toplam);

    }

}
