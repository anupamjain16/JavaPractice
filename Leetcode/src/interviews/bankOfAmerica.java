/**
 * 
 */
package interviews;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author FFHN6469
 *
 *sort the map values , PRINT END OF MAP , INHERITANCE IN HIBRNATE
 */
public class bankOfAmerica {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();

		map.put(4, "B");
		map.put(2, "C");
		map.put(1, "D");
		map.put(3, "A");
		

		HashMap<Integer, String> Soetedmap = sortbyValue(map);
		
		
		
		  for (Entry<Integer, String> en : Soetedmap.entrySet()) {
	            System.out.println("Key = " + en.getKey() +
	                          ", Value = " + en.getValue());
	        }

	}

	private static HashMap<Integer, String> sortbyValue(HashMap<Integer, String> map) {

		List<Map.Entry<Integer, String>> list = new LinkedList<>(map.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {

				return o2.getKey().compareTo(o2.getKey());
			}
		});

		

		HashMap<Integer, String> temp = new HashMap<>();

		for (Entry<Integer, String> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;
	}

}
