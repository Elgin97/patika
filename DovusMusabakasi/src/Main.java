public class Main {
    public static void main(String[] args) {
        Fighter f1=new Fighter("Ali",10,120,100);
        Fighter f2=new Fighter("Mehmet",20,85,85);

        Mac mac=new Mac(f1,f2,85,100);
        mac.kontrol();
    }
}
