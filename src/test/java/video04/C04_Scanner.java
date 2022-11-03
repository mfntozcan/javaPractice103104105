package video04;


import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

       /* //1;
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen dort haneli bir sayi giriniz.");

        int sayi=input.nextInt();

        int sonRakam= (sayi%10);
        int ilkRakam=(sayi/1000);
        int sum=(ilkRakam+sonRakam);

        System.out.println(sonRakam);
        System.out.println(ilkRakam);
        System.out.println("sum = " + sum);

        */

        //2;

        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli bir sayi giriniz...");
        int sayi= input.nextInt();

        int birlerBasamagi= (sayi%10);
        int onlarBasamagi=(sayi/10%10);
        int yuzlerBasamagi= (sayi/100%10);


        System.out.println("birlerBasamagi = " + birlerBasamagi);
        System.out.println("onlarBasamagi = " + onlarBasamagi);
        System.out.println("yuzlerBasamagi = " + yuzlerBasamagi);









    }


}
