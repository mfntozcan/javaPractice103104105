package day03_ifStatement;

public class C02_AsciiDegerleri {


    public static void main(String[] args) {

        char harf= 'a';
        char harf2='A';

        System.out.println("harf>harf2 ==> "+(harf>harf2));//true. Karsilastirma islemlerinin sonucunun true yada false doner. boolean doner.

        //Buyuk harflarin ASCII degerleri, kucuk harflerin ASCII degerlerinden daha kucuktur.

        //Ex.1: Herhangi bir char veriable nin ASCII degerlerini kod yazarak bulunuz.

        //1 Yol;

        char space=' ';
        System.out.println("Space nin ASCII degeri :" + (space+0));//32; space nin ASCII degerini hesaplamak icin toplamaya etkisi olmayan '0'
        //seceriz. Boylece yazdirdigimiz deger bize spacenin ASCII degerini veririr.

        char m='m';
        System.out.println("m nin ASCII degeri :" + (m+0));//109

        //2nci yol:

        //char larda Java char karekteri int de atayabiliriz. Cunku char in bir resim karekteri birde sayisal matematiksel ASCII degeri vardir.
        //Bu nedenle ASCII degerlerini hesaplayabiliriz.

        int harf3='m';
        System.out.println("m'nin ASCII degeri = " + harf3);//109\


        byte b1=12;
        byte b2=-125;

        System.out.println("b1>b2==> "+(b1>b2));

        float f1 = 2.45645f;
        float f2 = 5.86786F;

        System.out.println("f1>f2 ==> "+(f1>f2));
        System.out.println("b1>f1 ==> "+(b1>f1));

        long lng1 = 5456456464L;
        System.out.println("b1<lng1 ==> "+(b1<lng1));//true

        char ch='h';
        System.out.println("b1>ch  ==> "+(b1<ch));








    }
}
