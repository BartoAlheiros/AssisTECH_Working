package br.ufrpe.assistec.programas;

import java.util.Scanner;

import br.ufrpe.assistec.beans.Cliente;
import br.ufrpe.assistec.beans.Equipamento;
import br.ufrpe.assistec.beans.OrdemServico;
import br.ufrpe.assistec.beans.Tecnico;
import br.ufrpe.assistec.repositorios.RepositorioOrdensServico;

public class Programa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String entrada = null;

		//MENU
		RepositorioOrdensServico repositorioOS = new RepositorioOrdensServico(); 
		String codigo;

		do{
			entrada = null; 
			System.out.println("Escolha a opcao desejada: \n\n");
			System.out.println("1 - Cadastrar Ordem de Servico\n");
			System.out.println("2 - Listar Ordens de Servico em Aberto\n");
			System.out.println("3 - Listar Todas as Ordens de Servico\n");
			System.out.println("4 - Buscar Ordem de Servico\n");
			System.out.println("5 - Cadastrar Cliente\n");
			System.out.println("6 - Listar Clientes\n");
			System.out.println("7 - Buscar Cliente\n");
			System.out.println("8 - Sair\n\n");
			System.out.println("Op��o: "); entrada = input.next(); 
			input.nextLine(); //Limpa o buffer do teclado
			//if(entrada.equals("5")){

			switch(entrada) {

			//instanciando um novo livro, preenchendo e guardando no reposit�rioLivros...  
			case "1":
				//Dados iniciais
				OrdemServico ordem = new OrdemServico();	
				System.out.println("N�mero: \n");
				String no = input.nextLine();
				input.nextLine(); //Limpa o buffer do teclado
				ordem.setNumero(no);;


				System.out.println("Data de Entrada: \n");
				String data = input.nextLine();
				ordem.setDataEntrada(data);;
				input.nextLine(); //Limpa o buffer do teclado

				System.out.println("Portador: \n");
				String portador = input.nextLine();
				input.nextLine(); //Limpa o buffer do teclado
				ordem.setPortador(portador);
				
				//Cadastrando o Cliente
				Cliente cliente = new Cliente();
				System.out.printf("Dados do Cliente\n\n");
				
				System.out.println("Nome: ");
				String nome = input.nextLine();
				input.nextLine(); //Limpa o buffer do teclado
				cliente.setNomeCompleto(nome);
				
				System.out.println("Email: ");
				String email = input.nextLine();
				input.nextLine(); //Limpa o buffer do teclado
				cliente.setEmail(email);
				
				System.out.println("Telefone: ");
				String telefone = input.nextLine();
				cliente.setTelefone(telefone);
				ordem.setCliente(cliente);
				input.nextLine(); //Limpa o buffer do teclado
				
				//Cadastrando Equipamento
				Equipamento equipto = new Equipamento();
				System.out.printf("Dados do equipamento\n\n");
				
				System.out.println("Tipo: ");
				String tipo = input.nextLine();
				input.nextLine(); //Limpa o buffer do teclado
				equipto.setTipo(tipo);
				
				System.out.println("No de S�rie: ");
				String noSerie = input.nextLine();
				input.nextLine(); //Limpa o buffer do teclado
				equipto.setNumeroSerie(noSerie);
				
				ordem.setEquipamento(equipto);
				
				//Fim do cadastro do equipamento, continuando a construir a ordem
				
				System.out.println("Caracter�sticas do Defeito: ");
				String caracDefeito = input.nextLine();
				input.nextLine(); //Limpa o buffer do teclado
				ordem.setCaracteristicasDefeito(caracDefeito);
				
				//Cadastrando T�cnico
				Tecnico tecnico = new Tecnico();
				System.out.printf("Informa��es do T�cnico\n\n");
				
				System.out.println("Nome Completo: ");
				String nomeTecnico = input.nextLine();
				input.nextLine(); //Limpa o buffer do teclado
			    tecnico.setNomeCompleto(nomeTecnico);
			    
			    System.out.println("Email: ");
			    String emailTecnico = input.nextLine();
			    input.nextLine(); //Limpa o buffer do teclado
			    tecnico.setEmail(emailTecnico);
			    
			    System.out.println("Telefone: ");
			    String telefoneTecnico = input.nextLine();
			    input.nextLine(); //Limpa o buffer do teclado
			    tecnico.setTelefone(telefoneTecnico);
			    
			    ordem.setTecnicoResponsavel(tecnico);
			    
			    System.out.println("Relat�rio de Manuten��o: ");
				String relatorio = input.nextLine();
				input.nextLine(); //Limpa o buffer do teclado
				ordem.setRelatorioDeManutencao(relatorio);
				
				repositorioOS.cadastrarOS(ordem);
				break;

			case "2":
				repositorioOS.listarOrdens();
				break;

			/*case "3":
				System.out.println("Digite o c�digo do livro: ");
				codigo = input.nextLine();
				input.nextLine(); //Limpa o buffer do teclado
				liv = repositorio.buscar(codigo);
				if(liv != null) {
					System.out.println(liv);	   
				}else{
					System.out.println("Livro n�o existe!");	   
				}
				break;

			case "4":
				System.out.println("Digite o c�digo do livro que deseja alterar: ");
				codigo = input.nextLine();
				repositorio.alterar(codigo);
				break;
			
			case "5":
				repositorio.listar();
				break;*/

			default: 
				System.out.println("Digite uma op��o v�lida.");

			}	
			//} //else {

			//} 
		}while(entrada.equals("6") == false);

		System.out.println("Obrigado por utilizar nosso sistema de Livraria!"); 
        input.close();
	}


	}

//}
