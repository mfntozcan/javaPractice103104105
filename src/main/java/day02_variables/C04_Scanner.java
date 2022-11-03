package day02_variables;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {


    //  Soru 1)   Kullanicinin  girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini ekrana yazdiran programi yazdiriniz

       /* Scanner scanner1= new Scanner(System.in);
        System.out.println("4 basamakli bir sayi giriniz");

        int sayi= scanner1.nextInt();


        //Bir sayinin birler basamagini modulas" % " 10 ile hesaplatabiliriz

        int sonRakam=sayi%10;
        int ilkRakam=sayi/1000;
        System.out.println("ilk Rakam + Son rakam  =" + (ilkRakam+sonRakam));

        */

  //  Soru 2) Kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin

            /* Ornek : Inputs : 853
    Output : Girdiginiz sayinin birler basamagi : 3
             Girdiginiz sayinin onlar basamagi : 5
             Girdiginiz sayinin yuzler basamagi : 8

             */

        Scanner scan2=new Scanner(System.in);
        System.out.println("3 basamakli bir sayi giriniz ");
        int sayi2= scan2.nextInt();

        //**1 ler basamagindaki sayiyi bulmak icin

        int birler=sayi2%10;
        System.out.println("Girdiginiz sayinin birler basamagi "+birler);


        //Girilen sayinin onlar basamagi

        int onlar=(sayi2/10)%10;
        System.out.println("Girdiginiz sayinin onlar basamagi "+onlar);

        //Girilen sayinin yuzler basamagi

        int yuzler = (sayi2/100) ;
        System.out.println("Girdiginiz sayinin yuzler basamagi "+ yuzler);




//  Soru 2) Kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
       /* Arkadaşlar benim gibi sayısal konularda zayıf olan arkadaşlar için ufak bir açıklama yazayım belki bugün yaptığımız
       işlemler konusunda biraz da olsa izah edici olur.
İlk olarak '%' modulus işaretinden bahsedeyim. Bu işaret Java'da bize bir sayının bölümünden kalan sayıyı veriyor.
Yani 123 sayısını 10'a böldüğümüzde 3 kalıyor. Bu yüzden 123 % 10 dediğimizde sonuç 3 olarak karşımıza çıkıyor. Böylelikle üç basamaklı bu sayının birler basamağındaki sayıya ulaşıyoruz.
Daha sonra bu sayıyı 10'a bölüyoruz. Zira amacımız sayıdan bir basamak atmak. 123 / 10 deyince yani Sayıyı 10'a bölününce en sağda kalan küsuratlı sayı düşüyor. (123'ü 10'a böldüğümüzde sonuç 12,3 oluyor. Integer kullandığımız için küsurat alınmıyor ve elimizde 12 kalıyor.
Ardından bu sayıyı da yine modulus işlemi ile 10'a bölüyoruz. Yani 12 % 10. Ve elimizde 12'nin 10'a bölümünden kalan sayı yani 2 kalıyor. Böylelikle ortadaki sayıya da ulaşmış oluyoruz.
Son olarak bu son sayıyı tekrar 10'a bölerek yeniden bir tamsayıya ulaşmaya çalışıyoruz. 12 / 10 deyince elimizde 1 kalıyor. Çünkü 12'de 10 yalnızca bir defa var.
Yani bir modulus sonra bir bölme işlemi yapıyoruz. Umarım Aydınlatıcı olmuştur. Aklınızı karıştıran bir husus varsa sormaktan çekinmeyin. (edited)

        */









    }
}
