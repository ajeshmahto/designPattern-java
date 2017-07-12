package mypackage.structural.facade;

public class FinancialFacade {
	
	private BillingSystem billingSystem;
	private InvoiceSystem invoiceSystem;
	
	public void createInvoice(int amount){
		Bill bill = billingSystem.createBill(amount);
		invoiceSystem.createInvoiceSystem(bill);
		
	}

	public BillingSystem getBillingSystem() {
		return billingSystem;
	}

	public void setBillingSystem(BillingSystem billingSystem) {
		this.billingSystem = billingSystem;
	}

	public InvoiceSystem getInvoiceSystem() {
		return invoiceSystem;
	}

	public void setInvoiceSystem(InvoiceSystem invoiceSystem) {
		this.invoiceSystem = invoiceSystem;
	}

}
