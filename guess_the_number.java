//fun game to guess the number chosen by computer.
import java.util.Random;
import java.util.Scanner;

class Game{
    int n;
    int randomNumber;
    int noOfGuess=0;
    public Game(){
        Random random = new Random();
        randomNumber = random.nextInt(101); // Generates a number between 0-100
    }
     public void takeuserinput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the number");
         n=sc.nextInt();
         noOfGuess++;
        isCorrectNumber();
        sc.close();
     }
     public void isCorrectNumber(){
      if(n==randomNumber){
        System.out.println("your guess is correct");
        System.out.println("noOfGuess:"+  noOfGuess);
      }
      else if(n>randomNumber){
        System.out.printf(" your gussed number %d is greater",n);
        System.out.println( );
        takeuserinput();
      }
      else if(n<randomNumber){
        System.out.printf("your gussed number %d is smaller",n);
        System.out.println( );
        takeuserinput();
      }
     }
}
public class guess_the_number {
    public static void main(String[] args) {
            Game user=new Game();
            user.takeuserinput();
    }   
}
