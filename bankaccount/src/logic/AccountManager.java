package logic;

import java.util.List;

public class AccountManager {
	
	private List<Account> _accounts;
	
	public AccountManager(List<Account> accounts) {
		this._accounts = accounts;
	}
	
	public List<Account> getAccounts() { return this._accounts; }
	
	public void addAccount(Account newAccount) {
		this._accounts.add(newAccount);
	}

	public boolean removeAccountById(int idAccount) {
		boolean rt = false;
		for(int i = 0; i < this._accounts.size(); i++) {
			Account account = this._accounts.get(i);
			if(account.getIdAccount() == idAccount) {
				this._accounts.remove(i);
				rt = true;
				break;
			}
		}
		return rt;
	}
	
	public Account findAccountById(int idAccount) {
		Account rt = null;
		for(Account account : _accounts) {
			if(account.getIdAccount() == idAccount) {
				rt = account;
				break;
			}
		}
		return rt;
	}
	
	public boolean findStatusAccountById(int idAccount) {
		boolean rt = false;
		for(int i = 0; i < this._accounts.size(); i++) {
			Account account = this._accounts.get(i);
			if(account.getIdAccount() == idAccount) {
				rt = account.getStatusAccount();
				break;
			}
		}
		return rt;
	}

	public boolean sendPix(int idSourceAccount, double sendAmount, int idDestinationAccount) {
		boolean rt = false;
		Account sourceAccount = this.findAccountById(idSourceAccount);
		Account destinationAccount = this.findAccountById(idDestinationAccount);
		
		if(sourceAccount.getAccountBalance() >= sendAmount) {
			destinationAccount.setAccountBalance(destinationAccount.getAccountBalance() + sendAmount);
			sourceAccount.setAccountBalance(sourceAccount.getAccountBalance() - sendAmount);
			rt = true;
		}
			
		return rt;
	}
	
}
