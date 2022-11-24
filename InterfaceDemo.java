interface Shape
{
void area();
void perimeter();
}

class Circle implements Shape
{
int radius;
Circle(int radius)
{
this.radius = radius;
}
public void area()
{
double areaCir = 3.14*radius*radius;
System.out.println("The area of circle is "+areaCir);

}
public void perimeter()
{
double perimeterCir = 2*3.14*radius;
System.out.println("The perimeter of circle is "+perimeterCir);

}
}
class Rectangle implements Shape
{
int length;
int breadth;
Rectangle(int length, int breadth)
{
this.length = length;
this.breadth = breadth;
}

public void area()
{
double areaRect = length*breadth;
System.out.println("The area of Rectangle is "+areaRect);

}
public void perimeter()
{
double perimeterRect = (2*(length+breadth) );
System.out.println("The perimeter of Rectangle is "+perimeterRect);

}

}
class InterfaceDemo
{
public static void main(String args[])
{
Rectangle r1 = new Rectangle(10,5);
Circle c1 = new Circle(5);


r1.area();
r1.perimeter();

c1.area();
c1.perimeter();
}
}


