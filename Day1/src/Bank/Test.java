package Bank;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Customer sample = new Customer();
		sample.setId(21);
		sample.setBalance(4500);
		sample.setLocked(true);
		sample.setName("Techno");
		System.out.println(sample.getId());
		System.out.println(sample.getName());
		System.out.println(sample.getBalance());
		System.out.println(sample.isLocked());
		
		sample.id = 22;
		sample.name = "Mark";
		sample.balance = 2200;
		sample.isLocked = false;
		
		System.out.println(sample.id);
		System.out.println(sample.name);
		System.out.println(sample.balance);
		System.out.println(sample.isLocked);
		*/
		Customer sample = new Customer(1, "Jacob", false, 250);
		System.out.println(sample.id);
		System.out.println(sample.name);
		System.out.println(sample.balance);
		System.out.println(sample.isLocked);
		
	}
 
}
