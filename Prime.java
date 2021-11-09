import java.util.Scanner;
public class Prime{
public static void main(String args[])throws Exception
 {
 int n,i,flag=0;
 Scanner scanner=new Scanner(System.in);
  System.out.println("enter an interger:");
   n=scanner.nextInt();
   for(i=2;i<=n/2;i++)
   {
   if(n%i==0)
   {
   flag=0;
   break;
   }
   }
   if(flag==1)
  System.out.println("prime");
  else
   System.out.println(" not prime");
   }
   }
  
    
