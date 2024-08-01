package Acessmodifier;

public class Acess {
	public void display() {
		System.out.println("hello");
	}
private void display1()	{
	System.out.println("hi salma");	
}
protected void display2() {
	System.out.println("chmm");
	
}
void display3() {
	System.out.println("java");
}
public static void main(String args[]) {
	Acess d=new Acess();
	d.display();
	d.display1();
	d.display2();
	d.display3();
}


}
