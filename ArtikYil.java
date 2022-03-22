import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        int yil;
        Scanner inp = new Scanner(System.in);
        System.out.println("Yıl giriniz: ");
        yil = inp.nextInt();
            if (yil % 4 == 0 && yil > 0) {
                if (yil % 100 != 0) {
                    System.out.println("Artık yıl");
                } else if (yil % 100 == 0 && yil % 400 == 0) {
                    System.out.println("Artık yıl");
                } else {
                    System.out.println("Artık yıl değil");
                }

            } else {
                System.out.println("Sıfırdan büyük bir değer giriniz");
            }



    }
}