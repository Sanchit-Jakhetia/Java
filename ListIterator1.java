import java.util.*;
public class ListIterator1 {
	public static void main(String arg[]) {
		List<String> names =new LinkedList<>();
		names.add("India");
		names.add("China");
		names.add("Italy");
		names.add("Korea");
		names.add("France");
		names.add("Germany");
		
		ListIterator<String> itr = names.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(String ele:names){
			System.out.println(ele);
		}
	}
}