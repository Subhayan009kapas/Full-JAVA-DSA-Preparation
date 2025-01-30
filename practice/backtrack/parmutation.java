

public class parmutation {
          public static void permutation(String str , int idx , String permu){
                    if(str.length()==0){
                              System.out.println(permu);
                              return;
                    }

                    for(int i=0;i<str.length();i++){
                              char curChar=str.charAt(i);
                              String newString=str.substring(0,i)+str.substring(i+1);
                              permutation(newString, idx+1, permu+curChar);
                    }

          }
          public static void main(String[] args) {
              String str="ABC";
              int idx=0;
              String permu="";
              permutation(str, idx, permu);
          }
}
