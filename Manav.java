import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        int armutkg,elmakg,domateskg,muzkg,patlicankg;
        double armut=2.14, elma=3.67,domates=1.11,muz=0.95,patlican=5.0;
        double armutt,elmat,domatest,muzt,patlicant,toplam;
        Scanner inp=new Scanner(System.in);
        System.out.print("Armut kaç kilo: ");
        armutkg=inp.nextInt();
        armutt=armutkg*armut;
        System.out.print("Elma kaç kilo: ");
        elmakg=inp.nextInt();
        elmat=elmakg*elma;
        System.out.print("Domates kaç kilo: ");
        domateskg=inp.nextInt();
        domatest=domateskg*domates;
        System.out.print("Muz kaç kilo: ");
        muzkg=inp.nextInt();
        muzt=muzkg*muz;
        System.out.print("Patlıcan kaç kilo: ");
        patlicankg=inp.nextInt();
        patlicant=patlicankg*patlican;
        toplam=armutt+elmat+domatest+muzt+patlicant;
        System.out.print("Toplam tutar: "+toplam);
    }
}
