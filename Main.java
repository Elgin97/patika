public class Main {

    public static void main(String[] args) {
      Teacher t1=new Teacher("Mahmut","123456789","TRH");
      Teacher t2=new Teacher("Graham Bell","2347890","FZK");
      Teacher t3=new Teacher("Külyutmaz","23479990","BİO");

      Course tarih=new Course("Tarih","101", "TRH");
      tarih.addTeacher(t1);
      Course fizik=new Course("Fizik","102", "FZK");
      fizik.addTeacher(t2);
      Course biyo=new Course("Biyoloji","101", "BİO");
      biyo.addTeacher(t3);

      Student s1=new Student("İnek Şaban","123","4",tarih,fizik,biyo);
              s1.addBulkExamNote(100,200,50);
              s1.isPass();
        Student s2=new Student("Güdek Necmi","773","4",tarih,fizik,biyo);
        s2.addBulkExamNote(50,30,70);
        s1.isPass();




    }
}
