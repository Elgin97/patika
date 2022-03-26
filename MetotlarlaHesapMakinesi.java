import java.util.Scanner;
public class MetotlarlaHesapMakinesi {
    static int toplama(int a,int b){
        int result=a+b;
        System.out.println("Toplama işleminin sonucu: "+result);
        return result;
    }
    static int cikarma(int a,int b){
        int result=a-b;
        System.out.println("Çıkarma işleminin sonucu: "+result);
        return result;
    }
    static int carpma(int a,int b){
        int result=a*b;
        System.out.println("Çarpma işleminin sonucu: "+result);
        return result;
    }
    static int bolme(int a,int b){
        int result=a/b;
        System.out.println("Bölme işleminin sonucu: "+result);
        return result;
    }
    static int us(int a,int b){
        int result=1;
        for(int i=1;i<=b;i++){
            result*=a;
        }
        System.out.println("Üs alma işleminin sonucu: "+result);
        return result;
    }
    static int mod(int a,int b){
        int result=a%b;
        System.out.println("Mod alma işleminin sonucu: "+result);
        return result;
    }
    static void dikdortgen(int a,int b){

        System.out.println("Dikdörtgenin çevresi: "+2*(a+b));
        System.out.println("Dikdörtgenin alanı: "+a*b);

    }

    public static void main(String[] args) {
        int select,a,b;
        Scanner inp=new Scanner(System.in);

        String menu= "1-Toplama İşlemi\n"+
                     "2-Çıkarma İşlemi\n"+
                     "3-Çarpma İşlemi\n"+
                     "4-Bölme İşlemi\n"+
                     "5-Üslü Sayı Hesaplama İşlemi\n"+
                     "6-Mod Alma İşlemi\n"+
                     "7-Dikdörtgende Alan ve Çevre Hesaplama İşlemi\n"+
                     "0-Çıkış Yap";
        while(true){
            System.out.println(menu);

            System.out.print("İşleminizi seçiniz: ");
            select=inp.nextInt();
            if(select==0){
                break;
            }
            System.out.print("Birinci sayıyı giriniz: ");
            a=inp.nextInt();
            System.out.print("İkinci sayıyı giriniz: ");
            b=inp.nextInt();
            switch(select){
                case 1:
                        toplama(a,b);

                    break;
                case 2:
                        cikarma(a,b);

                    break;
                case 3:
                        carpma(a,b);

                    break;
                case 4:
                        if(bolme(a,b)==0){
                            System.out.println("İkinci sayı sıfırdan farklı olmalı");
                        }

                    break;
                case 5:
                        us(a,b);

                    break;
                case 6:
                        mod(a,b);

                    break;
                case 7:
                        dikdortgen(a,b);

                    break;
            }


        }
        System.out.println("Çıkış yaptınız...");

    }
}
