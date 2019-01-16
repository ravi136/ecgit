package ravitestpkg;

public class StaticTest {
	 //int md1 = method();
	 static int md2 =100;
	 static int md1 = method();
	 static int method() {
	  System.out.println("Inside method");
	  return 25;
	 }
	 static {
	  System.out.println("application designed & developed by ");
	  System.out.println("static block-1");
	 }
	 public static void main(String[] args) {
	  System.out.println("MAIN METHOD");
	  StaticTest obj = new StaticTest();
	  System.out.println(md1);
	  
	 }
	 static {
	  System.out.println("team @ edureka ");
	  System.out.println("static block-2");
	 } 
	}
