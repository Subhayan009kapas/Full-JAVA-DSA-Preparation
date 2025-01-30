public class Hanoi {
          public static void hanoi(int n , String src , String helper , String des){

                    if(n==1){
                              System.out.println("Transfer "+n+" from "+src +" to "+des);
                              return;
                    }

                    hanoi(n-1, src , des , helper);
                    System.out.println("Transfer "+n+" from "+src +" to "+des);
                    hanoi(n-1, helper, src,  des);

          }
          public static void main(String args[]){
                    int n=3;
                    hanoi(n ,"s", "h","d");
          }
}
