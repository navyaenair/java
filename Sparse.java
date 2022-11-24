import java.util.*;

class SparseMatrixException extends Exception
{
 SparseMatrixException() 
 {
  super();
  }
  }
  class Sparse()
  {
   public static void main(String []args)
   {
    Scanner sc=new Scanner(System.in);
    int row;
    int column;
    int [][]a=new int[row][column];
    int count=0;
    System.out.println("enter the row and colums: ");
    row=sc.nextInt();
    column=sc.nextInt();
    
    for (int i=0;i<row;i++)
    {
     for (int j=0;i<column;j++)
     {
      a[i][j]=sc.nextInt();
      if (a[i][j]==0)
      {
       count++;
       }
       }
       }
       
     try
       {
       if(count>5)
       {
        throw new SparseMatrixException();
        }
        else
        {
         System.out.printin("the matrix \n");
         
       for (int i=0;i<row;i++)
    {
     for (int j=0;i<column;j++)
     {
       System.out.println(a[i][j]+"\t");
       }
       System.outprint("\n");
       }
       }
       catch(SparseMatrixException e)
      {
       System.out.println("Matrx cannot be displayed");
       }
       finally
       {
        System.out.println("thank you");
        }
        }
        }    
