package class4;

interface IBankAccount {
	boolean deposit(double amount);

	boolean withdraw(double amount);

	void getBalanceAmount();
}

class SavingsAccount implements IBankAccount {
	private double _balance;
	private double perDayLimit;

	public boolean deposit(double amount) {
		_balance += amount;
		System.out.println("deposit amount" + amount);
		return true;
	}

	public boolean withdraw(double amount) {
		if (_balance < amount) {
			System.out.println("insufficient balance");
			return false;
		}

		else if (perDayLimit + amount > 5000) {
			System.out.println("Failed!!");
			return false;

		}

		else {
			_balance -= amount;
			perDayLimit += amount;
			System.out.println("successfully withdrawn amount:" + amount);
			return true;
		}
	}

	public void getBalanceAmount() {
		System.out.println("Savings account balance: " + _balance);
	}
}

class CurrentAccount implements IBankAccount {
	private double _balance;
	private double perDayLimit;

	public boolean deposit(double amount) {
		_balance += amount;
		System.out.println("deposit amount" + amount);
		return true;
	}

	public boolean withdraw(double amount) {
		if (_balance < amount) {
			System.out.println("insufficient balance");
			return false;
		}

		else {
			_balance -= amount;
			perDayLimit += amount;
			System.out.println("successfully withdrawn amount:" + amount);
			return true;
		}
	}

	public void getBalanceAmount() {
		System.out.println("Savings account balance: " + _balance);
	}
}

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IBankAccount savingsAccount = new SavingsAccount();
		IBankAccount currentAccount = new CurrentAccount();

		savingsAccount.deposit(5000);
		savingsAccount.withdraw(4000);

		savingsAccount.getBalanceAmount();

		System.out.println("------------------");

		currentAccount.deposit(8000);
		currentAccount.withdraw(6000);
		currentAccount.withdraw(2000);
		currentAccount.withdraw(200);
		currentAccount.getBalanceAmount();

	}

}
