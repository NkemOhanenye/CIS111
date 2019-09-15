public class RetailItemTest{

   public static void main(String args[]){
      //uses the RetailItem class as a variable to add the items
      RetailItem item = new RetailItem("Item #1", "Jacket", 12, 59.95);
      RetailItem item2 = new RetailItem("Item #2", "Designer Jeans", 40, 34.95);
      RetailItem item3 = new RetailItem("Item #3", "Shirt", 20, 24.95);
      
      //creates the legend
      System.out.println("\t      Description\t   Units on Hand\tPrice");
      //creates the line
      System.out.println("---------------------------------------------------------------");
      
      //adds the class variables (items) to print 
      System.out.println(item.getItemNum() + "\t\t" + item.getDescription() + 
                 "\t\t\t" + item.getInStorage() + "\t\t$" + item.getPrice());
      System.out.println(item2.getItemNum() + "\t\t" + item2.getDescription() + 
                 "\t\t" + item2.getInStorage() + "\t\t$" + item2.getPrice());
      System.out.println(item3.getItemNum() + "\t\t" + item3.getDescription() + 
                 "\t\t\t" + item3.getInStorage() + "\t\t$" + item3.getPrice());
      
   }
}