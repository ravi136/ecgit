package ravitestpkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class List {

	int sno;
	String sname;
	
	public String toString() {
		return sno+"-"+sname;
		
		
	}
	public static void main(String[] args) {
	
		
		ArrayList  l1 = new ArrayList();
		ArrayList<String> l2 = new ArrayList();
		ArrayList<List> l3 = new ArrayList();
		
		
		List l0 = new List();
		l0.sno=10;
		l0.sname="ravi";
		
		List l4 = new List();
		
		l4.sno=11;
		l4.sname="Aaradhya";
		
		
	//	System.out.println(l0); 
		//System.out.println(l4);
				
		l3.add(l0);
		l3.add(l4);
		
        List x = l3.get(1);
     //   System.out.println(x);
		
		for(int i=0; i< l3.size();i++   ) {
			
			List y = l3.get(i);
			//System.out.println(y);
			
		}
        
		//another way of iterating in Java  using Itertor 
		Iterator<List> itr = l3.iterator();
		while (itr.hasNext()) {
			List classtype = itr.next();
		//	System.out.println(classtype);
		
		}
		//another way of iterating in Java  using enumeration  
		
		Enumeration<List> enu = Collections.enumeration(l3);
		while(enu.hasMoreElements()){
			List classtype = enu.nextElement();
			System.out.println(classtype);
			
		}
		
		
		
		
		
	}

}
