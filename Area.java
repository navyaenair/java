import java.util.Scanner;
//import java.lang.Math;
public class Area{
public static void main(String args[])throws Exception
{
float s,p;
double area;
Scanner scanner=new Scanner(System.in);
System.out.println("enter the sides of the triangle");
float a=scanner.nextFloat();
float b=scanner.nextFloat();
float c=scanner.nextFloat();
p=a+b+c;
s=p/2;
area=Math.sqrt((s*((s-a)*(s-b)*(s-c))));
System.out.println("perimeter: "+p);
System.out.println("S: "+s);
System.out.println("area: "+area);
}
}
