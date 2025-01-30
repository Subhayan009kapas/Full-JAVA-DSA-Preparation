
import java.util.HashSet;
public class UniqueSubsequence {
          public static void uniqueSub(String str , String newStr , int idx , HashSet<String> set){
                    if(idx==str.length()){
                              if(set.contains(newStr)){
                                        return;
                              }else{
                                        set.add(newStr);
                                        System.out.println(newStr);
                                        return;
                                        
                              }
                             
                    
                    }
                    char curChar=str.charAt(idx);
                    uniqueSub(str, newStr+curChar, idx+1 , set);
                    uniqueSub(str, newStr, idx+1 , set);
          }
          public static void main(String args[]){
                    String str="aaa";
                    String newStr="";
                    int idx=0;
                   HashSet<String> set=new HashSet<>();
                   uniqueSub(str, newStr, idx, set);
          }
}
