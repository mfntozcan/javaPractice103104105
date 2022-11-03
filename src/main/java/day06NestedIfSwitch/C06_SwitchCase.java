package day06NestedIfSwitch;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {

        //Ex: Girilen Pozitif 3 basamaklı bir sayıyı yazı ile yazdırınız
        //Ex : 568
        //Besyuzaltmissekiz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Pozitif uc basamakli bir sayi giriniz...");
        int sayi = input.nextInt();

        int bilerBas = (sayi % 10);
        int onlerBas = (sayi / 10) % 10;
        int yuzlerBas = (sayi / 100);

        if (sayi > 99 && sayi < 1000) {
            //100 ler basamagi

            switch (yuzlerBas) {
                case 0:
                    System.out.print(" ");
                case 1:
                    System.out.print("Yuz");
                    break;
                case 2:
                    System.out.print("ikiyuz");
                    break;
                case 3:
                    System.out.print("UcYuz");
                    break;
                case 4:
                    System.out.print("Dortyuz");
                    break;
                case 5:
                    System.out.print("Besyuz");
                    break;
                case 6:
                    System.out.print("Altiyuz");
                    break;
                case 7:
                    System.out.print("Yediyuz");
                    break;
                case 8:
                    System.out.print("Sekizyuz");
                    break;
                case 9:
                    System.out.print("Dokuzyuz");
                    break;
            }

                switch (onlerBas) {

                    case 1:
                        System.out.print(" on");
                        break;
                    case 2:
                        System.out.print(" yirmi");
                        break;
                    case 3:
                        System.out.print(" otuz");
                        break;
                    case 4:
                        System.out.print(" kirk");
                        break;
                    case 5:
                        System.out.print(" elli");
                        break;
                    case 6:
                        System.out.print(" altmis");
                        break;
                    case 7:
                        System.out.print(" yetmis");
                        break;
                    case 8:
                        System.out.print(" seksen");
                        break;
                    case 9:
                        System.out.print(" doksan");
                        break;
                }

                    switch (bilerBas){

                    case 1:
                        System.out.print(" bir");
                        break;
                    case 2:
                        System.out.print(" iki");
                        break;
                    case 3:
                        System.out.print(" uc");
                        break;
                    case 4:
                        System.out.print(" dort");
                        break;
                    case 5:
                        System.out.print(" bes");
                        break;
                    case 6:
                        System.out.print(" alti");
                        break;
                    case 7:
                        System.out.print(" yedi");
                        break;
                    case 8:
                        System.out.print(" sekiz");
                        break;
                    case 9:
                        System.out.print(" dokuz");
                        break;

          }


        } else System.out.println("Lutfen 3 basamakli bir sayi giriniz...");


    }
}
