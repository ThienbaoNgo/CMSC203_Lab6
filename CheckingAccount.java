
public class CheckingAccount extends BankAccount{
private double FEE = 0.15;

	public CheckingAccount(String name, double amount){
		super(name, amount);
		
		this.setAccountNumber(this.getAccountNumber()+"-10");
	}
	@Override
	public boolean withdraw(double amount){
		
		
		return super.withdraw(amount + FEE);
		
	}
}
