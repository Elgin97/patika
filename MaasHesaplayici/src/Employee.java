public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    double tax;
    double bonus;


    Employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
        this.tax=0;
        this.bonus=0;

    }
    double tax(){
        if(this.salary<1000){
            return this.tax;
        }else{
            return this.salary*0.03;
        }
    }
     double bonus(){

        if(workHours>40){
           this.bonus=(this.workHours-40)*30;
        }else{
            this.bonus=0;
        }
        return this.bonus;

    }
    double raiseSalary(){
        double tempSalary=this.salary;
        double result;
        int totalYear=2021-this.hireYear;
        if(totalYear<10){
           tempSalary*=0.05;
        }
        if(totalYear>9 && totalYear<20){
            tempSalary*=0.10;
        }
        if(totalYear>19){
            tempSalary*=0.15;
        }
        return tempSalary;
    }
    void toStringg(){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
        System.out.println("Adı: " +this.name);
        System.out.println("Maaşı: " +this.salary);
        System.out.println("Çalışma saati: " + this.workHours);
        System.out.println("Başlangıç yılı: " +this.hireYear);
        System.out.println("Vergi: " +this.tax());
        System.out.println("Bonus: " +this.bonus());
        System.out.println("Maaş artışı: " +this.raiseSalary());
        System.out.println("Vergi ve bonuslar ile maaş: " + (this.bonus()-this.tax()));
        System.out.println("Toplam maaş: " +(this.bonus()+this.raiseSalary()-this.tax()));

    }


}
