public class permutation {
          public static void permutationComb(String str ,  String permutation){

                    if(str.length()==0){
                              System.out.println(permutation);
                              return;
                    }
                   for(int i=0;i<str.length() ;i++){
                      char curChar=str.charAt(i);
                      String newStr=str.substring(0,i)+str.substring(i+1);
                      permutationComb(newStr, permutation+curChar);
                   }

          }
          public static void main(String args[]){
                    String str="abc";
                  
                    String permutation="";
                    permutationComb(str, permutation);

          }
}
