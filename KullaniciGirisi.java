import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName,password;
        int secim;
        Scanner inp=new Scanner(System.in);
        System.out.print("Kullanıcı adınız: ");
        userName=inp.nextLine();
        System.out.print("Şifreniz: ");
        password=inp.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş yaptınız.");
        }else{
            System.out.println("Hatalı giriş yaptınız.Şifrenizi sıfırlamak ister misiniz?");
            System.out.print("1-Evet\n2-Hayır\nSeçiminizi yapınız: ");
            secim=inp.nextInt();
            switch(secim){
                case 1:
                    Scanner input=new Scanner(System.in);
                    System.out.print("Yeni şifre oluşturunuz: ");
                    String  newPassword=input.nextLine();
                        if(newPassword.equals("java123")){
                           System.out.println("Yeni şifre eskisiyle aynı olamaz");
                        }else{
                            System.out.println("şifreniz değiştirildi");
                             }
                     break;
                case 2:
                    System.out.println("Tekrar deneyiniz");
                     break;
                default:
                    System.out.println("Geçersiz işlem");

            }
            }

        }
    }



