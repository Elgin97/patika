import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        double ort,toplam=0,sayac=0;
        Scanner inp=new Scanner(System.in);
        System.out.print("Matematik notu: ");
        mat=inp.nextInt();
        if(mat>=0 && mat<=100){
            toplam+=mat;
            sayac++;
        }
        System.out.print("Fizik notu: ");
        fizik=inp.nextInt();
        if(fizik>=0 && fizik<=100){
            toplam+=fizik;
            sayac++;
        }
        System.out.print("Türkçe notu: ");
        turkce=inp.nextInt();
        if(turkce>=0 && turkce<=100){
            toplam+=turkce;
            sayac++;
        }
        System.out.print("Kimya notu: ");
        kimya=inp.nextInt();
        if(kimya>=0 && kimya<=100){
            toplam+=kimya;
            sayac++;
        }
        System.out.print("Müzik notu: ");
        muzik=inp.nextInt();
        if(muzik>=0 && muzik<=100){
            toplam+=muzik;
            sayac++;
        }
        ort=toplam/sayac;
        System.out.println("Ortalama: "+ort);

    }
}
