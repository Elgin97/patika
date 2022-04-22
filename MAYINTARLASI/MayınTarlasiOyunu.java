import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class MayınTarlasiOyunu {
   public void diziYazdir(String[][] arr){
       for(String[] row : arr ){
           for(String col : row){
               System.out.print(col+" ");
           }
           System.out.println();
       }
   }
   int rowNumber;
   int colNumber;
   int counter;
   int bombCounter=0;
   int win=0;
   boolean deger;
   String map[][];
   String board[][];

   MayınTarlasiOyunu(int rowNumber,int colNumber){
       this.rowNumber=rowNumber;
       this.colNumber=colNumber;
       this.bombCounter=(rowNumber*colNumber)/4;
       this.deger=true;
       this.map=new String[rowNumber][colNumber];
       for(int i=0;i<rowNumber;i++){
           for(int j=0;j<colNumber;j++){
               this.map[i][j]=" - ";
           }
       }
       this.board=new String[rowNumber][colNumber];
       for(int i=0; i<this.rowNumber;i++){
           for(int j=0;j<this.colNumber;j++){
               this.board[i][j]= " - ";
           }
       }
   }
   void run(){
       Scanner input=new Scanner(System.in);
       Random rand=new Random();
       System.out.println("Mayınların Konumu");
       int k=0;
       while(k<bombCounter){
           for(int i=0;i<rowNumber;i++){
               for(int j=0; j<colNumber; j++){
                   int random= rand.nextInt(10);

                   if(random<5 && k<bombCounter){
                       this.map[i][j]=" * ";
                       k++;
                   }else{
                       this.map[i][j]=" - ";

                   }
                   System.out.print(this.map[i][j]);
               }
               System.out.println();
           }
       }
       System.out.println("=================");
       System.out.println("Mayın Tarlası Oyunu");
       int row=this.rowNumber;
       int col=this.colNumber;
       while (deger){
           diziYazdir(this.board);
           if(win==(this.rowNumber*this.colNumber)-(this.rowNumber*this.colNumber)/4){
               System.out.println("Tebrikler kazandınız");
               diziYazdir(this.map);
               break;
           }
           System.out.print("Satır giriniz: ");
           row=input.nextInt();
           System.out.print("Sütun giriniz: ");
           col=input.nextInt();

           if(row>=this.rowNumber || col>=this.colNumber){
               System.out.println("Yanlış değer girdiniz.");
           }else if(row<0 || col<0){
               System.out.println("Yanlış değer girdiniz.");
           }else{
               if(map[row][col].equals(" * ")){
                   System.out.println("Game Over!");
                   deger=false;
               }else{
                   for (int i = row - 1; i <= row + 1; i++) {
                       for (int j = col - 1; j <= col + 1; j++) {
                           try{
                               if(i==row && j==col){
                                   continue;
                               }else if(map[i][j].equals(" * ")){
                                   counter++;
                               }

                           }catch(Exception ignored){

                           }
                       }
                   }
                   win++;
                   this.board[row][col]=Integer.toString(counter);
                   counter=0;
               }
           }
       }
   }
}
