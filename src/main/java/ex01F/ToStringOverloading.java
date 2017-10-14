package ex01F;

public class ToStringOverloading
{
	public static void main(String[] args)
	{
		Circle c1 = new Circle(0,0, 5);
		Circle c2 = new Circle(0,0, 3);
		System.out.println("C1 => " + c1);
	}
}

// What shows up? The output is "C1 => Circle with center (0,0) and radius 5 (Perimter is 31,42)".
// Why is the method toString() called without being named? All classes in Java inherit from the Object class, directly or indirectly.
// The Object class has some basic methods like clone(), toString(), equals(),.. etc. We can override toString() method in our class to
// print another output. For example, in the following code, toString() is overridden to print "Circle with center (%d,%d) and radius %d (Perimter is %,.2f)".
// If you rename the method toString(), what happens? The output is now "C1 => ex01F.Circle@7eba6aa6".
// The output is, class name, then ‘at’ sign, and at the end hashCode of object because the default toString() method in Object prints “class name @ hash code”.
