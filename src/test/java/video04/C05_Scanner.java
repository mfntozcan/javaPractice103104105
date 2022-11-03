package video04;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bes basamakli bir sayi giriniz....");

        int sayi= input.nextInt();

        int ilkRkm=sayi/10000;
        System.out.println(ilkRkm);



        int ilkIknci=sayi/1000%10;
        System.out.println(ilkIknci);

        int sonRakam=sayi%10;
        System.out.println(sonRakam);

        int sondanIkinci=sayi/10%10;
        System.out.println(sondanIkinci);

       int sum=sonRakam+sondanIkinci+ilkIknci+ilkRkm;
        System.out.println("sum = " + sum);


    }
}
