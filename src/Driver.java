import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Spliterator;

public abstract class Driver implements Set<String>, List<String>, Comparable<String>{
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
		foodHabits.add(phrases.get(i));
		++i;
	}
	System.out.println(foodHabits);
	HashMap<String, Integer> names = new HashMap<>();
	names.put("Rafal", 1);
	names.put("James", 2);
	names.put("Aiden", 3);
	
	}

	@Override
	public Spliterator<String> spliterator() {
		// TODO Auto-generated method stub
		return Set.super.spliterator();
	}
}
