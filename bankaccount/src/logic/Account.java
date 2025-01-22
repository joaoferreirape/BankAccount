package logic;

public class Account {
	
	private int _idAccount;
	private double _accountBalance;
	private boolean _statusAccount;
	
	public Account(int idAccount, double accountBalance, boolean statusAccount) {
		this._idAccount = idAccount;
		this._accountBalance = accountBalance;
		this._statusAccount = statusAccount;
	}
	
	public int getIdAccount() { return this._idAccount; }
	public void setIdAccount(int idAccount) { this._idAccount = idAccount; }
	
	public double getAccountBalance() { return this._accountBalance; }
	public void setAccountBalance(double accountBalance) { this._accountBalance = accountBalance; }
	
	public boolean getStatusAccount() { return this._statusAccount; }
	public void setStatusAccount(boolean statusAccount) { this._statusAccount = statusAccount; }
	
	public String accountData() {
		String data =	"*-*-*-*-*-*-*-*-*-*-*\n"
						+ "*-*-*-*-*-*-*-*-*-*-*\n"
						+ "IdAccount: "	+ this._idAccount + "\n"
						+ "Balance: "	+ this._accountBalance + "\n"
						+ "Status: "	+ (this._statusAccount?"Active":"Inactive") + "\n"
						+ "*-*-*-*-*-*-*-*-*-*-*\n"
						+ "*-*-*-*-*-*-*-*-*-*-*";
		return data;
	}

}
