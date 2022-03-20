import java.util.Scanner;

public class Hip {
    public static void main(String[] args) {
        int a,b;
        double c;
        Scanner kenar=new Scanner(System.in);
        System.out.print("Birinci kenar uzunluğunu giriniz: ");
        a=kenar.nextInt();
        System.out.print("İkinci kenar uzunluğunu giriniz: ");
        b=kenar.nextInt();
        c=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs= "+c);
    }
}
