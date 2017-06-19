// Name: Manahari Dahal     Date Assigned: 25 January 2017

// Course: CSCI 2003 42733  Date Due: 31 January 2017

// Instructor: Ms. Greer
//
// File name: Employee
//
// Program Description: A class that is used to create and check the objects using setters and getters


// declaring public class Employee
public class Employee      
{
      // instance variables
      private String name;
      private int IDn;
      private String department;
      private String position;
  
      // no-argument constructor
      public Employee()
      {
            name ="";
            IDn=0;
            department="";
            position="";
      }
  
      // argument constructor
      public Employee (String n, int number, String d, String p)
      {
            name = n;
            IDn = number;
            department = d;
            position = p;
      }
  
  
      // using setters to set the value of the attribute
      public void setName(String n)
      {
            name = n;
      }   
  
      public void setIDn(int number)
      {
            IDn = number;   
      }
  
      public void setDepartment(String d)
      {
            department = d;
      }
   
      public void setPosition(String p)
      {
            position = p;
      }


      // using getters to retrieve the value of the attribute
      public String getName()
      {
            return name;
      }

      public int getIDn()
      {
            return IDn;    
      }

      public String getDepartment()
      {
            return department;
      }
   
      public String getPosition()
      {
            return position;
      }

}
