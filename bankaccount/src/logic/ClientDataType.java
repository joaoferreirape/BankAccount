package logic;

public class ClientDataType {
	private int _idClient;
	private String _nameClient;
	private int _ageClient;
	private String _mailClient;
	private boolean _statusClient;
	private int _idAccount;

	/**
	 * Método construtor da classe ClientDataType
	 * @param idClient
	 * @param nameClient
	 * @param ageClient
	 * @param mailClient
	 * @param statusClient
	 * @param idAccount
	 */
	public ClientDataType(int idClient, String nameClient, int ageClient, String mailClient, boolean statusClient, int idAccount) {
		this._idClient = idClient;
		this._nameClient = nameClient;
		this._ageClient = ageClient;
		this._mailClient = mailClient;
		this._statusClient = statusClient;
		this._idAccount = idAccount;
	}
	
	public int getIdClient() { return this._idClient; }
	public void setIdClient(int idClient) { this._idClient = idClient; }
	
	public String getNameClient() { return this._nameClient; }
	public void setNameClient(String nameClient) { this._nameClient = nameClient; }
	
	public int getAgeClient() { return this._ageClient; }
	public void setAgeClient(int ageClient) { this._ageClient = ageClient; }
	
	public String getMailClient() { return this._mailClient; }
	public void setMailClient(String mailClient) { this._mailClient = mailClient; }
	
	public boolean getStatusClient() { return this._statusClient; }
	public void setStatusClient(boolean statusClient) { this._statusClient = statusClient; }
	
	public int getIdAccount() { return this._idAccount; }
	public void setIdAccount(int idAccount) { this._idAccount = idAccount; }
	
	public String clientData() {
		String data =	"*-*-*-*-*-*-*-*-*-*-*\n" 
				+ "*-*-*-*-*-*-*-*-*-*-*\n"
				+ "IdClient: "	+ this._idClient + "\n"
				+ "Name: "		+ this._nameClient + "\n"
				+ "Mail: "		+ this._mailClient + "\n"
				+ "Age: "		+ this._ageClient + "\n"
				+ "Status: "	+ (this._statusClient?"Active":"Inactive") + "\n"
				+ "*-*-*-*-*-*-*-*-*-*-*\n"
				+ "*-*-*-*-*-*-*-*-*-*-*";
		return data;
	}

}
