import java.sql.*;

public class DAOdemo {

	public static void main(String[] args) 
	{
		StudentDAO dao = new StudentDAO();
		Student s1 = dao.getStudent(3);
		System.out.println(s1.sname);
	}

	
// DAO - Data Access Object
}
class StudentDAO
{
	public Student getStudent(int rollno)
	{
		try {
			String query = "select sname from Attendance where rollno="+rollno;
			Student s = new Student();
			s.rollno=rollno;
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","Qwerty@7890");
			Statement st = con.createStatement();
			ResultSet rs=st.executeQuery(query);
			rs.next();
			String name = rs.getString(1);
			s.sname=name;
			
			return s;
			}catch (Exception ex) {
				System.out.println(ex);
			}
		 	return null;
	}
		
}
class Student
{
	int rollno;
	String sname;
}