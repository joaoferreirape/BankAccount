package logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static ClientManager clientManager;
	static AccountManager accountManager;
	
	public static void main(String[] args) {
		stubData();

		try (Scanner sc = new Scanner(System.in)) {
			while(true) {
				printMenu();
				int menuOption = sc.nextInt();
				
				switch(menuOption) {
				case 1:
					System.out.println("Insert Client Id: ");
					int idClientMenu1 = sc.nextInt();
					ClientDataType clientMenu1 = clientManager.findClientById(idClientMenu1);
					if(clientMenu1 != null) {
						System.out.println(clientMenu1.clientData());
					} else {
						System.out.println("Client not found...");
					}
					System.out.println("\n");
					break;
				case 2:
					System.out.println("Insert Account Id: ");
					int idAccount = sc.nextInt();
					Account account = accountManager.findAccountById(idAccount);
					if(account != null) {
						System.out.println(account.accountData());
					} else {
						System.out.println("Account not found...");
					}
					System.out.println("\n");
					break;
				case 3:
					System.out.println("Insert Client Id: ");
					int idClientMenu2 = sc.nextInt();
					ClientDataType clientMenu2 = clientManager.findClientById(idClientMenu2);
					if(clientMenu2 != null) {
						clientMenu2.setStatusClient(true);
						System.out.println("Client activated!");
					} else {
						System.out.println("Client not found...");
					}
					System.out.println("\n");
					break;
				case 4:
					System.out.println("Insert Client Id: ");
					int idClientMenu3 = sc.nextInt();
					ClientDataType clientMenu3 = clientManager.findClientById(idClientMenu3);
					if(clientMenu3 != null) {
						clientMenu3.setStatusClient(false);
						System.out.println("Client deactivated!");
					} else {
						System.out.println("Client not found...");
					}
					System.out.println("\n");
					break;
				case 5:
					System.exit(0);
					break;
				default:
					System.out.println("\n");
					System.out.println("\n");
					System.out.println("\n");
					System.out.println("\n");
					System.out.println("\n");
					break;
				}
			}
		}
	}

	private static void printMenu() {
		System.out.println("*-* Bank of Money *-*\n");
		System.out.println("1: Find Client ");
		System.out.println("2: Find Account");
		System.out.println("3: Activate Client");
		System.out.println("4: Deactivate Client");
		System.out.println("5: Exit");
		System.out.println();		
	}
	
	private static void stubData() {
		List<Account> accounts = new ArrayList<>();
		List<ClientDataType> clients = new ArrayList<>();
		
		Account account01 = new Account(1, 0, true);
		Account account02 = new Account(2, 0, true);
		accounts.add(account01);
		accounts.add(account02);
		
		ClientDataType client01 = new ClientDataType(1, "Dismenielisson Jerry",   21, "jerry@saite.pra.la", true, account01.getIdAccount());
		ClientDataType client02 = new ClientDataType(2, "O Sábio Senhor do Nada", 42, "sabio@senhor.nada",  true, account02.getIdAccount());
		clients.add(client01);
		clients.add(client02);
		
		clientManager = new ClientManager(clients);
		accountManager = new AccountManager(accounts);		
	}
	
}
