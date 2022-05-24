package week4day1;

public class Bank extends Sbi implements Cibil,Pnb{

	public void minimumLoanAmount() {
		System.out.println("Maximum amount :100000 INR");
		
	}

	public void minimumBalance() {
		System.out.println("Min Bal :50000 INR");
		
	}

	public void cibilScore() {
		System.out.println("Cibil SCore : 1000");
		
	}

	@Override
	void bankBalance() {
		System.out.println("Bank Bal :100000 INR");
		
	}

	@Override
	void maximumLoanAmount() {
		System.out.println("Max Loan Amt :15000000 INR");
		
	}

	public static void main(String[] args) {
		Bank obj = new Bank();
		obj.cibilScore();
		obj.bankBalance();
		obj.maximumLoanAmount();
		obj.minimumBalance();
		obj.minimumLoanAmount();
		
				
	}

}
