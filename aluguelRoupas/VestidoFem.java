package aluguelRoupas;

import java.util.Scanner;

public class VestidoFem extends CadastroAluguel {
	String modelo;
	String comprimento;
	int medidaBusto;
	int medidaCintura;
	int medidaQuadril;
	char classificacaoV;

	CadastroAluguel roupa = new CadastroAluguel();
	
	public void cadastrarVestido(Scanner entrada) {
		
		System.out.println("Modelo vestido: ");
		modelo = entrada.nextLine();
		entrada.nextLine();
		
		System.out.println("Comprimento: ");
		comprimento = entrada.nextLine();
		
		System.out.println("Medida busto(em cm): ");
		medidaBusto = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.println("Medida da cintura(em cm): ");
		medidaCintura = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.println("Medida do Quadril(em cm): ");
		medidaQuadril = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.println("Classificação do vestido (Noiva=1 / Debutante=2 / Madrinha=3): ");
		classificacaoV = entrada.next().charAt(0);
	
		
	}

}
