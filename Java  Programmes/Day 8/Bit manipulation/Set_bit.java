

public class Set_bit {
         public static void main(String[] args) {
             int num=5;
             int pos=1;
             int bit_mask=1<<pos;
             int newnum=num | bit_mask;
             System.out.println(newnum);
         } 
}
