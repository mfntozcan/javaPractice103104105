package day13_overrideingoverloadingstatickeywords;

public class C02_Overloading {
    public static void main(String[] args) {

        // Overloading; bir kisiye birden fazla gorev diyebiliriz. mahmut==>baba,es, ogul,kardes....
        //ayni Classta ayni ismimde method olusturmak icin method signature digistirilir.

        cikarma(98, (float) 52.666);

        cikarma(14.5, 3);

        toplama(55, 66);

        toplama(2.3, 4.5);

        carpma(2, 3);

        carpma(8.9, 32);


    }//main
    //data typleri degistirilerek overloading yapilmasi...

    private static void carpma(double v, int i) {
        System.out.println("double ile int carpma yapildi " + (v * i));
    }

    private static void carpma(int i, int i1) {
        System.out.println("Iki int deger carpma yapildi.." + (i * i1));
    }

    private static void toplama(double v, double v1) {
        System.out.println("iki double deger toplandi " + (v + v1));
    }

    private static void toplama(int i, int i1) {
        System.out.println("Iki int deger toplandi " + (i + i1));
    }

    private static void cikarma(double v, int i) {
        System.out.println("double ile int cikarma yontemi ;" + (v - i));
    }


    private static void cikarma(int i, float v) {
        System.out.println("int bir deger ile float cikarma yontemi calisti. " + (i - v));
    }
// Parametrelerin sayisi arttirilarak overloading yapilmasi

    private static void toplama(double v, double v1, double v2, double v3) {
        System.out.println("iki double deger toplandi " + (v + v1 + v2 + v3));
    }

    // data turleri farkli oldugunda arametrelerin yerini degistirilerek overloading yapilmasi...
    public static void carpma(int a, double b) {
        System.out.println("Ilki double ikincisi int  deger carpma yapildi.." + (a * b));
    }

    public static void carpma(double a, float b) {
        System.out.println("Ilki double ikincisi int  deger carpma yapildi.." + (a * b));
    }
}
