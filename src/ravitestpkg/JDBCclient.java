package ravitestpkg;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCclient {
	static CallableStatement cStmt;

	public static void main(String[] args) {
		
		Student  s1 =new Student(4,"aaradhya4","test@gmail.com",2,"india");
		
		try {
			
		//load the driver 
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver loaded");
		
		//create a connecion
		String user="root";
		String pass="aaradhya";
		String url = "jdbc:mysql://localhost/ravi";
		Connection con = DriverManager.getConnection(url, user, pass);
		System.out.println("connection is created ");
		
		//exeucte SQL statement 
//		String sql = "insert into ravitb values(1,'aaradhya2','test@gmail.com',2,'"+s1.address+"')";
//				        	
//
//		Statement stmt = con.createStatement();
//		int i = stmt.executeUpdate(sql);
//		
//		System.out.println(i);
		
		
				
			//	String sql = "{ call addStudent(?,?,?,?,?) }";
		String sql = "{ call addStudent() }";
				cStmt = con.prepareCall(sql);
				
//				cStmt.setInt(1, s1.roll);
//				cStmt.setString(2, s1.name);
//				cStmt.setString(3, s1.email);
//				cStmt.setInt(4, s1.age);
//				cStmt.setString(5, s1.address);
//				
				cStmt.execute();
				
				System.out.println("--Procedure Executed--");
				
		
		
		//close connection
		con.close();
		cStmt.close();
				
		}
		catch(Exception e)
		{
			
		System.out.println("Some exception:"+e);
		
		}
		
	}

}
