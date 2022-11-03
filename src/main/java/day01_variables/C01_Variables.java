package day01_variables;

public class C01_Variables {

    //PROJE OLUSTURMA===>File==>New==>Project==>Next==>Name(Buraya projenin ismini yaz kucuk harfle basla javaPractice103104105)==>finish

//PACKAGE OLUSTURMA==>java dosyasina sag click==>New==>Package==>istedigin ismi yaz kucuk harfle basla( day01_variables )

//CLASS OLUSTURMA==>olusturdugun package uzerine sag click==>New==Class==> istedigin ismi yaz buyuk harfle basla ( C01_Variables )


  /*
   Variable
     bellekte (memory) ayrilmis olan alanin (reserved area) adidir.
     Variable icinde deger saklayan bir konteynirdir
   //bir variable oluştururken içerisine koyacağimiz datanın değer alabileceği değerlere uygun bir data türü seçmeliyiz
   //örneğin bir şehrin nufusundan bahsediyorsak variablemızın data türü String,boolean,char veya double alamayız
   //geriye kalan tamsayı  turlerınden şehrin nufusunu içine alabilecek büyüklükte bir data turu seceebiliriz
   //kurs boyunca genelde tam sayılar için int ondalıklı sayılar için double kullanacagız
    */

    public static void main(String[] args){
        System.out.println("Hello World");

        int level=1; // cümle sonuna mutlaka noktalı virgül konulmalı.
        System.out.println("level = " + level);


        boolean ogrenciMi = true;
        boolean yagısVarMı = false;
        System.out.println("ogrenciMi = " + ogrenciMi);
        System.out.println("yagısVarMı = " + yagısVarMı);

       char sembol = '&';
       char ch = '2';
        System.out.println("sembol = " + sembol);
        System.out.println("ch = " + ch);

        double a=0.2 , b=0.3;


        long populatinonWord = 7000000000L;
        long x = 1234;


        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("populatinonWord = " + populatinonWord);
        System.out.println("x = " + x);


    //çoklu yorum satırı sağ tarafı



    }




}
