package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<>();//Three types: HashMap(random order),LinkedHashMap(assigned order),TreeMap(sorted order)
		Map<Integer,String> map1 = new LinkedHashMap<>();
		Map<Integer,String> map2 = new TreeMap<>();
		
		map.put(1, "Rome");
		map.put(4, "Spain");
		map.put(6, "Sweden");
		map.put(3, "France");
		System.out.println(map);

		//Map inbuilt function
		map.forEach((key,value)-> System.out.println("KEY: "+ key+", Value: "+ value));
		
		//Converting into SET
		Set<Map.Entry<Integer,String>> set = map.entrySet();
		
		//Printing After converting into SET
		System.out.println(set);
		
		//Iterating map set using For loop
		
		for(Map.Entry<Integer,String> ab:set) {
			System.out.println(ab.getKey()+ab.getValue());

		}
		


	}

}
