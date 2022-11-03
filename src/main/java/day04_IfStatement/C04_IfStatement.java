package day04_IfStatement;

import java.util.Scanner;

public class C04_IfStatement {

    public static void main(String[] args) {

    /*
 Print "Lutfen is unvaninizi girin
 jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
 Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
 Eger jobTitle  qa ise print is unvaniniz Quality Analyst
 test data: qa ise print Quality Analyst
 dev ise print Developer
 ba ise print Business Analyst
 pm ise print Project Manager
    */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Is Unvaninizi giriniz...");
        String jobtitle = input.nextLine().toLowerCase();

        if (jobtitle.equals("qa")) {
            System.out.println("Is unvani Quality Analyst");
        } else if (jobtitle.equals("dev")) {
            System.out.println("Mesleginiz Developer");
        } else if (jobtitle.equals("ba")) {
            System.out.println("Mesleginiz Business Analyst");
        } else if (jobtitle.equals("pm")) {
            System.out.println("Mesleginiz Project manager");
        }

    }
}
