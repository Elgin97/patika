import java.util.Arrays;
public class Transpoz {
    public static void main(String[] args) {
        int[][] matris = {{2,3,4},{5,6,4}};
        int[][] transpose = new int[3][2];
        for(int i=0;i< matris.length;i++){
            for(int j=0; j<matris[i].length;j++){
                transpose[j][i]=matris[i][j];
            }
        }
        for(int i=0;i< matris.length;i++){
            for (int j=0; j< matris[i].length;j++){
                if(j==matris[0].length-1){
                    System.out.println(matris[i][j]);
                }else{
                    System.out.print(matris[i][j]+"\t");
                }
            }
        }
        System.out.println();
        for(int i=0;i< transpose.length;i++){
            for (int j=0; j< transpose[i].length;j++){
                if(j==transpose[0].length-1){
                    System.out.println(transpose[i][j]);
                }else{
                    System.out.print(transpose[i][j]+"\t");
                }
            }
        }


    }
}
