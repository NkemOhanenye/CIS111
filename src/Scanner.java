import java.util.*;
public class Scanner{
   public static void main (String args[]){
      Scanner x = new Scanner(System.in);
      System.out.println("enter this year for x ");
      Scanner y = new Scanner(System.in);
      System.out.println("type a different year for y ");
      System.out.println(x - y);
   }
}