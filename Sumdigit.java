import java.util.Scanner;
public class Sumdigit{
public static void main(String args[])throws Exception
 {
 int n,t,sum=0,rem;
 Scanner scanner=new Scanner(System.in);
 System.out.println("enter an interger:");
 n=scanner.nextInt();
 t=n;
 while(n!=0)
 {
 rem=n%10;
 sum=sum+rem;
 n=n/10;
 }
 System.out.println("sum of digit: "+sum);
 }
 }
