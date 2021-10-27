package aluguelRoupas;

import java.util.Scanner;

public class Debutante extends VestidoFem {
	String tipoUso;

	public void cadastrarVestDeb(Scanner entrada) {
		System.out.println("Qual tipo de uso?");
		tipoUso = entrada.nextLine();
		
	}
}
