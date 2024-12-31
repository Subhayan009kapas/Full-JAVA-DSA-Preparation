
import java.util.Scanner;

public class Update_bit {
          public static void clear(int input , int num , int pos){
                    int bitmask=1<<pos;
                    int newNumber=(~(bitmask) & (num));
                    System.out.println("After performing the clear "+newNumber);


          }
          public static  void set(int input , int num , int pos){
                    int bitmask=1<<pos;
                    int newNumber=bitmask | num;
                    System.out.println("After performing the set "+newNumber);

          }
         public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
             System.out.println("Which bit you want to update 0 or 1");
             int input=sc.nextInt();
             System.out.println("Enter the position :");
             int pos=sc.nextInt();
             int num=5;
             if(input==0){

                    clear(input, num, pos);


             }else{

                    set(input, num, pos);

             }
         } 
}
