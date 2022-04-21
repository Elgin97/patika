import java.util.Arrays;
import java.util.Scanner;

public class EnYakinDegerler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8};
        Arrays.sort(list);
        int enyakinKucuk=0;
        int enyakinBuyuk=0;
        System.out.print("Sayı giriniz: ");
        int x=input.nextInt();
        for(int i : list){
            if(x>i){
                enyakinKucuk=i;
            }
            if(x<i){
                enyakinBuyuk=i;
                break;
            }
        }
        System.out.println("Girilen sayıya yakın küçük sayı: "+enyakinKucuk);
        System.out.print("Girilen sayıya yakın büyük sayı: "+enyakinBuyuk);
    }
}
