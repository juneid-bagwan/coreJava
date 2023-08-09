package JDBCprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class callableDemo {

	public static void main(String[] args) throws SQLException, IOException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sarkariemp", "root", "root");
		CallableStatement stm = (CallableStatement) con.prepareCall("{call insertR(?,?,?)}");
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter id name and age");
		int id1=Integer.parseInt(b.readLine());
		String name1=b.readLine();
		int age1=Integer.parseInt(b.readLine());
		stm.setInt(1, id1);
		stm.setString(2, name1);
		stm.setInt(3, age1);
		stm.execute();
		
		
		String sql = "select * from emp;";
		 Statement st=con.createStatement();
         ResultSet rs = st.executeQuery(sql);
         System.out.println("name\tid\tage\teligibilty");
                 while(rs.next()) 
                 { 
                	 
                     String name =rs.getString("name");
                     String id = rs.getString("id");
                     int age =Integer.parseInt(rs.getString("age")) ;
                     if(age<18) {
                     System.out.println(name+"\t"+id+"\t"+age+"\tnot eligible for voting");
                	 }
                 }
		System.out.println("success....");
	}

}
