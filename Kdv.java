import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
        double a,b,c,d=0.18;
        Scanner inp=new Scanner(System.in);
        System.out.print("Kdvsiz fiyatı giriniz:  ");
        a=inp.nextDouble();
        System.out.println("Kdv oranı= "+d);
        b=a+(a*d);
        System.out.println("Kdvli fiyat= "+b);
        c=b-a;
        System.out.print("Kdv tutarı= "+c);

    }




}
