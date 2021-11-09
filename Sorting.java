import java.util.Scanner;

public class Sorting{
public static void main(String args[])throws Exception
 {
  int i,j,temp;
 Scanner scanner=new Scanner(System.in);
 int[ ] arr = new int [100];
 
 System.out.println("how many elemnts:");
 int n=scanner.nextInt();
 System.out.println("enter the array elements:");
 for(i=0;i<n;i++)
 arr[i]=scanner.nextInt();
 
 for(i=0;i<n;i++)
   for(j=0;j<n-1;j++)
   if(arr[j]>arr[j+1])
   {
   temp=arr[j];
   arr[j]=arr[j+1];
   arr[j+1]=temp;
   }
   System.out.println("Sorted successfully");
   System.out.println("sorted array: ");
   for(i=0;i<n;i++)
   System.out.println(arr[i]);
   }
   }
   
   
   
 
