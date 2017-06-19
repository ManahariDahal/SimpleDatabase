// Name: Manahari Dahal     Date Assigned: 25 January 2017

// Course: CSCI 2003 42733  Date Due: 31 January 2017

// Instructor: Ms. Greer
//
// File name: Company
//
// Program Description: A company class that inputs employees' name, id and creates a simple database



// declaring a public class Company
public class Company                         
{                        

   public static void main(String[] args)    // main method
   {      
      
      //creating three different objects in which two objects (object 1&2 has arguments but objeect3 has no arguments
      Employee object1 = new Employee("Susan Meyers", 47889, "Accounting", "Vice President");
      Employee object2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
      Employee object3 = new Employee();
      
      //since object3 has no argument, setter is used
      object3.setName("Joy Rogers");
      object3.setIDn(81774);
      object3.setDepartment("Manufacturing");
      object3.setPosition("Engineer");
   
      //printing the layout of the names desired by the user while using the getters
      System.out.printf("%-18s %-18s %-18s %-18s","Name","ID Number","Department","Position");
      System.out.print("\n---------------------------------------------------------------------------");
      System.out.printf("\n%-18s %-18s %-18s %-18s",object1.getName(),object1.getIDn(),object1.getDepartment(),object1.getPosition());
      System.out.printf("\n%-18s %-18s %-18s %-18s",object2.getName(),object2.getIDn(),object2.getDepartment(),object2.getPosition());
      System.out.printf("\n%-18s %-18s %-18s %-18s",object3.getName(),object3.getIDn(),object3.getDepartment(),object3.getPosition());
   
   
   }
}