package javaapplication7;

public class Gatunek extends Ryba{
    String nazwa;
    float zoladek;
    boolean nielot;
    boolean plywak;
    public Gatunek() {
    }

    public void jedz(int jedz) {
        System.out.println("Zwierze je "+jedz+" kg pozywienia" );
        zoladek+=jedz;
    }
    public void wydalaj(){
        float wydalono= (float)(zoladek*0.75);
        System.out.println("Zwierze wydala "+wydalono+" kg, w zoladku pozostalo "+(zoladek-wydalono)+" kg");
    }
    public void nazwa(String nazwa){
        this.nazwa=nazwa;
    }
    public void lec(){
        if(nielot==true){
            System.out.println("Ten gatunek nie lata!");
        }
        else{
            super.lec();
        }
    }
    public void wyladuj(){
        if(nielot==true){
            System.out.println("Ten gatunek nie lata!");
        }
        else{
            super.wyladuj();
        }
    }
    public void plyn(){
        if(plywak==true){
            super.plyn();
        }
        else{
         System.out.println("Ten gatunek nie plywa!");
        }
    }
    public void wynurz(){
        if(plywak==true){
            super.wynurz();
        }
        else{
            System.out.println("Ten gatunek nie plywa!");
        }
    }
    public void zanurz(){
        if(plywak==true){
            super.zanurz();
        }
        else{
            System.out.println("Ten gatunek nie plywa!");
        }
    }
}
