import java.util.Scanner;
public class DeseneGoreMetot {

    public static void main(String[] args) {
        int n;
        Scanner inp=new Scanner(System.in);
        System.out.print("N sayısı:");
        n=inp.nextInt();
        cikar(n,n);
    }

    static void ekle(int n,int temp){
        System.out.println(temp);
        if(n==temp){
            return ;
        }else{
            ekle(n,temp+5);
        }
    }
    static void cikar(int n,int temp){
        System.out.println(temp);
        if(temp<=0){
            ekle(n,temp+5); ;
        }else{
            cikar(n,temp-5);
        }

    }
}
