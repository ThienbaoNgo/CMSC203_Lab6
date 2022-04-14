
public class SavingsAccount extends BankAccount {
private double rate = .025; //Check later to see if correct.
private int savingsNumber = 0;
private String accountNumber;

public SavingsAccount(String name, double amount){
	super(name, amount);
	
	//System.out.println(super.getAccountNumber());
	
	String input = super.getAccountNumber() +  "-" + savingsNumber;
	
	//System.out.println(input);
	
	this.accountNumber = input;
	
	//System.out.println(this.accountNumber);
	//this.setAccountNumber(this.getAccountNumber()+"-10");
}
public SavingsAccount(SavingsAccount oldAccount, double amount){
	
	super(oldAccount, amount);
	
	String replacedString = oldAccount.getAccountNumber();
	
	int concatNumber = oldAccount.savingsNumber + 1;
	
	//System.out.println(replacedString);
	
	
	
	replacedString = replacedString.replace("-"+String.valueOf(oldAccount.savingsNumber), "-"+String.valueOf(concatNumber));
	
	//System.out.println(replacedString);
	
	this.accountNumber = replacedString;
	
}
public void postInterest(){
	
	super.deposit(((this.getBalance() * rate/12) - this.getBalance()) + this.getBalance());
	
}
public String getAccountNumber(){
	return this.accountNumber;
	
}
}
