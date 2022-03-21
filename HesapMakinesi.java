import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
      int secim,n1,n2;
        Scanner inp=new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: " );
        n1=inp.nextInt();
        System.out.print("İkinci sayıyı giriniz: " );
        n2=inp.nextInt();
        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nSeçiminiz:");
        secim=inp.nextInt();
        switch(secim){
            case 1:
                System.out.println("Toplam: "+(n1+n2));
                break;
            case 2:
                System.out.println("Fark: "+(n1-n2));
                break;
            case 3:
                System.out.println("Çarpım: "+ (n1*n2));;
                break;
            case 4:
                if(n2==0){
                    System.out.println("Bir sayı 0'a bölünemez");
                }else{
                    System.out.println("Bölüm: "+(n1/n2));
                }

                break;
            default:
                System.out.println("yanlış değer");



        }
    }

}
