class StringBuffer1 {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("Java");
        System.out.println(sb);
        StringBuffer sb1 = new StringBuffer("Hello ");
        sb1.insert(1, "Java");
        System.out.println(sb1);
        StringBuffer sb2 = new StringBuffer("Hello");
        sb2.delete(1, 3);
        System.out.println(sb2);
    }
}