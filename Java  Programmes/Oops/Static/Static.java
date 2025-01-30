class Boy{
          String name;
          static String School;
}
public class Static {
          public static void main(String[] args) {
              Boy.School="KDHS";
              Boy boy=new Boy();
              boy.name="Subhayan";
              System.out.println(boy.name);
              System.out.println(boy.School);
          }
}
