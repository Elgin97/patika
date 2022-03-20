import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        int r,alfa;
        double pi=3.14;
        double alan;
        Scanner cap=new Scanner(System.in);
        System.out.print("Yarıçapı giriniz: ");
        r=cap.nextInt();
        System.out.print("Merkez açının ölçüsünü giriniz: ");
        alfa= cap.nextInt();
        alan=(pi * (r*r) * alfa) / 360;
        System.out.println("Alan= "+alan);

    }
}
