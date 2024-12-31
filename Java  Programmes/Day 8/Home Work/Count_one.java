



public class Count_one {
      public static void main(String[] args) {
          int n=5;
          //integer to binary
          String binary=Integer.toBinaryString(n);
          System.out.println(binary);

          // binary to integer
          int num=Integer.parseInt(binary, 2);
          System.out.println("integer num is "+ num);

          
          int count=0;
          for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                count++;
            }
          }
          System.out.println("count of 1 is "+count);

      }    
}
