public class Subsequence_of_String {
    public static void subSecquence(String str , String newStr , int idx){

        // base case
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }

        char curChar=str.charAt(idx);

        //to add
        subSecquence(str, newStr+curChar, idx+1);

        // not to add 
        subSecquence(str, newStr, idx+1);


    }
          public static void main(String[] args) {
              String str="abc";
              String newStr="";
              int idx=0;
              subSecquence(str, newStr, idx);
          }
}
