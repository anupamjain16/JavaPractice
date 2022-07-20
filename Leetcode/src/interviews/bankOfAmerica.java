/**
 * 
 */
package interviews;

import java.util.HashMap;
import java.util.Map;

/**
 * @author FFHN6469
 *
 */
public class bankOfAmerica {

	
	public static void main(String[] args) {
		
		 HashMap<Integer, String> map = new HashMap<>();
		 
		 
		 map.put(2, "B");
		 map.put(1, "A");
		 map.put(3, "C");
		 map.put(4, "D");
		 
 
		 //map.Stream().sort(Comparing(e.getvalue,e.getKey)).reverse().Collect(Collectros.ToMap);

	   int size = map.size();
	   
	   System.out.println(map.get(size));
	  
		 
	}
	
}
