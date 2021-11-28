package javaapplication7;
public class JavaApplication7{


    public static void main(String[] args){
       Gatunek g1 = new Gatunek();
       g1.nazwa("Wieloryb");
       g1.nielot=true;
       g1.plywak=true;
       System.out.println(g1.nazwa);
       g1.jedz(100);
       g1.wydalaj();
       g1.zanurz();
       g1.plyn();
       g1.wynurz();

       g1.lec();
       g1.wyladuj();
    }
}
