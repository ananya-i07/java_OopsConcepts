package custom_class_problems;
class TommyVecetti{
    public void sethit(){
        System.out.println("Hitting the enemy");
    }
    public void setrun(){
        System.out.println("Running from the enemy");
    }
    public void setfire(){
        System.out.println("Firing on the enemy");
    }
}
public class RockstarGames {
    public static void main(String[] args) {
        TommyVecetti player1=new TommyVecetti();
        player1.sethit();
        player1.setrun();
        player1.setfire();
    }
    
}
