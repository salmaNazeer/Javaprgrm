package Execption;

public class Class2 {
public void display() {
	int a=5;
	int b=0;
	try {
		int c=a/b;
		System.out.println(c);	
	}
	catch(ArithmeticException e) {
	System.out.println("successfully executed");
		
	}
	finally
	{
		System.out.println("Exception handled");
		
	}}
	public static void main(String args[]){
		Class2 obj=new Class2();
		obj.display();
	}
	
}


