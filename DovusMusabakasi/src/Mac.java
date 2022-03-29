public class Mac {
    Fighter f1;
    Fighter f2;
    int minAgirlik;
    int maxAgirlik;

    Mac(Fighter f1,Fighter f2,int minAgirlik,int maxAgirlik){
        this.f1=f1;
        this.f2=f2;
        this.minAgirlik=minAgirlik;
        this.maxAgirlik=maxAgirlik;
    }
    void kontrol(){
         if(esleme()==true){
             while (this.f1.can>0 && this.f2.can>0){
                 System.out.println("----YENİ ROUND----");
                  this.f2.can=this.f1.vurus(this.f2);
                  if(kazanan()){
                      break;
                  }
                  this.f1.can=this.f2.vurus(this.f1);
                 if(kazanan()){
                     break;
                 }
                 System.out.println(this.f1.name + "Sağlık: " + this.f1.can);
                 System.out.println(this.f2.name + "Sağlık: " + this.f2.can);


             }

         }else{
             System.out.println("Dövüşçülerin sikletleri uyuşmuyor.");
         }

    }

    boolean esleme(){
        return ((this.f1.agirlik>=minAgirlik && this.f1.agirlik<=maxAgirlik) && (this.f2.agirlik>=minAgirlik && this.f2.agirlik<=maxAgirlik));
    }
    boolean kazanan(){
        if(this.f1.can==0){
            System.out.println(this.f2.name+ " kazandı");
            return true;
        }
        if(this.f2.can==0){
            System.out.println(this.f1.name+ " kazandı");
            return true;
        }
        return false;
    }
}
