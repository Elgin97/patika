import java.util.Scanner;
public class UsAlma {

    static int power(int base,int exp){
        int result=1;
        for(int i=1; i<=exp; i++){
          result*=base;
        }
        return result;
    }
    public static void main(String[] args) {
        int n1,n2;
        Scanner inp=new Scanner(System.in);
        System.out.print("Tabanı giriniz: ");
        n1=inp.nextInt();
        System.out.print("Üssü giriniz: ");
        n2=inp.nextInt();
        System.out.print("Sonuç: " + power(n1,n2));
    }
}
