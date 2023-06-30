package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] FriendsArray = new String[3];//Array size once created cant be changed
		//can hold primitives or objects
		
		String[] FriendsArray = {"KOUS","PRAD","MANIK"};
		
		//ArrayList<String> FriendsArrayList = new ArrayList<>(); // ctrl+shif+O to import java.util.arraylist
		//Array list do not have fixed size, grows and shrinks automatically
		// can only hold objects but not primitives(int)
		// but supports wrapper types for primitive
		
		ArrayList<String> FriendsArrayList = new ArrayList<>(Arrays.asList("Kous","Manik","Prad","Srav"));
		
		System.out.println(FriendsArray[1]);
		System.out.println(FriendsArray.length);

		
		System.out.println(FriendsArrayList.get(2)); //method call
		System.out.println(FriendsArrayList.size());
		
		FriendsArrayList.add("Nithish");
		System.out.println(FriendsArrayList.get(4));
		
		FriendsArray[1]="Harsha";
		System.out.println(FriendsArray[1] + ": After Changing");
		
		FriendsArrayList.set(3, "Sandeep");
		System.out.println(FriendsArrayList.get(3)+ ": After Changing");

		//Cant remove elements from array
		
		FriendsArrayList.remove("Sandeep");
		System.out.println(FriendsArrayList.get(3)+ ": After Changing");
		
		
		System.out.println(FriendsArray);

		System.out.println(FriendsArrayList);

		
	}

}
