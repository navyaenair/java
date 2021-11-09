import java.util.Scanner;
public class Weeks
{
 public static void main(String arg[])throws Exception
 {
  Scanner scanner = new Scanner(System.in);
  System.out.println("enter a no 1 to 7:");
  Integer n=scanner.nextInt();
  switch(n)
  {
  case 1:
         System.out.println("Monday");
         break;
  case 2:
         System.out.println("Tuesday");
          break;
  case 3:
       System.out.println("wednesday");
        break;
  case 4:
      System.out.println("Thursday");
       break;
  case 5:
          System.out.println("friday");
           break;
  case 6:
         System.out.println("saturday");
         break;
  case 7:
         System.out.println("sunday");
          break;
  default:
         System.out.println("invalid");  
             
   }
}
}
          
