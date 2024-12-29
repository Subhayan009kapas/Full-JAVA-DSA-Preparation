

public class string_rev {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Subhayan");
       for(int i=0;i<str.length()/2;i++){
          int front=i;
          int back=str.length()-1-i;
          char frontChar=str.charAt(front);
          char backChar=str.charAt(back);

          str.setCharAt(front , backChar);
          str.setCharAt(back , frontChar);
       

       }
       System.out.println(str);
    }      
}
