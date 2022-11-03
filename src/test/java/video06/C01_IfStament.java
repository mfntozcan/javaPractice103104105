package video06;

import java.util.Scanner;

public class C01_IfStament {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Y/N harf ikilisinden birisini giriniz.");
        char ch = input.next().charAt(0);

        if (ch == 'Y' || ch == 'y') {
            System.out.println("YES");

        } else if (ch == 'N' || ch == 'n') {
            System.out.println("NO");

        } else {
            System.out.println("Gecersiz harf girdiniz.\n" +
                    "Lutfen Y ve N harflerinden birisini giriniz.");
        }

        System.out.println("Lutfen kilonuzu giriniz");


    }

}
