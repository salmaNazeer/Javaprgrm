package multiInheritance;

public class Child2 extends Child1 {
public void display2() {
	System.out.println("kavalyoor");
}
	public static void main(String[] args) {
		Child2 t=new Child2();
		 t.display();
		 t.display1();
		 t.display2();
		// TODO Auto-generated method stub

	}

}
