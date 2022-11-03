package day03_ifStatement;

public class C04_MantikOperatorleri {


    public static void main(String[] args) {


        System.out.println(5+2==8);//false

        boolean sonuc1=5>4 && 7<9 && 6+3==9 && 5+2!=8;
        System.out.println("sonuc1 ==>"+sonuc1);//true

        boolean sonuc2=5>4 && 7>9 && 6+3==9 && 5+2!=8;
        System.out.println("sonuc2 = "+sonuc2);//false

        boolean sonuc3=5>4 & 7>9 & 6+3==9 & 5+2!=8;
        System.out.println("sonuc2 = "+sonuc3);//false / Bunun sonucunu JAVA daha gec bulur. Cunku islemlerin tamaamini inceler.
        // Ama && isleminde ilk yanlisi buldukduktan sonra sonucu verir,

        int sayi1=12;
        //sayi1 in 10 ile 20 aralari[inda oldugu true diyerek dondurelim.

        // 10<sayi1<20 Java 3lu karsilastirma yapmaz.
        //ikili karsilastirmalar yapip Mantiksal operatorler ile birlestirmeliyiz.

        System.out.println(10<sayi1 && sayi1<20);//true ('&&' ve anlamindadir

        //Arkadaşlar ve nın sonucunun doğru olması için her iki şartında doğru olması gerekir, ama veya nın
        // sonucunun  doğru olması için sadece birinin doğru olması yeterlidir.




        int sayi2=5;
        //sayi2 nin 10 ile 20'nin arasinda olmadigini true diyerek donduren kod yazalim

        System.out.println("sayi2 10 ile 20 arasinda degildir : "+(sayi2<10 || sayi2<20));
        System.out.println(sayi2<10 || sayi2>20);// true ('||' veya anlamindadir) Veya mantik oporaturunde sarlardan
        // birinin dogru olmasi true bulmak icin yeterlidir









    }

}
