package ravitestpkg;

public class InterfaceTest implements Interfacet2 {

	 public void deposit(float amt){
		  System.out.println("Depositing amt of Rs: "+amt);
		 }
		 public void withdraw(float amt){
		  System.out.println("Withdrawing amt of Rs: "+amt);
		 }

	public static void main(String[] args) {
		 
		InterfaceTest sbi = new InterfaceTest();
		  System.out.println(sbi.n);
		  System.out.println(Interfacet2.n);//static
		  //sbi.n=20;//CE
		  sbi.deposit(1000);
		  sbi.withdraw(500.0f);

		  
	}

}

 interface Interfacet2 {
	
	 int n=10;
	 void withdraw(float amt);
	 void deposit(float amt);

}
