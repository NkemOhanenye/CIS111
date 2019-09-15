/*
*  Author: Nkem Ohanenye
*  Date: 3/23/17
*  Purpose: to create 
*  retail items for the
*  purpose of being held
*  in a virtual store.
*/
public class RetailItem{
   
   //creates the variables to be used in the class
   private String itemNum;
   private String description;
   private int inStorage;
   private double price;
   
   public RetailItem(String itemNum, String descp, int UOH, double price){
      //calls the variables to be used and grabbed in the constructor
      //creates a shadow variable
      this.itemNum = itemNum;
      description = descp;
      inStorage = UOH;
      this.price = price;
      
   }
   
   public RetailItem(String num, int UOH, double money){
      //creates an overload constructor
      itemNum = num; 
      description = "";
      inStorage = UOH;
      price = money;
   }
   
   public RetailItem(){
   //creates a no-args constructor
      itemNum = ""; 
      description = "";
      inStorage = 0;
      price = 0;
      
   }
   //start of the setter methods
   public void setItemNum(String num){
      itemNum = num; 
   }
   public void setDescription(String descp){
      description = descp; 
   }
   public void setInStorage(int UOH){
      inStorage = UOH; 
   }
   public void setPrice(double money){
      price = money; 
   }
   //start of the getter methods
   public String getItemNum(){
      return itemNum; 
   }
   public String getDescription(){
      return description;
   }
   public int getInStorage(){
      return inStorage; 
   }
   public double getPrice(){
      return price; 
   }
}