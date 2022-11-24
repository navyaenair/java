import java.io.*;

class Fdemo
{
 public static void main(String args[])
 {
 File ip=new File("a.txt");
 File op=new File("b.txt");
 
 FileReader ins=null;
 FileWriter outs=null;
 
 try
 {
  ins=new FileReader(ip);
  outs=new FileWriter(op);
  
  int ch;
  while((ch=ins.read())!=-1)
  {
   outs.write(ch);
  }
  }
  catch(Exception e)
  {
   System.out.print(e);
   System.exit(0);
   }
   finally
   {
    try{
         ins.close();
         outs.close();
        }
        catch(IOException e)
        {
         System.out.print(e);
         }
         }
         } 
         }
