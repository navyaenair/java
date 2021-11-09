import java.util.Scanner;
public class Arithmeticop{
public static void main(String args[])throws Exception
 {
 Scanner scanner=new Scanner(System.in);
 System.out.println("enter two numbers:");
 int num1=scanner.nextInt();
 int num2=scanner.nextInt();
 int add,substract,division,multiply;
 add=num1+num2;
 substract=num1-num2;
 division=num1/num2;
 multiply=num1*num2;
 
 System.out.println("add: "+add);
 System.out.println("substraction: "+substract);
 System.out.println("division: "+division);
 System.out.println("multiply: "+multiply);
 }
 }
