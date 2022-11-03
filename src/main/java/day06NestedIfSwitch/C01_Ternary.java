package day06NestedIfSwitch;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {

/*
TASK :
 Kullanıcıdan sifirdan buyuk pozitif bir tamsayı girmesini isteyin.
 Girilen pozitif tamsayı 3 basamaklı ise ekrana "3 Basamaklı" yazdırın.
 3 basamaklı degilse çift olup olmadigini kontrol edin.
 Çift ise "3 basamaklı olmayan çift sayı" yazdırın.
 Çift sayı degilse "3 basamaklı olmayan tek sayı yazdırın."
 */




       Scanner input= new Scanner(System.in);
        System.out.println("Lutfen bir pozitif bir sayi giriniz...");
        int sayi = input.nextInt();

        System.out.println();

        System.out.println("Ternary ile cozum");

        String sonuc = (sayi>0)  ?   (sayi>99 && sayi<1000) ?("3 Basamakli 0'dan buyuk sayi")  :
                (sayi%2==0)     ?   ("3 Basamakli olmayan cift sayi") : ("3 Basamakli olmayan tek sayi")  :
                "Lutfen sifirdan buyuk bir sayi giriniz...";
        System.out.println(sonuc);

        System.out.println("****if else ******");
        if (sayi>0){
            if (sayi<1000 && sayi>99){
                System.out.println("Uc basamakli pozitif sayi");
            } else if (sayi%2==0) {
                System.out.println("Uc basamakli olmayan cift sayi");
            }else
                System.out.println("Uc basamakli olamyan tek sayi");
        }else
            System.out.println("Lutfen sifirdan buyuk bir tamsayi giriniz....");










    }
}
