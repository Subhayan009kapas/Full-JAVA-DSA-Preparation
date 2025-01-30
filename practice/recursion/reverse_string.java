public class reverse_string {
          public static void revStr(String str , int idx){

                    if(idx<0){
                              return;
                    }

                    System.out.println(str.charAt(idx));
                    revStr(str, idx-1);
                
          }
        public static void main(String[] args) {
           String str="abcd";
           int idx=str.length()-1;
           revStr(str, idx);
        }  
}
