import java.util.scanner;
public class Reverse{
public static void main(String args[])throws Exception
 {
 int n,t,rev=0,rem;
 Scanner scanner=new Scanner(System.in);
 System.out.println("enter an interger:");
 n=scanner.nextInt();
t=n;
 while(n!=0)
 {
  rem=n%10;
  rev=(rev*10)+rem;
  n=n/10;
  }
    System.out.println("reverse:"+rev);
    }
    }
  
