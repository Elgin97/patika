import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {
        int n,r,toplam1=1,toplam2=1,toplam3=1,sonuc;

        Scanner inp=new Scanner(System.in);
        System.out.print("C(n,r) = n! / (r! * (n-r)!)\nn değerini giriniz: ");
        n=inp.nextInt();
        System.out.print("r değerini giriniz: ");
        r=inp.nextInt();
        int m=(n-r);
        for(int i=1;i<=n;i++){
            toplam1=toplam1*i;
        }
        for(int i=1;i<=r;i++){
            toplam2=toplam2*i;
        }
        for(int i=1;i<=m;i++){
            toplam3=toplam3*i;
        }
        sonuc=toplam1/(toplam2*toplam3);
        System.out.print("Sonuç="+sonuc);
    }
}
