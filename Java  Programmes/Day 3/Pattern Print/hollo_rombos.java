

public class hollo_rombos {
          public static  void main(String args[]){

                    int n=6 ;
                    int m=5;
                    for(int i=1 ;i<=n;i++){
                              for(int j=1 ;j<=n-i ;j++){
                                        System.out.print(" ");
                              }

                              for(int j=1 ;j<=m ;j++){
                                        if(i==1 || j==1 || i==n || j==m){
                                                  System.out.print("*");
                                        }else{
                                                  System.out.print(" ");
                                        }
                                        
                              }
                              System.out.println();
                    }

          }
}
