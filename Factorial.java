import java.util.Scanner;
public class Factorial{
  public static void factorial(int num)
  {
  int i,f=1;
  for(i=1;i<=num;i++)
  f=f*i;
  System.out.println("factorial of the number: "+f);
   }
   public static void main(String arg[])throws Exception
 {
  Scanner scanner = new Scanner(System.in);
  System.out.println("1.Enter the NUMBER");
  int num=scanner.nextInt();
  factorial(num);
  }
 }
  
