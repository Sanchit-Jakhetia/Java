import java.util.*;
class BitSetExample {
	public static void main(String arg[]) {
		BitSet bs1=new BitSet();
		BitSet bs2=new BitSet(8);
		
		bs1.set(0);
		bs1.set(1);
		bs1.set(2);
		bs1.set(4);
		
		bs2.set(4);
		bs2.set(6);
		bs2.set(5);
		bs2.set(1);
		bs2.set(2);
		bs2.set(3);
		
		System.out.println("bs1 : "+bs1);
		System.out.println("bs2 : "+bs2);
	}
}