package constructor;

public class Test {
	int a=10;
	int b=10;
	int c;

public Test() {	
	 c=a+b;
	System.out.println(c);
}
public static void main (Parameter args[]) {
	Test t=new Test();
}

}
