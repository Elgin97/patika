import java.util.Scanner;
public class Atm {
    public static void main(String[] args) {
        String userName, password;
        int bakiye = 1500, hak = 3, secim;
        Scanner inp = new Scanner(System.in);

        while (hak > 0) {
            System.out.print("Kullanıcı adınız:");
            userName = inp.nextLine();
            System.out.print("Şifreniz: ");
            password = inp.nextLine();
            if (userName.equals("Elgin") && password.equals("Elgin123")) {
                System.out.println("Sisteme giriş yaptınız.");
                do {
                    System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgulama\n4-Çıkış Yap");
                    System.out.println("Yapmak istediğiniz işlemi seçiniz.");
                    secim = inp.nextInt();
                    switch (secim) {
                        case 1:
                            System.out.print("Yatırılacak tutar: ");
                            int tutar = inp.nextInt();
                            bakiye += tutar;
                            System.out.println("Bakiye: " + bakiye);
                            break;

                        case 2:
                            System.out.println("Çekilecek tutar: ");
                            int Cekilecektutar = inp.nextInt();
                            if (Cekilecektutar > bakiye) {
                                System.out.println("Yetersiz bakiye");
                            } else {
                                bakiye -= Cekilecektutar;
                                System.out.println("Kalan bakiyeniz: " + bakiye);
                            }
                            break;
                        case 3:
                            System.out.println("Mevcut bakiyeniz: " + bakiye);
                            break;
                    }


            } while (secim != 4) ;
                System.out.println("Tekrar görüşmek üzere.");
                break;


                } else{
                hak--;
                System.out.println("Hatalı giriş yaptınız.Tekrar deneyiniz.");
                if (hak == 0) {
                    System.out.println("Hesabınız bloke olmuştur.");
                } else {
                    System.out.println("Kalan hakkınız:" + hak);
                }
            }

            }

    }
}

