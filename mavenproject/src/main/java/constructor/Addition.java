package constructor;

public class Addition {
int a;	
int sum;
int b;
int avg;
public void display(int a,int b) {
	sum=a+b;
System.out.println(sum);	
}
public void avg() {
	avg=sum/2;
	System.out.println(avg);
}
public static void main(Parameter args[]) {
	
	Addition t=new Addition();
	t.display(20, 60);
	t.avg();
	
}


}
