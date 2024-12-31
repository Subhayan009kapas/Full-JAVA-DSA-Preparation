
public class Toggle_bit {
        public static void main(String[] args) {
            int num=5;
            int pos=2;
            int bit_mask=1<<pos;
            int res=num^bit_mask;
            System.out.println(res);
        }  
}
