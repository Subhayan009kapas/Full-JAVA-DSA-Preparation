import java.util.*;
public class number_checker {

          public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              int pos_num=0;
              int neg_num=0;
              int zero_num=0;
          
              

              while(true){
                    System.out.println("enter the number :");
                    int num=sc.nextInt();

                    if(num>0){
                              pos_num++;
                    }
                    else if(num<0){
                              neg_num++;
                    }else{
                              zero_num++;
                    }

                    System.out.println("Are you continue this game y or n");
                    char choice=sc.next().charAt(0);

                    if(choice=='n'){
                              break;
                    }


              }

              System.out.println("_______The result __________");

              System.out.println("Total positive number :"+ pos_num);
              System.out.println("Total Neg number:"+ neg_num);
              System.out.println("Total zero :"+ zero_num);

           

            


          }


          
}
