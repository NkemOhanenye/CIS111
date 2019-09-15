public class EmployeeTest{
   //DRIVER
   public static void main(String args[]){
      //cretare 3 EMPLOYEE objects
      //TEST OUT CONSTRUCTOR METHOD #1
      Employee empl = new Employee("Susan Meyers",
                   47899, "Accounting", "Vice President");
      //TEST OUT CONSTRUCTOR METHOD #2
      Employee emp2 = new Employee("Mark Jones", 39119);
      //TEST OUT SETTER METHODS
      emp2.setDepartment("IT");
      emp2.setPosition("Programming");
      //TEST OUT CONSTRUCTOR METHOD #3
      Employee emp3 = new Employee();
      //TEST OUT SETTER METHODS 
      emp3.setName("Joy Rogers");
      emp3.setIdNumber(81774);
      emp3.setDepartment("Manufacturing");
      emp3.setPosition("Engineer");
      
      //PRINT OUT IN TABULAR FORM
      System.out.println("NAME\t ID NUMBER\t DEPARTMENT\t POSITION");
      System.out.println("--------------------------------------");
      //TEST OUT GETTER METHODS
      System.out.println(empl.getName() + "\t" + empl.getIdNumber() + 
                 "\t" + empl.getDepartment() + "\t" + empl.getPosition());
      System.out.println(emp2.getName() + "\t" + emp2.getIdNumber() + 
                 "\t" + emp2.getDepartment() + "\t \t" + emp2.getPosition());
      System.out.println(emp3.getName() + "\t" + emp3.getIdNumber() + 
                 "\t" + emp3.getDepartment() + "\t" + emp3.getPosition());
   }
}