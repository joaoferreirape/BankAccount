package logic;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestClientManagerV1 {
	
	@Test
	public void test_findClientById() {
		// DataSet de entrada
		ClientDataType client01 = new ClientDataType(1, "Client 01", 41, "mail@client.01", true, 1);
		List<ClientDataType> clients = new ArrayList<>();
		clients.add(client01);
		ClientManager clientManager = new ClientManager(clients);
		
		// Função para avaliação e análise
		ClientDataType clientEvall = clientManager.findClientById(1);
		// DataSet de saída e verificação
		assertThat(clientEvall.getIdClient(), is(1));
	}

}
