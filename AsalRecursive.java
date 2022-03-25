import java.util.Scanner;
public class AsalRecursive {
    public static void main(String[] args) {
        int n;
        Scanner inp=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        n=inp.nextInt();
        if(asalmi(n)==1){
            System.out.print(n+" asal değil");
        }else{
            System.out.print(n +" asal");
        }
    }
    static int asalmi(int n){
        int result = 0;
        for(int i=2;i<n;i++){
             if(n%i==0){
                 result=1;
             }

        }
        return result;
    }
}
