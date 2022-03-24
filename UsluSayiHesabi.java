import java.util.Scanner;
public class UsluSayiHesabi {
    public static void main(String[] args) {
        int n,k,carpim=1;
        Scanner inp=new Scanner(System.in);
        System.out.print("Taban: ");
        n=inp.nextInt();
        System.out.print("Üs: ");
        k=inp.nextInt();
        for(int i=1;i<=k;i++){
            carpim*=n;
        }
        System.out.println("Sonuç: "+carpim);
    }

}
