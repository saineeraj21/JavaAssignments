package Abstraction;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation x = new Calculation();
		
		System.out.println(x.sum(4,5));
		System.out.println(x.sum(4,5,6));
		System.out.println(x.sum((float)4.5,(float)5.6));
		
		ATM atm = new HDFC();
		atm.withdraw();

	}
	

}
