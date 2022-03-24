import java.util.Scanner;
public class DortveBesinKuvvetleri {
    public static void main(String[] args) {
        int sayi;
        Scanner inp=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        sayi=inp.nextInt();
        for(int i=1;i<=sayi;i*=4){
            System.out.println("Girdiğiniz sayıya kadar 4'ün kuvvetleri: "+i);
            }
        for(int i=1;i<=sayi;i*=5){
            System.out.println("Girdiğiniz sayıya kadar 5'in kuvvetleri: "+i);
        }

    }
}
