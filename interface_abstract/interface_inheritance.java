package interface_abstract;
class Monkey{
    public void jump(){
        System.out.println("Jump");
    }
    public void bite(){
       System.out.println("bite");
    }
}

 interface BasicAnimal {
    abstract void eat();
    abstract void sleep();
}

 class Human extends Monkey implements BasicAnimal{
   public void eat(){
    System.out.println("eat");
    }
    public void sleep(){
    System.out.println("sleep");
    }
}
public class interface_inheritance {
    public static void main(String[] args) {
        Human H1=new Human();
        H1.bite();
        H1.jump();
        H1.eat();
        H1.sleep();
    }
}
