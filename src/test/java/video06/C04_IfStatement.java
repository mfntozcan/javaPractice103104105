package video06;

import java.util.Scanner;

public class C04_IfStatement {
    public static void main(String[] args) {


        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen meslek kisaltmasinizi giriniz\n " +
                "Meslek kisaltmalari; 'QA', 'DEV', 'BA', ve 'PM'dir.");
        String jobTitle=input.next();

        if (jobTitle.equalsIgnoreCase("qa")){
            System.out.println("Mesleginiz; Quality Analsty");
        } else if (jobTitle.equalsIgnoreCase("dev")) {
            System.out.println("Developer");
        } else if (jobTitle.equalsIgnoreCase("ba")) {
            System.out.println("Business analyst");
        } else if (jobTitle.equalsIgnoreCase("pm")) {
            System.out.println("Project Manager.");
        }else System.out.println("Lutfen gecerli bir JobTitle giriniz.");


    }
}
