import java.util.*;
class CollectionExample {
	public static void main(String arg[]) {
		Collection c;
		c= new ArrayList();
		System.out.println(c.getClass().getName());
		for(int i=1;i<=10;i++) {
			c.add(i+" * "+ i +" = " + i*i);
		}
		Iterator itr=c.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}