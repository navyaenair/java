/*
program4-Read Kboard Input method-2
*/
import java.io.*;

public class Program4
{
       public static void main(String args[])
       {
       try{
       
       BufferedReader reader=new  BufferedReader(new InputStreamReader(System.in));
      String name=reader.readLine();
      System.out.println("my name:"+name);}
      catch(Exception ex){
      System.out.println(ex);
      }
      }
}
