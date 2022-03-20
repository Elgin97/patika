import java.util.Scanner;

public class Taksi {

    public static void main(String[] args) {
        int km;
        double kmBasi=2.20,toplam,baslangic=10;
        Scanner yol=new Scanner(System.in);
        System.out.print("Mesafeyi giriniz: ");
        km= yol.nextInt();
        toplam=kmBasi*km;
        toplam+=baslangic;
        toplam=(toplam<20) ? 20 : toplam;
        System.out.print("Ödenecek ücret: "+toplam);


    }
}