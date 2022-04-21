import java.util.Arrays;
import java.util.Scanner;
public class DizidekiElemanlarinFrekansi {
    public static void main(String[] args) {
        int[] list={11,1,1,2,2,2,2,3,7,9};
        int sayac=0;
        Arrays.sort(list);
        for(int i=0; i<list.length;i++){
            for(int j=0; j< list.length;j++){
                if(list[i]==list[j]){
                    sayac++;
                }
            }
            System.out.println(list[i]+" elemanı "+sayac+" kez tekrar etti");
            i=i+(sayac-1);
        }

    }
}
