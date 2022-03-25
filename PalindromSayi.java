import java.util.Scanner;

public class PalindromSayi {
    static boolean isPalindrom(int num){
        int temp=num,terssayi=0,sonsayi;
        while(temp!=0){
            sonsayi=temp%10;
            terssayi=(terssayi*10)+sonsayi;
            temp/=10;
        }
        if(terssayi==num){
            return true;
        }else{
            return false;
        }


    }
    public static void main(String[] args) {
        int n;
        Scanner inp=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        n=inp.nextInt();
        System.out.println(isPalindrom(n));

    }
}
