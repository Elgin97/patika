import java.util.Scanner;

public class TekSayilarinToplami {
    public static void main(String[] args) {
        int sayi,toplam=0;
        Scanner inp=new Scanner(System.in);

        do{
            System.out.print("Sayı giriniz: ");
            sayi=inp.nextInt();
               if(sayi %2 == 1 ){
                   toplam+=sayi;
               }
        }while(sayi>0);
        System.out.println("Girilen tek sayıların toplamı: "+toplam);

            }
        }







