abstract class Shape
{
	void noofSides()
	{}
}
class Trapezoid extends Shape
{
	void noofSides()
	{
	System.out.println("No of sides in Trapezoid are "+4);	
	}
}
class Triangle extends Shape
{
	void noofSides()
	{
	System.out.println("No of sides in Triangle are "+3);	
	}}
class Hexagon extends Shape
{
	void noofSides()
	{
	System.out.println("No of sides in Heaxagon are "+6);	
	}
}
public class Shapes {
public static void main(String[] args)
{
	Shape s=new Triangle();
	Shape s1=new Trapezoid();
	Shape s2=new Hexagon();
	s.noofSides();
	s1.noofSides();
	s2.noofSides();
}
}
