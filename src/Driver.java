import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public abstract class Driver {
	public static void main (String[] args) {
	
	ArrayList<String> phrases = new ArrayList<>();
	phrases.add("Dr. J ");
	phrases.add("eats at ");
	phrases.add("Pub W.");
	phrases.add("Dr. J ");
	phrases.add("likes to eat ");
	phrases.add("seafood.");
	HashSet<String> foodHabits = new HashSet<>();
	boolean returnVal = true;
	int i = 0;
	while (returnVal) {
		returnVal = foodHabits.add(phrases.get(i));
		++i;
	}
	System.out.println(foodHabits);
	System.out.println("Should ");
	HashMap<String, Integer> names = new HashMap<>();
	names.put("Aiden", 3);
	names.put("Rafal", 1);
	names.put("Anindya", 1);
	names.put("Willow", 3);
	names.put("James", 2);
	TreeMap<String, Integer> treeNames = new TreeMap<>();
	treeNames.put("Rafal", 1);
	treeNames.put("James", 2);
	treeNames.put("Aiden", 3);
	treeNames.put("Willow", 3);
	treeNames.put("Anindya", 1);
	System.out.println(names);
	System.out.println(treeNames);
	System.out.println("In the second line, they are sorted alphabetically.");
	System.out.println("\nTo guarantee proper order of key value pairs, one would want to use a TreeMap.");
	}
}
