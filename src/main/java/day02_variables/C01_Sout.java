package day02_variables;

public class C01_Sout {

/*
    ctrl+alt+l==>sayfayi duzenler
    \n alt satira gecirir
    \t tab bosluk birakir
    \b gerisindeki harfi siler
     \\: :\ (ters slash) yazdirir   prints a back slash
      \': ' tek tirnak yazdirir.  prints single quote
      \" :"" cift tirnak yazdirir. : prints double quote
     *


   Soru-1 :Konsolda asagidaki ciktiyi yazdiriniz

  T
  E
  C
  H
  P
  R
  O

  E
  D
  U
  C
  A
  T
  I
  O
  N
   */
        //1nci yol:


    public static void main(String[] args) {
        System.out.println("T");
        System.out.println("E");
        System.out.println("C");
        System.out.println("P");
        System.out.println("O");
        System.out.println("");//hiclik ile yada space ile de yapilir.
        System.out.println("E");
        System.out.println("D");
        System.out.println("C");
        System.out.println("A");
        System.out.println("T");
        System.out.println("I");
        System.out.println("O");
        System.out.println("N");


       // Soru-1 : TECHPRO EDUCATION  ==>tek sout ile her hara alt alta gelecek sekilde ilk kelimeden sonra bosluk
        // olacak sekilde yazdiran bir kod yaziniz

        //2nci yol:

        System.out.println("\nT\nE\nC\nP\nR\nO\n\nE\nD\nU\nC\nA\nT\nI\nO\nN");// '\n' iki defa koyarsak bosluk birakir.

    // Soru-2 :  JAVA ILE GUZEL DUNYA  ==>cumlesinin her kelimesini alt alta gelecek sekilde yazdiran bir kod yazin

        System.out.println("\nJAVA\nILE\nGUZEL\nDUNYA");

     //Soru-3 :  JAVA ILE GUZEL DUNYA  ==>seklinde bir tab bosluk olacak sekilde yazdiran bir kod yazin

        System.out.println("java\tile\tguzel\tdunya");


      //Soru-4 :  java ile guzel dunya  ==>cumlesinin aralarinda bosluk olmayacak sekilde yazdiran bir kod yazin

        System.out.println("java \bile \bguzel \bdunya");

      //Soru-5 : Pazartesi kelimesinin her harfini ayri bir satira gelecek sekilde  yazdiran bir kod yazin

        System.out.println("P\na\nz\na\nr\nt\ne\ns\ni");



     //Soru-6 : "Techpro" ile java cok 'kolay'   yazdiran bir kod yaziniz


        System.out.println("\"Techpro\" ile java cok \'kolay\'");


//Soru-7 : "MAHARET" hic 'DUSMEMEK'  degil; "Her dustugunde kalkabilmektir" ==>ifadesini

// "MAHARET" hic 'DUSMEMEK' degil;


//      "Her dustugunde kalkabilmektir" seklinde noktali virgulden sonra 3 satir asagidan ve satir basi yaparak yazdiran bir kod yaziniz.

        System.out.println("\"MAHARET\" hic \'DUSMEMEK\' degil;\n\n\n\t\"Her dustugunde kalkabilmektir\"");




    }

}
