


class Find_occurence {

          // 1st way ----------------------------

    public static int first = -1;
    public static int last = -1;

//     public static void occurence(String str, int idx, char target) {
//           if(idx==str.length()-1){
//                     System.out.println("first occurance "+first );
//                     System.out.println("Last occurance "+last);
//                     return;
//           }

//         if (str.charAt(idx) == target) {
//             if (first == -1) {
//                 first = idx;
//             } else {
//                 last = idx;
//             }
//         }
//         occurence(str, idx + 1, target);

//     }


       // 2nd Way-------------------------------------

public static void firstoccr(String str , int idx , char target){
          if(idx==str.length()){
                    return;
          }
          if(str.charAt(idx)==target){
                    System.out.println("Target found at first "+idx);
                    return;
          }
          firstoccr(str, idx+1, target);
}
public static void lastoccr(String str , int idx , char target){
          if(idx==-1){
                    return;
          }
          if(str.charAt(idx)==target){
                    System.out.println("Target is found at last "+idx);
                    return;
          }
          lastoccr (str, idx-1, target);
}

   

    public static void main(String args[]) {
        String str = "abaacdaefaan";
        int idx = 0;
        char target = 'a';
//         occurence(str, idx, target);
firstoccr(str, idx, target);
lastoccr(str, str.length()-1, target);

    }
}
