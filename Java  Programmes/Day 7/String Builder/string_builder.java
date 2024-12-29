

public class string_builder {
          public static void main(String args[]){
                    StringBuilder sb=new StringBuilder("Tony");
                    System.out.println(sb);
                    System.out.println(sb.charAt(0));

                    // setcharAt
                    sb.setCharAt(0, 'p');
                    System.out.println(sb);

                    // insert
                    sb.insert(0,'s');
                    System.out.println(sb);


                    //delete
                    sb.delete(0,2);
                    System.out.println(sb);

                    //append

                    StringBuilder str=new StringBuilder("h");
                    System.out.println(str);
                    str.append('e');
                    System.out.println(str);
                    str.append('l');
                    System.out.println(str);
                    str.append('l');
                    System.out.println(str);
                    str.append('o');
                    System.out.println(str);

                    //length

                    System.out.println(str.length());
                    



                    


          }
}
