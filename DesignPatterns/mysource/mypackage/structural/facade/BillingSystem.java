package mypackage.structural.facade;

public class BillingSystem {
	
	public Bill createBill(int amount){
		return new Bill(amount);
	}

}
