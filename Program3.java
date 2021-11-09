/*
program3-Read Kboard Input method-1
*/
import java.util.Scanner;
public class Program3
{
       public static void main(String args[])
       {
         Scanner scanner = new Scanner(System.in);
         System.out.println("enter your name:");
         String name=scanner.nextLine();
         System.out.println("MY Name:"+name);
          System.out.println("enter your rollno:");
         int rollNo=scanner.nextInt();
         System.out.println("Roll no:"+rollNo);
}
}
