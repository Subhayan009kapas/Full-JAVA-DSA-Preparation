

public class Get_bit {
          public static void main(String[] args) {
             int num=5;
             int pos=1;
             int bitmask=1<<pos;
             if((bitmask & num)==0){
                    System.out.println("bit is 0");
             }else{
                    System.out.println("bit is 1");
             }

          }
}
