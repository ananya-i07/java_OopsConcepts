package ConstructorAndInheritance;
class Overloading{
    public Overloading(){
    System.out.println("Constructor without parameters ");
}
public Overloading(int a){
    System.out.printf("Constructor with one parameter that is %d \n",a);
}
public Overloading(int a,int b){
    System.out.printf("Constructor with two parameters that are %d and %d \n",a ,b);
}
}
public class Constructor_Overloading {
    public static void main(String[] args){
Overloading O1=new Overloading();
Overloading O2=new Overloading(3);
Overloading O3=new Overloading(2,4);
  }

}