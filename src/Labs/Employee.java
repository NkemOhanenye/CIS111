/*
*  Author: Nkem Ohanenye
*  Date: 3/21/17
*  Purpose: example of an 
*  employee class with
*  attributes of name, idNumber,
*  depatment and position.
*/
public class Employee{
   //instance variables == characteristics 
   private String name; //employee's full name
   private int idNumber; //employee's ID number
   private String department; //area that employee works
   private String position; //employee's job title
   
   //CONSTRUCTOR methods
   public Employee(String name, int num, String dept, String position){
      //shadowing???? local variable "name" is same word
      // as instance variable "name"
      this.name = name;
      
      idNumber = num;
      department = dept;
      
      //shadowing again!!
      this.position = position;
   }
   //another constructor method -- "overloading"
   public Employee(String empName, int num){
      name = empName;
      idNumber = num;
      department = ""; //default value
      position = ""; //default value
   }
   //no-arg cpnstructor -- no arguments/parameters
   public Employee(){
      name = ""; 
      idNumber = 0;
      department = "";
      position = "";
   }
   ///////////////////////////////
   //mutator or setter methods
   public void setName(String empName){
      name = empName;
   }
   public void setIdNumber(int num){
      idNumber = num;
   }
   public void setDepartment(String dept){
      department = dept;
   }
   public void setPosition(String pos){
      position = pos;
   }
   
   //accessor or getter methods
   public String getName(){
      return name;
   }
   public int getIdNumber(){
      return idNumber;
   }
   public String getDepartment(){
      return department;
   }
   public String getPosition(){
      return position;
   }

}//end class