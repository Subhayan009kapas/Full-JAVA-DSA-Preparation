class car{
          int Id;
          String color;
          String type;
          String company;

          public void write(){
                    System.out.println("Writing the deteials of the car :");
                   
          }

          public void carDetails(){
                    System.out.println(this.Id);
                    System.out.println(this.color);
                    System.out.println(this.type);
                    System.out.println(this.company);
          }
}

public class class_obj {
          public static void main(String[] args) {
              car car1=new car();
              car1.Id=1;
              car1.color="Blue";
              car1.type="Sportz";
              car1.company="Suzuki";

              car car2=new car();
              car2.Id=2;
              car2.color="White";
              car2.type="Classic";
              car2.company="Scorpio";
              car1.write();

              car1.carDetails(); 
              System.out.println();
              car2.carDetails();
          }
          
}
