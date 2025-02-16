class A{
          static void disp(){
                    System.out.println("It's for print time ");
          }
          static int getval(int x){
                    return x;
          }
} 

public class Staticmethod {
          public static void main(String args[]){
                A.disp();
                System.out.println(A.getval(4));
          }
          
}
