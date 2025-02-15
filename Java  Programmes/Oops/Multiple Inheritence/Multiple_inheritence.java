
interface Human {

    void eat();
}

interface Animal {

    void Brain();
}

class Monkey implements Human, Animal {

    public void eat() {
        System.out.println("They can eat any things ");
    }

    public void Brain() {
        System.out.println("They can Invenet by their brain");
    }
}

public class Multiple_inheritence {

    public static void main(String[] args) {
        Monkey s1 = new Monkey();
        s1.eat();
        s1.Brain();

    }

}
