package logic;

import java.util.List;

public class ClientManager {
	
	private List<Client> _clients;
	
	public ClientManager(List<Client> clients) {
		this._clients = clients;
	}
	
	public List<Client> getClients() { return this._clients; }
	
	public void addClient(Client newClient) {
		this._clients.add(newClient);
	}
	
	public boolean removeClientById(int idClient) {
		boolean rt = false;
		for(int i = 0; i < this._clients.size(); i++) {
			Client client = this._clients.get(i);
			if(client.getIdClient() == idClient) {
				this._clients.remove(i);
				rt = true;
				break;
			}
		}
		return rt;
	}
	
	public Client findClientById(int idClient) {
		Client rt = null;
		for (Client client : _clients) {
			if(client.getIdClient() == idClient) {
				rt = client;
				break;
			}
		}
		return rt;
	}
	
	public boolean findStatusClientById(int idClient) {
		boolean rt = false;
		for(int i = 0; i < this._clients.size(); i++) {
			Client client = this._clients.get(i);
			if(client.getIdClient() == idClient) {
				rt = client.getStatusClient();
				break;
			}
		}
		return rt;
	}
	
	public boolean validateAge(int age) throws InvalidAgeException {
		if(age < 18 || age > 75) { throw new InvalidAgeException(InvalidAgeException.MSG); }
		return true;
	}
	
	public void clearClients() {
		this._clients.clear();
	}

}
