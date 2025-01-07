

public class Keypad_combination {
          public static String keypad[]={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
          public static void comb(String str , String combination , int idx){
            if(idx==str.length()){
                System.out.println(combination);
                return;
            }

                    char curChar=str.charAt(idx);
                    String map=keypad[curChar-'0'];
                    for(int i=0;i<map.length() ;i++){
                              comb(str , combination+map.charAt(i), idx+1);
                    }

          }
          public static void main(String[] args) {
              String str="23";
              String combination="";
              int idx=0;
              comb(str, combination, idx);
          }
}
