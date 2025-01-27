package logic;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestClientManagerV5 {
	
	private ClientManager clientManager;
	
	@Before
	public void test_beforeActions() {
		// DataSet de entrada
		ClientDataType client01 = new ClientDataType(1, "Client 01", 41, "mail@client.01", true, 1);
		ClientDataType client02 = new ClientDataType(2, "Client 02", 42, "mail@client.02", true, 2);
		ClientDataType client03 = new ClientDataType(3, "Client 03", 43, "mail@client.03", true, 3);
		List<ClientDataType> clients = new ArrayList<>();
		clients.add(client01);
		clients.add(client02);
		clients.add(client03);
		clientManager = new ClientManager(clients);
		System.out.println("DataSet criado.");		
	}
	
	@After
	public void test_afterActions() {
		clientManager.clearClients();
		System.out.println("DataSet limpo.");	
	}
	
	@Test
	public void test_findClientById() {
		System.out.println("Executando o teste: test_findClientById");	
		// Função para avaliação e análise
		ClientDataType client = clientManager.findClientById(2);
		// DataSet de saída e verificação
		assertThat(client.getIdClient(), is(2));
		}
	
	@Test
	public void test_removeClientByID() {
		System.out.println("Executando o teste: test_removeClientByID");
		// Função objetivo
		boolean rmvdClient = clientManager.removeClientById(3);
		// DataSet de Saída
		assertThat(rmvdClient, is(true));
		assertThat(clientManager.getClients().size(), is(2));
		assertNull(clientManager.findClientById(3));
	}

}
