import java.util.*;
import java.util.Map.Entry;
class MapExample {
	public static void main(String arg[]) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(1, "Cricket");
		map.put(2, "Hockey");
		map.put(3, "Batminton");
		map.put(4, "Kabaddi");
		map.put(5, "Volleyball");
		
		for(Iterator<Entry<Integer,String>> itr = map.entrySet().iterator(); itr.hasNext();) {
			Entry<Integer, String> m = itr.next();
			System.out.println(m.getKey() +" "+m.getValue());
		}
	}
}