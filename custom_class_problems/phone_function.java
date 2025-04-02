package custom_class_problems;
 class Cellphone{
 public void vibrating(){
   System.out.println("Vibrating................");
 }
 public void ringing(){
    System.out.println("Ringing................");
  }
  public void callfriend(){
    System.out.println("Calling R..........");
  }
 }
public class phone_function {
    public static void main(String[] args) {
        Cellphone vivo=new Cellphone();
        vivo.ringing();
        vivo.vibrating();
        vivo.callfriend();
    
    }
}
