package logic;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestClientManagerV2 {
	
	@Test
	public void test_findClientById() {
		// DataSet de entrada
		ClientDataType client01 = new ClientDataType(1, "Client 01", 41, "mail@client.01", true, 1);
		ClientDataType client02 = new ClientDataType(2, "Client 02", 42, "mail@client.02", true, 2);
		ClientDataType client03 = new ClientDataType(3, "Client 03", 43, "mail@client.03", true, 3);
		List<ClientDataType> clients = new ArrayList<>();
		clients.add(client01);
		clients.add(client02);
		clients.add(client03);
		ClientManager clientManager = new ClientManager(clients);
		
		// Função para avaliação e análise
		ClientDataType clientEvall1 = clientManager.findClientById(1);
		// DataSet de saída e verificação
		assertThat(clientEvall1.getIdClient(), is(1));
		assertThat(clientEvall1.getMailClient(), is("mail@client.01"));
		
		// Função para avaliação e análise
		ClientDataType clientEvall2 = clientManager.findClientById(2);
		// DataSet de saída e verificação
		assertThat(clientEvall2.getIdClient(), is(2));
		assertThat(clientEvall2.getMailClient(), is("mail@client.02"));	}
		

}
