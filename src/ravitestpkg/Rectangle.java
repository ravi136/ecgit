package ravitestpkg;

class Rectangle extends Shape{
	 int length, breadth;
	 Rectangle(String color, int len, int bre){
	  super(color);
	  this.length=len;
	  this.breadth=bre;
	 }

	 void getArea() {
		   System.out.println("Area = "+(length*breadth)); 
		 }
}