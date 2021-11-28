package javaapplication7;
abstract class Ryba extends Zwierze{
    public abstract void jedz(int jedz);
    public abstract void wydalaj();
    public void lec(){
        System.out.println("Zwierze leci");
    }
    public void wyladuj(){
        System.out.println("Zwierze laduje");
    }
    public void plyn(){
        System.out.println("Zwierze plynie");
    }
    public void wynurz(){
        System.out.println("Zwierze wynurza sie");
    }
    public void zanurz(){
        System.out.println("Zwierze zanurza sie");
    }
}
