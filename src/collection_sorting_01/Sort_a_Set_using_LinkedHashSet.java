package collection_sorting_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Sort_a_Set_using_LinkedHashSet {

	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<Integer>();
		set.add(15);
		set.add(11);
		set.add(9);
		set.add(18);
		
		System.out.println("Un-sorted set: "+ set);
		
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
		System.out.println("Sorted list: "+ list);
		
		set = new LinkedHashSet<Integer>(list);
		
		System.out.println("Sorted set: " + set);
	}

}
