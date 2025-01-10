
import java.util.Scanner;


public class PrintPermutation {
          public static void printPermutation(String str , String permutation){
                    if(str.length()==0){
                              System.out.println(permutation);
                              return;
                    }
                    for(int i=0;i<str.length() ;i++){
                              char curChar=str.charAt(i);
                              String newStr=str.substring(0,i)+str.substring(i+1);
                              printPermutation(newStr, permutation+curChar);

                    }


          }
          public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the string");
              String str=sc.next();
              String permutation="";
              printPermutation(str, permutation);
          }
}
