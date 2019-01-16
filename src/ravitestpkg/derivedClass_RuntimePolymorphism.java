package ravitestpkg;

public class derivedClass_RuntimePolymorphism extends baseClass2
{	 
	derivedClass_RuntimePolymorphism() 
	{
		System.out.println("In the derived class...");
	}   

	public void display() 
	{
		System.out.println("In the derived class display()");
	}   

	public static void main (String args[])
	{
	//	baseClass2 d1 = new derivedClass_RuntimePolymorphism();
		//baseClass2 d1 = new baseClass2();
		//derivedClass_RuntimePolymorphism d1 = new derivedClass_RuntimePolymorphism();
		derivedClass_RuntimePolymorphism d1 = (derivedClass_RuntimePolymorphism) new baseClass2();
		
		d1.display();
	}

}

