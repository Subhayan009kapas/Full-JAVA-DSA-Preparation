
public class clear {
       public static void main(String[] args) {
           int num=5;
           int pos=2;
           // bitmask
           int bitmask=1<<pos;
           int notBitmask=~(bitmask);
           int newNumber=(notBitmask & (num));
           System.out.println(newNumber);
       }   
}
