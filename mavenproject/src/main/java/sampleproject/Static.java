package sampleproject;

public class Static {
public static int sum(int a,int b) {	
int c=a+b;
return c;
}
public static void main(String args[]) {
int a=Static.sum(10,20);
System.out.println(a);

}


}
