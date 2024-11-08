class GenericClass<T> {
    private T item;
    public void put(T item) {
        this.item = item;
    }
    public T fetch() {
        return item;
    }
}
class GenericClass1 {

    public static void main(String[] args) {
        GenericClass<String> gc1 = new GenericClass<String>();
		GenericClass<Integer> gc2 = new GenericClass<Integer>();
		
		gc1.put("Sanchit");
		gc2.put(19);
		
		System.out.println(gc1.fetch());
		System.out.println(gc2.fetch());
		
		gc1.put("Samrendra");
		gc2.put(22);
		
		System.out.println(gc1.fetch());
		System.out.println(gc2.fetch());
		
		gc1.put("Adnan");
		gc2.put(22);
		
		System.out.println(gc1.fetch());
		System.out.println(gc2.fetch());
    }
}