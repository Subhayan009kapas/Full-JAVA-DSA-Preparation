class Student{
          String name ;
          static  String school;

          public static void  man(){
                    System.out.println("hello ");
          }

          public void print(){
                    System.out.println( name+" -> "+school);
          }
}

public class Statickey {
          public static void main(String[] args) {
              Student.school="Kismot Dirghagram High School";
              Student.man();
              Student s1=new Student();
              s1.name="subhayan";
              s1.print();
              Student s2=new Student();
              s2.name="Shivama";
              s2.print();
              Student s3=new Student();
              s3.name="suraktim";
              s3.print();


          }
         
          
}
