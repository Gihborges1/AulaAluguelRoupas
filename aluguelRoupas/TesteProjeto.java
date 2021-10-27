package aluguelRoupas;

import java.util.Scanner;

public class TesteProjeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VestidoFem roupaFem = new VestidoFem();
		
		TrajesMas roupaMas = new TrajesMas();
		
		Noiva vestidoNoiva = new Noiva();
		
		Madrinha vestidoMad = new Madrinha();
		
		Debutante vestidoDeb = new Debutante();
		
		CadastroAluguel roupa = new CadastroAluguel();
		
		CadastroCliente cliente = new CadastroCliente();
		
		Alugueis aluguel = new Alugueis();
		
		estoque material = new estoque();
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Cadastrando Cliente...");
		cliente.cadastrarCliente(entrada);
		
		System.out.println("Cadastrando Aluguel");
		roupa.cadastrarAluguel(entrada);
		 	if(roupa.classificacao == '1') {
				roupaMas.cadastrarTraje(entrada);
			}
				
			else if (roupa.classificacao == '2') {
				roupaFem.cadastrarVestido(entrada);
				
				if(roupaFem.classificacaoV == '1') {
					vestidoNoiva.cadastrarVestNoiva(entrada);
				}
				else if (roupaFem.classificacaoV == '2') {
					vestidoDeb.cadastrarVestDeb(entrada);
				}
				else if (roupaFem.classificacaoV == '3')  {
					vestidoMad.cadastrarVestMad(entrada);
				}
				
			}
		
		System.out.println("Peças alugadas...");
		aluguel.alugados(entrada);
		
		System.out.println("Estoque...");
		material.atualizarEstoque(entrada);
		
		System.out.println("Apresentando cadastros realizados...");
		System.out.println("Cliente: ");
		System.out.println("Nome do cliente: "+cliente.nome);
		System.out.println("CPF: "+cliente.CPF);
		System.out.println("Endereço: "+cliente.endereco);
		System.out.println("Telefone: "+cliente.telefone);
		System.out.println("Identificação: "+cliente.id);
		
		System.out.println("Aluguel: ");
		System.out.println("Identificação da roupa: "+roupa.id);
		System.out.println("Classificação da roupa: "+roupa.classificacao);
			if (roupa.classificacao == '1') {
				System.out.println("Trajes masculinos: ");
				System.out.println("Noivo ou Padrinho: "+roupaMas.usoQuem);
				System.out.println("Tipo do Traje: "+roupaMas.tipo);
				System.out.println("Comprimento da manga: "+roupaMas.compManga);
				System.out.println("Medida da Cintura:"+roupaMas.medidaCintura);
				System.out.println("Comprimento da calça: "+roupaMas.compCalca);
			}
			else if (roupa.classificacao == '2') {
				System.out.println("Vestidos Femininos: ");
				System.out.println("Modelo: "+roupaFem.modelo);
				System.out.println("Comprimento: "+roupaFem.comprimento);
				System.out.println("Medida do Busto: "+roupaFem.medidaBusto);
				System.out.println("Medida da Cintura:"+roupaFem.medidaCintura);
				System.out.println("Medida do Quadril: "+roupaFem.medidaQuadril);
				System.out.println("Classificação: "+roupaFem.classificacaoV);
				
				if(roupaFem.classificacaoV == '1') {
					System.out.println("Vestido Noiva: ");
					System.out.println("Vestido Possui Cauda? "+vestidoNoiva.cauda);
					System.out.println("Vestido Possui Véu? "+vestidoNoiva.veu);
					
				}
				else if (roupaFem.classificacaoV == '2') {
					System.out.println("Vestido Debutante: ");
					System.out.println("Qual tipo de uso? "+vestidoDeb.tipoUso);
					
				}
				else if (roupaFem.classificacaoV == '3')  {
					System.out.println("Vestido Madrinha: ");
					System.out.println("Horário Festa: "+vestidoMad.horaFesta);
				}
				
			}
		}
	}


