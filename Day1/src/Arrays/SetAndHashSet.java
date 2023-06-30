package Arrays;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetAndHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set <String> names = new HashSet<>();
		
		names.add("Remo");
		names.add("Juli");
		names.add("Rahu");
		names.add("Anne");

		
		names.remove("Remo");
		
		System.out.println(names);

		System.out.println(names.size());
		
		System.out.println(names.contains("Rahu"));
		
		for(String name: names) {
			System.out.println(name);

		}
		
		System.out.println("Alternative");
		names.forEach(System.out::println);
		
		System.out.println("Iterator");

		Iterator<String> namesIterator = names.iterator();
		while (namesIterator.hasNext()) {
			System.out.println(namesIterator.next());
		}

	}

}
