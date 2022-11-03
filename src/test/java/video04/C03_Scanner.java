package video04;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        /*Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz...");

       // String kullaniciIsmi= scan.next();

        System.out.println("Lutfen dairenin yaricapini giriniz.");
        double r=scan.nextDouble();

        double cemberinCevresi= 2*3.14*r;

        double ceberinAlani=3.14*r*r;

        System.out.println("cemberinCevresi = " + cemberinCevresi);
        System.out.println("ceberinAlani = " + ceberinAlani);

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen diktorgenin kisa kenarini yaziniz.");
        double kisaKenar=input.nextDouble();

        System.out.println("Lutfen uzun kenar uzunlugunu giriniz...");
        double uzunKenar= input.nextDouble();

        double alan= kisaKenar*uzunKenar;

        double cevre= 2 *(uzunKenar+kisaKenar);
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);

        System.out.println("Lutfen ucgenin a cevresini giriniz...");
        byte a=input.nextByte();
        System.out.println("Lutfen ucgenin b kenar uzunlugunu giriniz...");
        byte b=input.nextByte();
        System.out.println("Lutfen ucgenin c kenarinin uzunlugunu giriniz.");
        byte c=input.nextByte();

        byte cevresi= (byte) (a+b+c);
        System.out.println("cevresi = " + cevresi);

         */

        System.out.println("  A  \n A A \nA A A");

        Scanner input=new Scanner(System.in);

        System.out.println("Lutfen bir simge giriniz.");
        char sembol =input.next().charAt(0);

        System.out.println("  "+sembol+"  ");
        System.out.println( " "+sembol+" "+sembol+" ");
        System.out.println(sembol+" "+sembol+" "+sembol);












    }
}
