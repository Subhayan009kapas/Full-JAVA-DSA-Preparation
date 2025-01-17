
abstract class programming {

    public abstract void Developer();
}

class HTML extends programming {

    public void Developer() {
        System.out.println("Html Developer");
    }
}

class JAVA extends programming {

    public void Developer() {
        System.out.println("Java developer");
    }
}

public class Abstraction2 {

    public static void main(String[] args) {

        HTML s1 = new HTML();
        s1.Developer();
        JAVA s2 = new JAVA();
        s2.Developer();

    }

}
