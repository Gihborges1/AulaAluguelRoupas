package aluguelRoupas;

import java.util.Scanner;

public class TrajesMas extends CadastroAluguel {
	String usoQuem;
	String tipo;
	int compManga;
	int medidaCintura;
	int compCalca;

	CadastroAluguel roupa = new CadastroAluguel();
	
	public void cadastrarTraje(Scanner entrada) {
		System.out.println("Para noivo ou padrinho: ");
		usoQuem = entrada.nextLine();
		
		System.out.println("Tipo de traje: ");
		tipo = entrada.nextLine();
		
		System.out.println("Comprimento da manga(em cm): ");
		compManga = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.println("Medida da cintura(em cm): ");
		medidaCintura = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.println("Comprimento da calça(em cm): ");
		compCalca = entrada.nextInt();
		
		entrada.nextLine();
	
		
	}

}
