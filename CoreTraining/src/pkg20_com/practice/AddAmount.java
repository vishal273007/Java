package pkg20_com.practice;

public class AddAmount {
	
	int amount=500;
	
	public AddAmount() {
		System.out.println("Account balance without updating: "+amount);
	}
	
	public AddAmount(int a) {
		System.out.println("Updated account balance is: "+(amount + 200));
	}
	
	public static void main(String [] args) {
		
		AddAmount aobj=new AddAmount();
		new AddAmount(200);
		
	}

}
