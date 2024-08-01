package constructor;

public class Parameter {
public  Parameter(String a,char b)	{
	System.out.println(a);
	System.out.println(b);
}
public Parameter(float x,float y) {
	float c=x+y;
	System.out.println(c);
}
public static void main(String args[]) {
	Parameter ob=new Parameter("hi",'G');
	Parameter m=new Parameter(5.5f,10.f);
	
}
	

}
