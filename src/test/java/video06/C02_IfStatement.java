package video06;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz....");
        int not=input.nextInt();


        if (not>=90 && not<=100){
            System.out.println("Notunuz 'A - Cok iyi'dir.");
        } else if (not>=80 && not<90) {
            System.out.println("Notunuz 'B - Iyi'dir.'");
        }else if (not>=70 && not<80) {
            System.out.println("Notunuz 'C - Orta'dir.");
        }else if (not>=60 && not<70) {
            System.out.println("Notunuz 'D - Gecer'dir.");
        }else if (not>=0 && not<60) {
            System.out.println("Notunuz 'E - Zayif'dir.");
        }else {
            System.out.println("Lutfen gecerli bir not giriniz." +
                    "\nNotlar 0 ve 100 arasinda olmalidir.");
        }


    }
}
