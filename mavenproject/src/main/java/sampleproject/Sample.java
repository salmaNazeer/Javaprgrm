package sampleproject;

public class Sample {
static int y;
static int x;

public static void display(int a,int b){
	 x=a;
	 y=b;
}
public static void sum() {
	int s=x+y;
	System.out.println(s);
	
}
public static void sub() {
	int d=x-y;
	System.out.println(d);
}

public static void main(String args[]) {	
	Sample.display(70,50);
	Sample.sum();
	Sample.sub();
}

}
