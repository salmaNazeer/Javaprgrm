package polymorphism;

public class This {
int a;
int b;
int sum;
public This(int a,int b) {
this();
this.a=a;
this.b=b;
this.display();

}
public This() {
	System.out.println("salma");
	
}
public void display() {
	sum=a+b;
System.out.println(sum);
	
}
public static void main( String args[]) {
	This obj=new This(10,20);
	//obj.display();
	
}
}
