import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        int sayi;
        Scanner inp=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        sayi=inp.nextInt();
        for(int i=sayi;i>=1;i--){
            for(int j=1;j<=sayi-i;j++){
                System.out.print(" ");
            }
            for(int k=(i*2)-1;k>=1;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
