import java.util.Date;

class Account{
	
	private int id;
	private double balance, annualInterestRate;
	private Date dateCreated;
	double MonthlyInterestRate;
	double MonthlyInterest;
	double withdraw = 0;
	double deposit = 0;
	
	Account(){
		
		id = 0;
		balance = 0;
		annualInterestRate = 0;
	}
	
	Account( int id, double balance ){
		
		this.id = id;
		this.balance = balance;
		
	}
	
	public double GetBalance() {
		return balance;
	}
	
	public double GetAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public int GetId() {
		return id;
	}
	
	public String GetdateCreated() {
		dateCreated = new Date();
		return dateCreated.toString();
	}
	
	public void setBalance( double balance ) {
		this.balance = balance;
	}
	
	public void SetAnnualInterestRate( double annualInterestRate ) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public void SetId( int id ) {
		this.id = id;
	}
	
	double getMonthlyInterestRate( double annualInterestRate ) {
		MonthlyInterestRate = ((balance*((annualInterestRate / 100)/12))*100);
		return MonthlyInterestRate;
	}
	
	double getMonthlyInterest( double annualInterestRate ) {
		MonthlyInterest = (balance*((annualInterestRate/100) / 12));
		return MonthlyInterest;
	}
	
	void withdraw( double withdraw ) {
		this.withdraw = withdraw;
		balance -= withdraw;
	}
	
	void deposit( double deposit ) {
		this.deposit = deposit;
		balance += deposit; 
	}
	
}
public class A7Q4 {

	public static void main(String[] args) {
		
		Account ac = new Account( 1122, 20000 );
		ac.SetAnnualInterestRate( 4.5 );
		ac.withdraw( 2500 );
		ac.deposit( 3000 );
		System.out.println("Date: "+ac.GetdateCreated());
		System.out.println("Balance: "+ac.GetBalance());
		System.out.println("MonthlyInterest: "+ac.getMonthlyInterest(ac.GetAnnualInterestRate()));
		
	}

}
//class Account
//{
//private int id;
//private double balance;
//private static double annualInterestRate;
//private Date dateCreated;
//Account()
//{
//id = 0;
//balance = 0;
//annualInterestRate = 0;
//dateCreated = new Date();
//}
//Account(int newId, double newBalance)
//{
//id = newId;
//balance = newBalance;
//dateCreated = new Date();
//}
//public void setId(int newId)
//{
//id = newId;
//}
//public void setBalance(double newBalance)
//{
//balance = newBalance;
//}
//public void setAnnualInterestRate(double newAnnualInterestRate)
//{
//annualInterestRate = newAnnualInterestRate;
//}
//public int getId()
//{
//return id;
//}
//public double getBalance()
//{
//return balance;
//}
//public double getAnnualInterestRate()
//{
//return annualInterestRate;
//}
//public String getDateCreated()
//{
//return dateCreated.toString();
//}
//public double getMonthlyInterestRate()
//{
//return annualInterestRate / 12;
//}
//public double getMonthlyInterest()
//{
//return balance * (getMonthlyInterestRate() / 100);
//}
//public void withdraw(double amount)
//{
//balance -= amount;
//}
//public void deposit(double amount)
//{
//balance += amount;
//}
//}
//public class A7Q4
//{
//public static void main(String[] args)
//{
//Account account = new Account(1122, 20000);
//account.setAnnualInterestRate(4.5);
//account.withdraw(2500);
//account.deposit(3000);
//System.out.println("\n Account Statement");
//System.out.println("------------------------------------------");
//System.out.println("Account ID: " + account.getId());
//System.out.println("Date created: " + account.getDateCreated());
//System.out.printf("Balance: $%.2f\n", account.getBalance());
//System.out.printf("Monthly interest: $%.2f\n", account.getMonthlyInterest());
//}
//}
