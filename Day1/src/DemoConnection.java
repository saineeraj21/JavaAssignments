
import java.sql.*;

/* Java Database Connectivity
 * 1. Import package---> java.sql
 * 2. Load and Register the drivers---> 4 drivers/ com.mysql.jdbc.Driver
 * 3. Establish Connection
 * 4. Create statement
 * 5. Execute query
 * 6. Process result
 * 7. Close statement and connection
 * 
 */
public class DemoConnection {

	public static void main(String[] args) throws Exception
	
	{
			String url = "jdbc:mysql://localhost:3306/students";
			String uname = "root";
			String pass = "Qwerty@7890";
			int id = 7;
			String name ="Harish";
			String query = ("insert into friends values (?,?)");

			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,pass);
			PreparedStatement st = con.prepareStatement(query); //Prepared Statement
			st.setInt(1, id);
			st.setString(2,name);
			
			int count = st.executeUpdate(); //DDL,DML,DQL,TCL
			
			System.out.println(count + " rows afftected");

			
			/*while(rs.next())
			{
				String UserData = rs.getInt(1)+ " " + rs.getString(2);
			
				System.out.println(UserData);
			}*/
			
			st.close();
			con.close();
			
	}
	
}
