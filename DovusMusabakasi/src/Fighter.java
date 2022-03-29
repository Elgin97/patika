public class Fighter {
    String name;
    int hasar;
    int can;
    int agirlik;


    Fighter(String name,int hasar,int can,int agirlik){
        this.name=name;
        this.hasar=hasar;
        this.can=can;
        this.agirlik=agirlik;

    }
    int vurus(Fighter rakip){
        System.out.println(this.name+ " isimli dövüşçü " +rakip.name+  " isimli dövüşçüye "  + this.hasar + " kadar hasar vurdu.");
        if(rakip.can - this.hasar<0){
            return 0;
        }
        return rakip.can - this.hasar;
    }

}
