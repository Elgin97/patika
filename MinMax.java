import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        int kac,max=0,min=0;
        Scanner inp=new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz: ");
        kac=inp.nextInt();
        for(int i=1;i<=kac;i++){
            System.out.print(i+".sayı= ");
            int x=inp.nextInt();

            if(x>max){
                if(min==0){
                    min=x;
                }
                max=x;
            }
            if(x<min){
                if(max==0){
                    max = x;
                }
                min=x;
            }
        }
        System.out.println("En Büyük Sayı : " + max);
        System.out.println("En Küçük Sayı : " + min);
    }
}
