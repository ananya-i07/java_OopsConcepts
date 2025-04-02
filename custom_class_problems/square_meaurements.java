package custom_class_problems;
//  class square{
//     float side;
//     public float setperimeter(float side){
//         return 4*side;
//     }
//     public float setarea(float side){
//         return side*side;
//     }
//  }
// public class square_meaurements {
//     public static void main(String[] args) {
//         square s1=new square();
//         System.out.println(s1.setarea(1.2f));
//         System.out.println(s1.setperimeter(0.8f));

//     }
// }
 
//OR


class square{
    float side;
    public float setperimeter(){
        return 4*side;
    }
    public float setarea(){
        return side*side;
    }
 }
public class square_meaurements {
    public static void main(String[] args) {
        square s1=new square();
        s1.side=4.6f;
        System.out.println(s1.setarea());
        System.out.println(s1.setperimeter());

    }
}