package custom_class_problems;
// class rectangle{
//     float side1;
//     float side2;
//     float side3;
//     public float setperimeter(){
//         return side1+side2+side3;
//     }
//     public float setarea(){
//         return side1*side2*side3;
//     }
//  }
// public class rectangle_measurements {
//     public static void main(String[] args) {
//         rectangle r1=new rectangle();
//         r1.side1=4.6f;
//         r1.side2=3.4f;
//         r1.side3=2.4f;
//         System.out.println(r1.setarea());
//         System.out.println(r1.setperimeter());

//     }
// }

//OR


class rectangle{
    float side1;
    float side2;
    float side3;
    public float setperimeter(float side1,float side2,float side3){
        return side1+side2+side3;
    }
    public float setarea(float side1,float side2,float side3){
        return side1*side2*side3;
    }
 }
public class rectangle_measurements {
    public static void main(String[] args) {
        rectangle r1=new rectangle();
        System.out.println(r1.setarea(4.6f,3.4f,2.4f));
        System.out.println(r1.setperimeter(4.6f,3.4f,2.4f));

    }
}