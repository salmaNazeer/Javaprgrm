package sampleproject;

public class Sample2 {
public static void area(float x){
	System.out.println("the area of the square is"+Math.pow(x, 2));
	
}
public static void area(float x,float y){
	System.out.println("the area of the rectangle is"+x*y);
}
public static void area(double x)
{
	double z=3.14*x*x;
	System.out.println("the area of the circle is"+z);
	

}
public static void main(String args[]) {
	Sample2.area(5);
	Sample2.area(11,12);
	Sample2.area(2.5);
}
	

}
