import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        int sayi,toplam=0;
        Scanner inp=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        sayi=inp.nextInt();
        for(int i=1;i<sayi;i++){
            if(sayi%i==0){
                toplam+=i;
            }
        }
        if(toplam==sayi){
            System.out.println(sayi +" bir mükemmel sayıdır");
        }else{
            System.out.println(sayi+" bir mükemmel sayı değildir");
        }
    }
}
