package mypackage.structural.facade;

public class InvoiceSystem {
	
	
	
	public void createInvoiceSystem(Bill bill){
		System.out.println("Invoice of this amount has been created -" +bill.getAmount());
	}

}
