package mypackage.structural.facade;

public class Client {
	
	
	public static void main(String[] args) {
		FinancialFacade financialFacade = new FinancialFacade();
		BillingSystem billingSystem = new BillingSystem();
		InvoiceSystem invoiceSystem = new InvoiceSystem();
		
		financialFacade.setBillingSystem(billingSystem);
		financialFacade.setInvoiceSystem(invoiceSystem);
		financialFacade.createInvoice(1000);
		
	}

}
