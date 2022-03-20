import java.util.Scanner;

public class Vucutindeks {
    public static void main(String[] args) {
        double boy,kg,vki;
        Scanner inp=new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy=inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kg=inp.nextDouble();
        vki=kg/(boy*boy);
        System.out.print("Vücut Kitle İndeksiniz : "+vki);

    }
}
