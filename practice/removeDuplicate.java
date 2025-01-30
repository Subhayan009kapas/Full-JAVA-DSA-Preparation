public class removeDuplicate {
          public static boolean map[]=new boolean[26];
          public static void removeduplicate(String str , String newStr , int idx){
                    if(idx==str.length()){
                              System.out.println(newStr);
                              return;
                    }
                    char curChar=str.charAt(idx);
                    if(map[curChar-'a']==true){
                              removeduplicate(str, newStr, idx+1);

                    }else{
                              newStr+=curChar;
                              map[curChar-'a']=true;
                              removeduplicate(str, newStr, idx+1);

                    }
                    
                    

          }
          public static void main(String args[]){
                    String str="aabbccdd";
                    String newStr="";
                    int idx=0;
                    removeduplicate(str, newStr , idx);
          }
}
