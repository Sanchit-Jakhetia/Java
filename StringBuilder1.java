class StringBuilder1 {

  public static void main(String[] args) {
      
    StringBuilder sb1 = new StringBuilder();
    System.out.println("Initial Capacity of sb1: " + sb1.capacity());

    StringBuilder sb2 = new StringBuilder(10);
    System.out.println("Initial Capacity of sb2: " + sb2.capacity());
    
    CharSequence seq = "Hello";
    StringBuilder sb3 = new StringBuilder(seq);
    System.out.println("sb3: " + sb3);

    StringBuilder sb4 = new StringBuilder("How are You");
    System.out.println("sb4: " + sb4);
    System.out.println(sb4.capacity());
  }
}