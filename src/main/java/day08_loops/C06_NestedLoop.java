package day08_loops;

public class C06_NestedLoop {

    public static void main(String[] args) {


        /*Bu seklin konsolda yazdiracak kodu yaziniz...

         *
         * *
         *   *
         *     *
         *********


         */


        for (int i = 1; i <= 5; i++) {//Burada satir kontrolu yapiyoruz.
            for (int j = 1; j <= 9; j++) {//Burada da sutun kontrolunu yaptik.

                if ((i == 1 && j == 5)
                        || (i == 2 && (j == 4 || j == 6)) ||
                        (i == 3 && (j == 3 || j == 7)) ||
                        (i == 4 && (j == 2 || j == 8)) ||
                        i == 5) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        System.out.println();



        for (int a = 1; a <= 6; a++) {

            for (int b = 1; b <= a - 1; b++) {
                System.out.print(" ");
            }
            for (int c = a; c <= 6; c++) {
                System.out.print(c +" ");
            }
            System.out.println();
        }
    }
}
