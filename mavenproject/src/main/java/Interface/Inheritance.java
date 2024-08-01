package Interface;

public class Inheritance implements New,New2 {

	public static void main(String[] args) {
		Inheritance obj=new Inheritance();
		obj.display1();
		obj.display();
		// TODO Auto-generated method stub

	}

	@Override
	public void display1() {
		System.out.println(a+b+c);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		System.out.println(a-c);
		// TODO Auto-generated method stub
		
	}

}
