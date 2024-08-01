package sampleproject;

public class MethodOver {
public static void add(int a,int b) {
 System.out.println(a+b);
 
}
public static void add(int a,float b) {
System.out.println(a-b);

}
public static float add(float a,float b){
	float c=a+b;
	return c;
	
	
}


 public static void main(String args[]){
	 MethodOver.add(10,20);
	 MethodOver.add(10,5.5f);
	 float x=MethodOver.add(5.5f, 6.6f);
	 System.out.println(x);
	 
 }
	
	
}


