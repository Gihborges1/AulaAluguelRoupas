package aluguelRoupas;

import java.util.Scanner;

public class CadastroAluguel  {
	int id;
	char classificacao; 

	
	public void cadastrarAluguel(Scanner entrada) {
		

		System.out.println("Identifica��o da roupa: ");
		id = entrada.nextInt();
			
		entrada.nextLine();
			
		System.out.println("Classifica��o (Trajes masculinos=1 ou Vestidos femininos=2): ");
		classificacao = entrada.next().charAt(0);
			
			
			
	}


}
