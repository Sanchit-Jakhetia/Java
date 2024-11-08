import java.util.*;
class SetExample {
	public static void main(String arg[]) {
		int count[]={21,23,43,53,22,65};
		Set<Integer> set=new HashSet<Integer>();
		try {
			for(int i=0;i<=5;i++) {
				set.add(count[i]);
			}
			System.out.println(set);
			TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);
			System.out.println("The sorted list is:");
			System.out.println(sortedSet);
			
			System.out.println("First element is:"+(Integer)sortedSet.first());
			
			System.out.println("Last element is:"+(Integer)sortedSet.last());
		} catch (Exception e) {
		}
	}
}