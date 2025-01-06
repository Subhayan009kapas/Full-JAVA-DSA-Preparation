
import java.util.*;
public class Move_Element_to_end {
  public static void moveElement(String str , int count , String newStr,int idx){
    if(idx==str.length()-1){
      for(int i=0;i<count;i++){
        newStr+='x';
      }
      System.out.println("New String is "+newStr);
      return;
    }
    if(str.charAt(idx)=='x'){
      count++;
      moveElement(str, count, newStr, idx+1);
    }else{
      newStr+=str.charAt(idx);
      moveElement(str, count, newStr, idx+1);
    }
  }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the string");
            String str=sc.next();
            int count=0;
            int idx=0;
            String newStr="";
            moveElement(str, count, newStr, idx);
        }
}
