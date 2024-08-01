package sampleproject;

public class Addition {
static int a;
static int b;
static int c;
static int avg;
public static void sum(int a,int b) {
	c=a+b;
	System.out.println(c);
}
public static int avg() {
	
	avg=c/2;
	return avg;
	 
	
}

public static void main (String args[]) {
	Addition.sum(20,30);
    int x=Addition.avg();
    System.out.println(x);
}}
	
	
	
	
	

	



