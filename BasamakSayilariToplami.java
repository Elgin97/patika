import java.util.Scanner;
public class BasamakSayilariToplami {
    public static void main(String[] args) {
        int sayi,toplam=0;
        Scanner inp=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        sayi=inp.nextInt();

     while(sayi>0){
         toplam+=sayi%10;
         sayi/=10;
     }
        System.out.print("Girilen sayının basamakları toplamı: "+toplam);
    }
}
