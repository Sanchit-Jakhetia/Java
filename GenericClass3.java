class KeyValue<K, V> {

   private K key;
   private V value;

   public KeyValue(K key, V value) {
       this.key = key;
       this.value = value;
   }

   public K getKey() {
       return key;
   }

   public void setKey(K key) {
       this.key = key;
   }

   public V getValue() {
       return value;
   }

   public void setValue(V value) {
       this.value = value;
   }
}

 class GenericClass3 {

	public static void main(String[] args) {

		// Create KeyValue object.
		// Integer: Phone Number (K = Double)
		// String: Name of User (V = String)
		KeyValue<Integer, String> entry = new KeyValue<Integer, String>( 789456, "Tanishq");

		
		Integer eid = entry.getKey();
	
		String name = entry.getValue();

		System.out.println("The Employee id is" + eid+ " / name = " + name);
	}

}