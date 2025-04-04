package ConstructorAndInheritance;
/* Inheritance with constructor 
 and overloading of constructor.
 */
class Animals{
    private String type;
     public void setType(String t){
      type=t;
     }
     public String getType(){
        System.out.println("type of animal:");
        return type;
     }
     public Animals(){
     System.out.println("Constructor of parent class \n");
     }
     public Animals(int a){
        System.out.printf("This is how we use super keyword.\n And the value given is %d \n",a);
        }
     public Animals(String name){ 
        System.out.printf("Constructor of parent class having one parameter name: %s \n",name);
        }
     public Animals(String name,String nick_name){
        System.out.printf("Constructor of parent class having two parameters name: %s and nick name: %s \n",name ,nick_name);
        }
}
class Cat extends Animals{
    private String owner_name;
     public void setOwner(String o){
      owner_name=o;
     }
     public String getOwner(){
        System.out.println("owner name is");
        return owner_name;
     }

    public Cat(){
        System.out.println("Constructor of child class \n");
    }
    public Cat(int b){
        super(7);
    }
    public Cat(String color){
        System.out.printf("Constructor of child class having one parameter color:%s \n",color);
    }
    public Cat(String color,int age){
        System.out.printf("Constructor of child class having two parameters color:%s and age %d \n",color,age);
    }
}
public class Constructor_Inheritance {
    public static void main(String[] args) {
        //object of parent class
        Animals A1=new Animals();
        Animals A2=new Animals("rose");
        Animals A3=new Animals("rose","meow");
        //objects of child class.
       Cat C1=new Cat();//Animals A1=new Animals( );will surely execute before this.
       Cat C2=new Cat("white");//Animals A1=new Animals();will surely execute before this.
       Cat S =new Cat(3);
       Cat C3=new Cat("white",1);//Animals A1=new Animals();will surely execute before this.
       //calling method of parent class through parent class.
       A1.setType("pet");
       System.out.println(A1.getType());
       //calling method of parent class through child class.
       C1.setType("wild");
       System.out.println(C1.getType());
       //calling method of child class through child class.
      C1.setOwner("Mr.J");
      System.out.println(C1.getOwner());
    }
 }

