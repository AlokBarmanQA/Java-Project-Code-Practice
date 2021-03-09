package collection_sorting_01;

import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

public class Sort_a_Map_by_Key {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(50, "Alex");
		map.put(20, "Charles");
		map.put(60, "Brian");
		map.put(70, "Edwin");
		map.put(120, "George");
		map.put(10, "David");
		
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(map);
		
		System.out.println(treeMap);
		
	}

}
