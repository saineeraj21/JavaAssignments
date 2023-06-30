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
		
		
		System.out.println("Now using for each loop");
  
		
		for(Student stud : Students) {
			System.out.println(stud.rollno+" : "+stud.name+" : "+stud.marks);

		}
		
		int nums[]=new int[4];
		nums[0]=100;
		nums[1]=75;
		nums[2]=50;
		nums[3]=25;
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
		System.out.println("Now using for each loop");
		
		for(int n:nums) {
			System.out.println(n);

		}


		

	}

}
