import java.util.Scanner;

public class Etkinlik {
    public static void main(String[] args) {
        int sicaklik;
        Scanner inp=new Scanner(System.in);
        System.out.print("Sıcaklık değerini giriniz: ");
        sicaklik=inp.nextInt();
        if(sicaklik < 5){
            System.out.println("Kayak yapabilirsiniz");
        }else if(sicaklik >=5 && sicaklik <=25){
            if(sicaklik <= 15){
                System.out.println("Sinemaya gidebilirsiniz");
            }
            if(sicaklik >= 10){
                System.out.println("Pikniğe gidebilirsiniz");
            }
        }else if(sicaklik > 25){
            System.out.println("Yüzebilirsiniz");
        }

    }
}
