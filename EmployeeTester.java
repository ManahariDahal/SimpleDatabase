public class EmployeeTester
{
   public static void main(String[] args)
   {
   
      // it creates two objects, object 1 has argument and object 2 has no argument
      Employee object1 = new Employee("Tyler Greer",12345,"Computer Science","Instructor");   //with argument
      Employee object2 = new Employee(); // without argument                                                    
 
      // testing argument constructor
      System.out.println("TESTING ARGUMENT CONSTRUCTOR");
      System.out.println("----------------------------\n");       

      System.out.println(object1.getName());
      System.out.println("Expected: Tyler Greer\n");              
      
      System.out.println(object1.getIDn());
      System.out.println("Expected: 12345\n");                    // printing the user's desired layout
      
      System.out.println(object1.getDepartment());
      System.out.println("Expected: Computer Science\n");         

      System.out.println(object1.getPosition());                 
      System.out.println("Expected: Instructor\n");
      
      // testing no-argument constructor
      System.out.println("TESTING NO-ARGUMENT CONSTRUCTOR");
      System.out.println("-------------------------------\n");

      // refering to setters 
      object2.setName("Desiree Wilson");
      object2.setIDn(45678);                                          // printing the user's desired layout
      object2.setDepartment("Orthopaedics");
      object2.setPosition("Registered Nurse");

      // testing no-argument constructor again

      System.out.println(object2.getName());
      System.out.println("Expected: Desiree Wilson\n");
   
      System.out.println(object2.getIDn());
      System.out.println("Expected: 45678\n");                       // printing the user's desired layout
                                                   
      System.out.println(object2.getDepartment());          
      System.out.println("Expected: Orthopaedics\n");
   
      System.out.println(object2.getPosition());
      System.out.println("Expected: Registered Nurse");


   }
}
