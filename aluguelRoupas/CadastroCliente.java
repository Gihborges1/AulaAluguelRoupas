package aluguelRoupas;

import java.util.Scanner;

public class CadastroCliente {
	String nome;
	String CPF;
	String endereco;
	String telefone;
	int id;
	
	public void cadastrarCliente(Scanner entrada) {
		
		System.out.println("Nome do cliente: ");
		nome = entrada.nextLine();
		
		System.out.println("CPF: ");
		CPF = entrada.nextLine();
		
		System.out.println("Endereço: ");
		endereco = entrada.nextLine();
		
		System.out.println("Telefone: ");
		telefone = entrada.nextLine();
		
		System.out.println("Identifição: ");
		id = entrada.nextInt();
		
		
		
		
	}
}
