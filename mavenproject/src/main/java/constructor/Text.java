package constructor;

public class Text{ 
String name1;;
int id1;
String place1;
static String d="TCS";
public Text(int id,String name,String place) {
	name1=name;
	place1=place;
	id1=id;
}
public void display() {
	System.out.println(id1);
	System.out.println(name1);
	System.out.println(place1);
	System.out.println(d);
	
}
public static void main(String args[]) {
	Text ob=new Text(1,"salma","attingal");
	ob.display();
	Text d=new Text(2,"devika","tvm");
	d.display();
	Text y=new Text(3,"fousia","Ekm");
	y.display();
	Text s=new Text(4,"gopika","ksd");
	s.display();
	Text q=new Text(5,"gowri","kollam");
	q.display();
	
	
	
}


}
