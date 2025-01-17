class Studentinfo{
          String name ;
          int age;

          

    public Studentinfo(String name , int age) {
         this.name=name;
         this.age=age;
    }
    public void printStudent(){
      System.out.println(this.name);
      System.out.println(this.age); 
}
          

}
public class constructor {
          public static void main(String args[]){
                    Studentinfo stu1=new Studentinfo("Subhayan" , 21);
                    

                    stu1.printStudent();
          }
          
}
