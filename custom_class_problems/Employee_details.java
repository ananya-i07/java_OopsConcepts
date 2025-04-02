package custom_class_problems; 
    
     class Employee{
         int salary;
         String name;
      public int getSalary(){
          return salary;
      }
      public String getName(){
        return name;
      }
      public void setName(String n){
        name=n;
      }
    } 
    public class Employee_details{
    public static void main(String[] args) {
     Employee harry=new Employee();
     harry.setName("Harry");
     harry.salary=34000;
     System.out.println(harry.getName());
     System.out.println(harry.getSalary()); 
    }
}