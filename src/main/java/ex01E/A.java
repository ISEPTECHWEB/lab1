package ex01E;
import org.apache.log4j.*;

class A
{
	protected static Logger log = Logger.getLogger(A.class);

	int x=1;

	void m()
	{
		System.out.println("Je suis dans la méthode m d'une instance de A");
	}
}

class B extends A
{
	int x=2;

	void m()
	{
		System.out.println("Je suis dans la méthode m d'une instance de B");
	}
}

class C extends B
{
	int x=3 ,a;

	void m()
	{
		System.out.println("Je suis dans la méthode m d'une instance de C");
	}

	void test()
	{
		a = super.x; // a=xB
		log.debug(a);
		// a = super.super.x; // super.super is impossible, because we shouldn't be able to bypass the parent class's behaviour

		a = ((B)this).x; // a=xB
		log.debug(a);

		a = ((A)this).x; // a=xA
		log.debug(a);

		super.m(); // print B.m()

		// super.super.m(); // super.super is impossible

		((B)this).m(); // (1) print C.m()
	}
}

// Questions:
// Which m() method is called in (1) ? It's the method C.
// It is the expected result? No, we expected method B.
// Which OOP implementation type fits to that result? It's java overridding. To call the parent class method we need to use super not this.
