package interface_abstract;
abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
     void write(){
     System.out.println("Write with pen.");
    }
    void refill(){
    System.out.println("Let's refill the pen.");
    }
    void changeNib(){
        System.out.println("Change the nib of pen.");
    }
}
public class entity_pen {
    public static void main(String[] args) {
        FountainPen F1=new FountainPen();
        F1.write();
        F1.refill();
        F1.changeNib();
    }
    
}
