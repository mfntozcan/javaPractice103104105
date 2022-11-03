package day1_PracticeRepeat;


import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("  Lutfen isim ve soyisminizi giriniz..." );
        String isim=input.nextLine();

        System.out.println("Lutfen memleketinizi giriniz.");
        String memleket= input.nextLine();

        System.out.println("Lutfen yasinizi giriniz.");
        byte yas=input.nextByte();

        System.out.println("Lutfen boyunuzu giriniz...");
        short boy=input.nextShort();

        System.out.println("Lutfen javayi sevip sevmediginizi yaziniz.");
        boolean seviyorMut=input.hasNextBoolean();


    }
}
