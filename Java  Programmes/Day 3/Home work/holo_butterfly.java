

public class holo_butterfly {
          public static void main(String[] args) {
              int n=6 ;

            //   upper part 
              for(int i=1 ;i<=n ;i++){
                    for(int j=1 ;j<=i ; j++){
                              if(j==1 || i==j){
                                        System.out.print("*");
                              }else{
                                        System.out.print(" ");
                              }

                    }
                    for(int j=1 ;j<=2*(n-i);j++){

                              System.out.print(" ");

                    }

                    for(int j=1 ;j<=i ; j++){
                        if(j==1 || i==j){
                                  System.out.print("*");
                        }else{
                                  System.out.print(" ");
                        }

              }

                    System.out.println();
              }

              //   upper part  end 

              // Lower part start

              for(int i=n ;i>=1 ;i--){
                    for(int j=1 ;j<=i ; j++){
                              if(j==1 || i==j){
                                        System.out.print("*");
                              }else{
                                        System.out.print(" ");
                              }

                    }
                    for(int j=1 ;j<=2*(n-i);j++){
                              System.out.print(" ");

                    }

                    for(int j=1 ;j<=i ; j++){
                              if(j==1 || i==j){
                                        System.out.print("*");
                              }else{
                                        System.out.print(" ");
                              }

                    }

                    System.out.println();
              }


               // Lower part end 
          }
}
