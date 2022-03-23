import java.util.Scanner;
public class GirilenSayiyaKadarTamBolen {
    public static void main(String[] args) {
        int sayi,toplam=0,sayac=0;
        Scanner inp=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        sayi=inp.nextInt();
        for(int i=0;i<=sayi;i++){
            if(i %3 == 0 && i % 4 ==0){
                toplam+=i;
                sayac++;
            }
        }
        System.out.println(toplam/sayac);
    }
}
