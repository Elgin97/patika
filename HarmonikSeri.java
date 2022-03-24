import java.util.Scanner;
public class HarmonikSeri {
    public static void main(String[] args) {
        int sayi;
        double toplam=0.0;
        Scanner inp=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        sayi=inp.nextInt();
        for(int i=1;i<=sayi;i++){
            toplam+=(1.0/i);
        }
        System.out.println("Sonuç: "+toplam);
    }
}
