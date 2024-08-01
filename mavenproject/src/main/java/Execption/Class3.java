package Execption;

public class Class3 {
	int age=15;
	public void voting() throws VoteException {
		if(age>=18) {
			System.out.println("eligible for voteing");
		}
		else {
			throw new VoteException("not eligible");
		}
		
	}
	

	public static void main(String[] args) throws VoteException {
		Class3 obj=new Class3();
		obj.voting();
		// TODO Auto-generated method stub

	}

}
