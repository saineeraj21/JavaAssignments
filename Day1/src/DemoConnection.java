
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
			
			String query = "select * from friends";

			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,pass);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next())
			{
				String UserData = rs.getInt(1)+ " " + rs.getString(2);
			
				System.out.println(UserData);
			}
			
			st.close();
			con.close();
			
	}
	
}
