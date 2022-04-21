import java.util.Arrays;
import java.util.Scanner;
public class PalindromikKelime {
    static boolean isPalindrom(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }return true;

    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");
        String str=inp.nextLine();
        if(isPalindrom(str)==true){
            System.out.println(str+" bir palindromik kelimedir.");
        }else{
            System.out.println(str+" bir palindromik kelime değil.");
        }
    }
}
