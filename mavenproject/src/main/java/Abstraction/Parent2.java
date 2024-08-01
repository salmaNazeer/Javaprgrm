package Abstraction;

public class Parent2 extends Parent {

	public static void main(String[] args) {
		Parent2 obj=new Parent2();
		obj.display1(10, 20);
		obj.display();
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		int a=30;
		int b=10;
	 System.out.println(a-b);
		// TODO Auto-generated method stub
		
	}

}
