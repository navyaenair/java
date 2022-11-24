class Data
{
static int addData(int x,int y)
{
 return x+y;
}
static double addData(double x,double y)
{
 return x+y;
}
static String addData(String x,String y)
{
 return x+y;
}
}
class Methodclass{
public static void main(String []args){
int myNum1 = Data.addData(3,4);
double myNum2 = Data.addData(9.0,18.5);
String myData=Data.addData("navya","nair");
System.out.println("int: "+myNum1);
System.out.println("double: "+myNum2);
System.out.println("string: "+myData);
}
}

