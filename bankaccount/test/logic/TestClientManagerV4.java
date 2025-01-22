package logic;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestClientManagerV4 {
	
	@Test
	public void test_findClientById() {
		// DataSet de entrada
		Client client01 = new Client(1, "Client 01", 41, "mail@client.01", true, 1);
		Client client02 = new Client(2, "Client 02", 42, "mail@client.02", true, 1);
		Client client03 = new Client(3, "Client 03", 43, "mail@client.03", true, 3);
		List<Client> clients = new ArrayList<>();
		clients.add(client01);
		clients.add(client02);
		clients.add(client03);
		ClientManager clientManager = new ClientManager(clients);
		
		// Função para avaliação e análise
		Client clientEvall1 = clientManager.findClientById(1);
		// DataSet de saída e verificação
		assertThat(clientEvall1.getIdClient(), is(1));
		assertThat(clientEvall1.getMailClient(), is("mail@client.01"));
		
		// Função para avaliação e análise
		Client clientEvall2 = clientManager.findClientById(2);
		// DataSet de saída e verificação
		assertThat(clientEvall2.getIdClient(), is(2));
		assertThat(clientEvall2.getMailClient(), is("mail@client.02"));
		}
	
	@Test
	public void test_removeClientByID() {
		// DataSet de entrada
		Client client01 = new Client(1, "Client 01", 41, "mail@client.01", true, 1);
		Client client02 = new Client(2, "Client 02", 42, "mail@client.02", true, 1);
		Client client03 = new Client(3, "Client 03", 43, "mail@client.03", true, 3);
		List<Client> clients = new ArrayList<>();
		clients.add(client01);
		clients.add(client02);
		clients.add(client03);
		ClientManager clientManager = new ClientManager(clients);
		
		// Função para avaliação e análise
		boolean rmvdClient = clientManager.removeClientById(2);
		// DataSet de saída e verificação
		assertThat(rmvdClient, is(true));
		assertEquals(true, rmvdClient);
		assertThat(clientManager.getClients().size(), is(2));
		assertEquals(2, clientManager.getClients().size());
		assertNull(clientManager.findClientById(-5));
//		assertNull(clientManager.findClientById(3)); // Esse tem que falhar, é o erro certo
	}

}
