public class Subseequence {
          public static void Subsequence(String str , String newString , int idx){
                    if(idx==str.length()){
                              System.out.println(newString);
                              return;
                    }
                    char curchar=str.charAt(idx);
                    Subsequence(str, newString+curchar, idx+1);
                    Subsequence(str, newString, idx+1);
          }
          public static void main(String args[]){
                    String str="abc";
                    String newStr="";
                    int idx=0;
                    Subsequence(str, newStr, idx);
          }
          
}
