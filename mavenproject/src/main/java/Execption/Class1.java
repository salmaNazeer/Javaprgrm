package Execption;

public class Class1 {
	public void display() {
		int a=10;
		int b=0;
		int c;
		try {
			c=a/b;
			System.out.println(c);
		}
	catch(ArithmeticException e) {
		System.out.println("Exception handled"+e);
		
	}
		
	}

	public static void main(String[] args) {
		Class1 obj=new Class1();
		obj.display();
		// TODO Auto-generated method stub

	}

}
