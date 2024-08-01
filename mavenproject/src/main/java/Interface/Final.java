package Interface;

public class Final implements New2{

	public static void main(String[] args) {
		Final obj=new Final();
		obj.display();
		obj.display1();
		
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(a+b+c);
	}

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println(a+c);
		
	}

}
