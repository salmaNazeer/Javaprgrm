package String;

public class Class1{

public static void main (String args[]) {
	String s1="hello";
	String s2="hello";
	String s3="HELLO";
	//s.concat("world");
	s3=s1.concat("world");
	char ch=s1.charAt(3);
	String name="what is your name";
	System.out.println(s1);
	System.out.println(ch);
	System.out.println(name.contains("what is"));
	System.out.println(name.endsWith("e"));
	System.out.println(s1.equals(s2));
}
}
