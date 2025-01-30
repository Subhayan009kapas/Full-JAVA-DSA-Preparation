import java.util.Scanner;

interface client{
 public void input();
 public void output();
}

class Raju implements client{
    String name;
    double sal;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Emter the input");
        name=sc.nextLine();
        System.out.println("salary");
        sal=sc.nextDouble();
    }
    public void output(){
        System.out.println(this.name);
        System.out.println(this.sal);
    }
}
public class Interface1 {
          public static void main(String[] args) {
             client s1=new Raju();
             s1.input();
             s1.output();
          }
          
}
