
import java.util.HashSet;

public class Unique_subsequence {
          public static void UniqueSubSequence(String str ,String newString , int idx , HashSet<String> set ){
                    if(idx==str.length()){
                              if(set.contains(newString)){
                                        return;
                              }else{
                                        System.out.println(newString);
                                        set.add(newString);
                                        return;
                              }
                    }
                    char curChar=str.charAt(idx);
                    // to add
                    UniqueSubSequence(str, newString+curChar, idx+1, set);

                    // not to add
                    UniqueSubSequence(str, newString, idx+1, set);

          }
          public static  void main(String args[]){
                    String str="aaa";
                    String newStr="";
                    int idx=0;
                    HashSet<String> set =new HashSet<>();
                    UniqueSubSequence(str, newStr, idx, set);


          }
}
