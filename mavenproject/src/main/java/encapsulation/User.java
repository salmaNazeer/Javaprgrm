package encapsulation;

public class User {
private int pin;
public void setter(int pin) {
this.pin=pin;	
}
public void getter() {
if(pin==1001) {
	System.out.println("correct pin");	
}
else if(pin==1234) {
	System.out.println("correct pin");	
}
else if(pin==1212) {
	System.out.println("correct pin");	
}
else
{
	System.out.println("wrong pin number");
}	
}

}
