import java.util.Scanner;

public class CiftveDordunKati {
    public static void main(String[] args) {
        int sayi,toplam=0;
        Scanner inp=new Scanner(System.in);

        do{
            System.out.print("Sayı giriniz: ");
            sayi=inp.nextInt();
            if(sayi % 4 == 0 ){
                toplam+=sayi;
            }
        }while(sayi % 2 == 0);
        System.out.println("Girilen tek sayıların toplamı: "+toplam);

    }
}