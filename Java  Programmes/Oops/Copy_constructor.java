 class Student{
          String name;
          int age;
          Student(){   // for object s1

          }
          Student(Student s2 ){    // for object s2
                    this.name=s2.name;
                    this.age=s2.age;
          }
          public void print(){
                    System.out.println(this.name);
                    System.out.println(this.age);
          }

 }


public class Copy_constructor {
          public static void main(String[] args) {

                    Student s1=new Student();
                    s1.name="ram";
                    s1.age=21;

                    Student s2=new Student(s1);
                    s2.print();
                    

              
          }
}

