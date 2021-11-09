import java.util.Scanner;
public class Linear{
public static void main(String args[])throws Exception
 {
  int i,j,n,flag=0;
 Scanner scanner=new Scanner(System.in);
 int[ ] arr = new int [100];
 
 System.out.println("how many elemnts:");
 n=scanner.nextInt();
 System.out.println("enter the array elements :");
 for(i=0;i<n;i++)
 arr[i]=scanner.nextInt();
  System.out.println("enter the array elements to search :");
  int item=scanner.nextInt();
  for(i=0;i<n;i++)
   if(arr[i]==item)
   {
    flag=1;
    break;
    }
    if(flag==1)
     System.out.println(item+"found position"+(i+1));
     else
      System.out.println("not found");
      }
      }
   
