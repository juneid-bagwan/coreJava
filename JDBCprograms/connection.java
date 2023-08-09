package JDBCprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connection {
	public static void main(String[] args) {
        Connection conn; 
        try {
            String url = "jdbc:mysql://localhost:3306/sarkariemp";
            String user = "root";
            String password = "root";
            String sql="select * from emp;";
            conn = DriverManager.getConnection(url, user, password);
            Statement st=conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            System.out.println("name\tid\tage");
                    while(rs.next()) 
                    { 
                        String name = rs.getString("name");
                        String id = rs.getString("id");
                        String age = rs.getString("age");
                        System.out.println(name+"\t"+id+"\t"+age);
                    }
            if (conn != null) {
                System.out.println("Connected to the database test1");
            }
        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe username/password is invalid");
            ex.printStackTrace();
        }
    }
}
