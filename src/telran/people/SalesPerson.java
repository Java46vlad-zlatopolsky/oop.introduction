package telran.people;

public class SalesPerson extends Employee {
	private int sales;
	private int percentPay;

	public SalesPerson(long id, int yearBirth, String email, int basicSalary, int sales, int percentPay) {//income from sales + %
		super(id, yearBirth, email, basicSalary);
		setSales(sales);
		setPercentPay(percentPay);
		
	}
		
	public void setSales (int sales) {
		this.sales = sales;
	}
	
	public void setPercentPay (int percentPay) {
		this.percentPay = percentPay;
	}
	
	@Override
	public int computePay(int basicSalary, int parameter1, int parameter2) {
		int pay = basicSalary + ((sales * percentPay )/100);
		return pay;
	}
	
}
