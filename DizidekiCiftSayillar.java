import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class DizidekiCiftSayillar{

    static boolean isFind(int[] arr,int value){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                return false;
            }

        }return true;
    }

    public static void main(String[] args) {
        int[] list = {1,2,2,2,3,4,5,5,5,6,6,7,8,8,8,10,10};
        int[] tekrar =new int[list.length];
        int indeks=0;
        for (int i = 0; i < list.length; i++) {
            for(int j=0;j< list.length;j++){
                if((i!=j) && list[i]==list[j] && list[i]%2==0){
                    if (isFind(tekrar,list[i])){
                        tekrar[indeks]= list[i];
                        indeks++;
                    }

                }
            }
        }
        System.out.println(Arrays.toString(tekrar));
    }
}