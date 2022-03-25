import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int sayi,birinci=0,ikinci=1;
        Scanner inp=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        sayi=inp.nextInt();
        for(int i=0;i<=sayi;i++){
            int ucuncu=birinci+ikinci;
            System.out.println(ucuncu);
            birinci=ikinci;
            ikinci=ucuncu;
        }
    }
}
