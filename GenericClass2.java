class GC <T> {
T object;
void addElement(T object) {
this.object = object;
}
T get() {
return object;
}
}
class GenericClass2
{
	public static void main(String args[]) {
		GC <Integer> i = new GC<Integer>();
		GC <String> s = new GC<String>();

		i.addElement(6);
		s.addElement("Adnan");
		System.out.println(i.get());
		System.out.println(s.get());
	}
}