package aluguelRoupas;

import java.util.Scanner;

public class Noiva extends VestidoFem {
	String cauda;
	String veu;

	public void cadastrarVestNoiva(Scanner entrada) {
		System.out.println("O Vestido tem cauda?(S/N)");
		cauda = entrada.nextLine();
		
		System.out.println("O Vestido tem véu?(S/N)");
		veu = entrada.nextLine();
		
	}
}
