public class keypadPhone {
          public static String keyPad[]={"." , "abc","def","ghi","jkl","mno","pqrs" ,"uvw","xyz"};
          public static void KeypadComb(String str , String comb , int idx){
                    if(idx==str.length()){
                              System.out.println(comb);
                              return;
                    }
                    char curChar=str.charAt(idx);
                    String map=keyPad[curChar-'0'];
                    for(int i=0;i<map.length() ;i++){
                              KeypadComb(str, comb+map.charAt(i), idx+1);
                    }

          }
          public static void main(String[] args) {
              String str="23";
              String comb="";
              int idx=0;
              KeypadComb(str, comb, idx);
          }
}
