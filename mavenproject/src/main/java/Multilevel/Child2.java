package Multilevel;

public class Child2 extends Child{
public void display3() {
	System.out.println("kavalyoor");
}
public static void main (String args[]) {
	Child2 obj=new Child2();
	obj.display();
	obj.display2();
	obj.display3();
}
}
