package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Elogio;
import entities.Pessoa;
import entities.Reclamacao;
import entities.Sugestao;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Reclamacao[] reclamacoes = new Reclamacao[5];
		int nReclamacoes = 0;
		
		Elogio[] elogios = new Elogio[5];
		int nElogios = 0;
		
		Sugestao[] sugestoes = new Sugestao[5];
		int nSugestoes = 0;
		
		String marcadores = "======================================================";
		
		System.out.println(marcadores);
		System.out.println("|          Bem vindo a Ouvidoria Unifacisa!          |");
		System.out.println(marcadores);
		System.out.println();
		
		System.out.print("Informe o seu nome: ");
		String nome = sc.nextLine();
		System.out.print("Informe o seu e-mail: ");
		String email = sc.nextLine();
		System.out.print("Informe o seu número de celular: ");
		String celular = sc.nextLine();
		
		Pessoa pessoa = new Pessoa(nome, email, celular);
		
		int menu = 0;
		
		while (menu != 3) {
			
			System.out.println();
			System.out.println(marcadores);
			System.out.println("           Informe qual opcao voce deseja: ");
			System.out.println(marcadores);
			System.out.println();
			System.out.println("1 - Inserir manifestacao | 2 - Listar manifestacao | 3 - Sair");
			System.out.println();
			System.out.print("Sua opcao: ");
			menu = sc.nextInt();
			
			switch(menu) {
			
			case 1:{
				
				System.out.println();
				System.out.println("Você escolheu a opcao inserir manifestacao");
				System.out.println();
				System.out.println(marcadores);
				System.out.println("Informe qual tipo de manifestacao voce deseja inserir: ");
				System.out.println(marcadores);
				System.out.println();
				System.out.println("1 - Reclamacao | 2 - Elogio | 3 - Sugestao");
				System.out.println();
				System.out.print("Sua opcao: ");
				int tipo = sc.nextInt();
				
				switch(tipo) {
				case 1:{
					System.out.println();
					System.out.println("Voce escolheu a opcao inserir reclamacao");
					System.out.println();
					System.out.print("Informe a sua reclamacao: ");
					sc.nextLine();
					String texto = sc.nextLine();
					String categoria = "Reclamacao";
					Reclamacao reclamacao = new Reclamacao(pessoa,texto,categoria);
					reclamacoes[nReclamacoes] = reclamacao;
					nReclamacoes++;
					System.out.println();
					System.out.println("Reclamacao cadastrada com sucesso!");
				}
				break;
				case 2:{
					System.out.println();
					System.out.println("Voce escolheu a opcao inserir elogio");
					System.out.println();
					System.out.print("Informe o seu elogio: ");
					sc.nextLine();
					String texto = sc.nextLine();
					String categoria = "Elogio";
					Elogio elogio = new Elogio(pessoa,texto,categoria);
					elogios[nElogios] = elogio;
					nElogios++;
					System.out.println();
					System.out.println("Elogio cadastrado com sucesso!");
				}
				break;
				case 3:{
					System.out.println();
					System.out.println("Voce escolheu a opcao inserir sugestao");
					System.out.println();
					System.out.print("Informe a sua sugestao: ");
					sc.nextLine();
					String texto = sc.nextLine();
					String categoria = "Sugestao";
					Sugestao sugestao = new Sugestao(pessoa,texto,categoria);
					sugestoes[nSugestoes] = sugestao;
					nSugestoes++;
					System.out.println();
					System.out.println("Sugestao cadastrada com sucesso!");
				}
				break;
				}
			}
			break;
			
			case 2: {
				System.out.println();
				System.out.println("Voce escolheu a opcao listar manifestacoes: ");
				System.out.println();
				
				System.out.println("Informacoes do usuario ativo: ");
				System.out.println();
				System.out.println(marcadores);
				System.out.println(pessoa.toString());
				System.out.println(marcadores);
				System.out.println();
				
				System.out.println("Reclamacoes: ");
				for(int i = 0; i<reclamacoes.length;i++) {
					if(reclamacoes[0] == null) {
						System.out.println("Sem reclamacoes cadastradas");
						break;
					}
					if(reclamacoes[i] != null) {
					System.out.println(i+1 + " - " + reclamacoes[i].toString());
					}
				}
				System.out.println();
				
				System.out.println("Elogios: ");
				for(int i = 0; i<elogios.length;i++) {
					if(elogios[0] == null) {
						System.out.println("Sem elogios cadastrados");
						break;
					}
					if(elogios[i] != null) {
					System.out.println(i+1 + " - " + elogios[i].toString());}
				}
				System.out.println();
				
				System.out.println("Sugestoes: ");
				for(int i = 0; i<sugestoes.length;i++) {
					if(sugestoes[0] == null) {
						System.out.println("Sem sugestoes cadastradas");
						break;
					}
					if(sugestoes[i] != null) {
					System.out.println(i+1 + " - " + sugestoes[i].toString());;	
					}
					
				}
			}
			break;
			}	
		}
		
		System.out.println();
		System.out.println(marcadores);
		System.out.println("  Muito obrigado por usar nossa ouvidoria! Ate breve.");
		System.out.println(marcadores);
		
		sc.close();
		
	}

}
