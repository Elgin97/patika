import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int n1, n2, ebob = 1, ekok = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        n1 = inp.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = inp.nextInt();
        if (n1 > n2) {
            int i = 0;
            while (i <= n2) {
                i++;
                if (n2 % i == 0 && n1 % i == 0) {
                    ebob = i;
                    ekok=(n1*n2/ebob);
                }


            }
            System.out.println(ebob);
            System.out.println(ekok);

        } else {
            int i = 0;
            while (i <= n1) {
                i++;
                if (n2 % i == 0 && n1 % i == 0) {
                    ebob = i;
                    ekok=(n1*n2/ebob);
                }

            }
            System.out.println(ebob);
            System.out.println(ekok);
        }

    }
}
