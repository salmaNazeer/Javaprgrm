package assignment;

public class Onseasonn extends Offseason{
public void discount()	{
	super.discount();
	d=total*40/100f;
	System.out.println("discount:"+discount);
	
}

	public static void main(String[] args) {
		Onseasonn obj=new Onseasonn();
		obj.discount();
		obj.display();
		
		// TODO Auto-generated method stub

	}

}
