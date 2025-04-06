package interface_abstract;

public class Polymorphism {
    public static void main(String[] args) {
        Monkey m1=new Human();
        m1.jump();
        m1.bite();
        // m1.eat();
        // m1.sleep();//can not be used.
        BasicAnimal A1=new Human();
        A1.eat();
        A1.sleep();
        // A1.jump();
        // A1.bite();//can not be used.
    }
}
