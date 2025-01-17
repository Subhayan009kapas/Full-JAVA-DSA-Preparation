class B{
          private String password;

          public void setPassword(String pass){  // abstract
                    password=pass;
          }
          public String  getpassword(){
                    return password;
          }
}

public class Encapsulation2 {
          public static void main(String[] args) {
              B r=new B();
              r.setPassword("abacd");
              System.out.println(r.getpassword());
          }
          
}
