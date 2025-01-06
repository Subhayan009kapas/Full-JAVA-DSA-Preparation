public class Remove_duplicate_from_String {
        public static boolean map[]=new boolean[26];

        public static void removeDuplicate(String str , String newString , int idx){

          if(idx==str.length()){
                    System.out.println("New string "+newString);
                    return;
          }
          char currrentChar=str.charAt(idx);

          if(map[currrentChar -'a']==true){
                    removeDuplicate(str, newString, idx+1);
          }else{
                    newString+=currrentChar;
                    map[currrentChar-'a']=true;
                    removeDuplicate(str, newString, idx+1);
          }

        }
        public static void main(String[] args) {
            String str="xxyyzz";
            String newString="";
            int idx=0;
            removeDuplicate(str, newString, idx);

        }
}
