package constructor;

public class Marks {
 int bonus=50;
 static int bonussal;
 static int febinsurance=5000;
public static void student(String s,int age,int firstsemmark,char c)
{
	int to=firstsemmark+bonus;
	System.out.println(s);
	System.out.println(age);
	System.out.println(firstsemmark);
	System.out.println(c);
	System.out.println(to);
	
	
	
}
public static void employees(String n,int id,int jansal) {
	int to=jansal+bonussal;
	System.out.println(n);
	System.out.println(id);
	System.out.println(jansal);
	System.out.println(to);

	
	
}
public Marks(String name,int jan) {
	int to=jan+febinsurance;
	
	System.out.println(name);
	System.out.println(jan);
	System.out.println(to);
	
}
public static void main (String args[]) {
	Marks d=new Marks("alto",5000);
	d.student("Salma", 23, 50, 'c');
	d.employees("fousia",2,5000);
	
	
	
	
}

}
