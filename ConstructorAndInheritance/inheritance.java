package ConstructorAndInheritance;

class circle{
    int radious;
    circle (int r){
    this.radious=r;
    } 
    public double area(){
        return Math.PI*radious*radious;
    }
}

class cylinder extends circle{
    int height;
    cylinder (int r,int h){
    super(r);
    this.height=h;
    }
    public double volume(){
        return Math.PI*radious*radious*height;
    }
}
public class inheritance  {
    public static void main(String[] args) {
        
    cylinder c=new cylinder(3,6);
    System.out.println(c.volume());
    }
}