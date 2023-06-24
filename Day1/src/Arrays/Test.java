package Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.rollno = 1;
		s1.name = "First name";
		s1.marks = 100;
		
		Student s2 = new Student();
	    s2.rollno =2;
		s2.name = "Second name";
		s2.marks = 75;
		
		Student s3= new Student();
		s3.rollno =3;
		s3.name = "Third name";
		s3.marks = 50;
		
		Student Students[]= new Student[3];
		Students[0]=s1;
		Students[1]=s2;
		Students[2]=s3;
		
		for (int i=0;i<Students.length;i++) {
			System.out.println(Students[i].name+" : "+Students[i].marks);
		}
			

		

	}

}
