import java.util.Scanner;
public class Degree
{
 public static void main(String arg[])throws Exception
 {
  Scanner scanner = new Scanner(System.in);
  System.out.println("1.Enter the Degree");
  System.out.println("2.Enter the Fahrenheat");
   System.out.println("Enter 1 or 2");
   
   int n=scanner.nextInt();
   System.out.println("enter temp");
   float temp=scanner.nextInt();
   float Degree;
   float  Fahrenheat;
  switch(n)
  {
   case 1:
   Fahrenheat=((temp * 9/5) + 32);
   System.out.println("fahrenheat: "+Fahrenheat);
   break;
   case 2:
    Degree=((temp-32) * 5/9);
      System.out.println("Degree: "+Degree);
   }
}
}
      
    
        
