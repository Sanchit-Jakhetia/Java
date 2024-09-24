class StringBuffCapacity{
	public static void main(String args[]){
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		//System.out.println(sb);		//Default 16
		sb.append("Hello");
		System.out.println(sb.capacity());
		//System.out.println(sb);
		sb.append("java is my favourite language, no it's not");//42
		System.out.println(sb.capacity());
		//System.out.println(sb);
}
}