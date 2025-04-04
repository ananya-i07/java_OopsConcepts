package ConstructorAndInheritance;
import java.lang.Math;

class Cylinder{
private float h;
private float r;
public void setRadious(float i){
   r=i;
}
public void setHeight(float j){
    h=j;
 }
 public float getRadious(){
    return r;
 }
 public float getHeight(){
    return h;
 }
public float SurfaceArea(){
 return (float)(2*Math.PI*r*(r+h));
}
public float Volume(){
    return (float)(Math.PI*r*r*h);
}
}
public class CylinderMeasurement{
 public static void main(String[] args) {
    Cylinder C1=new Cylinder();
    C1.setHeight(2.3f);
    C1.setRadious(1.0f);
    System.out.println("Radious:"+ C1.getRadious());
    System.out.println("Height:"+ C1.getHeight());
    System.out.println("Surface Area:"+ C1.SurfaceArea());
    System.out.println("Volume:" + C1.Volume());
 }
}