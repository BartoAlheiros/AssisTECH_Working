package br.ufrpe.assistec.ui;

import java.util.Scanner;

import br.ufrpe.assistec.dados.OSNaoEncontradaException;
import br.ufrpe.assistec.negocio.EquipamentoJahEncaminhadoException;
import br.ufrpe.assistec.negocio.OSExisteException;
import br.ufrpe.assistec.negocio.OSExistenteException;
import br.ufrpe.assistec.negocio.ServidorAssisTech;
import br.ufrpe.assistec.negocio.beans.Cliente;
import br.ufrpe.assistec.negocio.beans.Equipamento;
import br.ufrpe.assistec.negocio.beans.OrdemDeServico;
import br.ufrpe.assistec.negocio.beans.Tecnico;

public class Programa {
	
	public static void main(String[] args) throws OSNaoEncontradaException, OSExistenteException, EquipamentoJahEncaminhadoException {
		Scanner input = new Scanner(System.in);
		String entrada = null;

		//MENU
		ServidorAssisTech servidor = null;
		servidor = servidor.getInstance();
		
		do{
			entrada = null; 
			System.out.println("Escolha a opcao desejada: \n\n");
			System.out.println("1 - Cadastrar Ordem de Servico\n");
			System.out.println("2 - Listar Ordens de Servico Cadastradas(Resumo)\n");
			System.out.println("3 - Listar Ordens de Servico Cadastradas(Por data/prioridade)\n");
			//System.out.println("4 - Visualizar uma Ordem de Servico\n");
			//System.out.println("4 - Fechar Ordem de Servico\n");
			//System.out.println("5 - Cadastrar Cliente\n");
			//System.out.println("6 - Listar Clientes\n");
			//System.out.println("7 - Buscar Cliente\n");
			System.out.println("8 - Sair\n\n");
			System.out.println("Op��o: "); entrada = input.next(); 
			input.nextLine(); //Limpa o buffer do teclado
			//if(entrada.equals("5")){

			switch(entrada) {


				case "1":
					//Dados iniciais
					OSExisteException osExcept = null;
	
					do{
						try{
	
							OrdemDeServico os = new OrdemDeServico();
							System.out.println("N�mero: \n");
							String n = input.nextLine();
							input.nextLine(); //Limpa o buffer do teclado
							os.setNumero(n);
	
							System.out.println("Data de Entrada: \n");
							String data = input.nextLine();
							os.setDataEntrada(data);
							input.nextLine(); //Limpa o buffer do teclado
							
							//Quem pegou o equipamento, na entrada do mesmo na assit�ncia
							System.out.println("Portador: \n");
							String portador = input.nextLine();
							input.nextLine(); //Limpa o buffer do teclado
							os.setPortador(portador);
							
							/*"Cadastrando" o Cliente
							 * Associando um Cliente a uma Ordem de Servico*/
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
							os.setCliente(cliente);
							input.nextLine(); //Limpa o buffer do teclado
							
							//Cadastrando T�cnico
							Tecnico t = new Tecnico();
							System.out.printf("Informa��es do T�cnico\n\n");
			
							System.out.println("Nome Completo: ");
							String nomeT = input.nextLine();
							input.nextLine(); //Limpa o buffer do teclado
							t.setNomeCompleto(nomeT);
			
							System.out.println("Email: ");
							String emailT = input.nextLine();
							input.nextLine(); //Limpa o buffer do teclado
							t.setEmail(emailT);
			
							System.out.println("Telefone: ");
							String telefoneTecnico = input.nextLine();
							input.nextLine(); //Limpa o buffer do teclado
							t.setTelefone(telefoneTecnico);
			
							os.setTecnicoResponsavel(t);
							
							//Cadastrando Equipamento
							Equipamento equipto = new Equipamento();
							System.out.printf("Dados do equipamento\n\n");
			
							System.out.println("Tipo: ");
							String tipo = input.nextLine();
							input.nextLine(); //Limpa o buffer do teclado
							equipto.setTipo(tipo);
			
	
						}catch(OSExisteException osExisteExcept) {
							System.err.println(osExisteExcept.getMessage());
							osExcept = osExisteExcept;
						}
					}while(osExcept != null);
	
	
					
	
					boolean check = false;
	
					do{
						try{
	
							//Cadastro do equipamento
	
	
							System.out.println("No de S�rie: ");
							String numSerie = input.nextLine();
							input.nextLine(); //Limpa o buffer do teclado
	
							/*O equipamento n�o � cadastrado em um reposit�rio de equipamentos, por enquanto
							 * mas ele pertence a uma Ordem.*/
							check = servidor.validarEquipamento(numSerie);
							equipto.setNumeroSerie(numSerie);
							ordem.setEquipamento(equipto);
	
						} catch(EquipamentoJahEncaminhadoException equipEmServico) {
	
							System.out.println("cheguei aqui");
							System.err.print(equipEmServico.getMessage());
	
						}
					}while(check == true);
	
					//Fim do cadastro do equipamento, continuando a construir a ordem
	
					System.out.println("Caracter�sticas do Defeito: ");
					String caracDefeito = input.nextLine();
					input.nextLine(); //Limpa o buffer do teclado
					ordem.setCaracteristicasDefeito(caracDefeito);
	
					//Relat�rio de manuten��o
					System.out.println("Relat�rio de Manuten��o: ");
					String relatorio = input.nextLine();
					input.nextLine(); //Limpa o buffer do teclado
					ordem.setRelatorioDeManutencao(relatorio);
	
					//repositorioOS.cadastrar(ordem);
					servidor.cadastrarOrdem(ordem);
					break;
	
				case "2":
					OrdemDeServico ordem_2 = new OrdemDeServico();
					System.out.println("Digite o n�mero da Ordem de Servico: ");
					String numeroOS = input.nextLine();
					input.nextLine(); //Limpa o buffer do teclado
					ordem_2 = servidor.buscarOrdem(numeroOS);
					if(ordem_2 != null) {
						System.out.println(ordem_2);	   
					}else{
						System.out.println("Ordem de Servico procurada n�o existe!");	   
					}
					break;
	
				case "3":
					servidor.listarOrdens();
					break;
	
				case "4":
					System.out.println("Digite o n�mero da OS que deseja fechar: ");
					String numeroOS_2 = input.nextLine();
					input.nextLine(); //Limpa o buffer do teclado
					//repositorioOS.remover(numeroOS_2);
					servidor.removerOS(numeroOS_2);
					break;
	
					/*case "5":
					repositorio.listar();
					break;*/
	
				default: 
					System.out.println("Digite uma op��o v�lida.");
	
			}	
		
		}while(entrada.equals("8") == false);

		System.out.println("Obrigado por utilizar AssisTec!"); 
        input.close();
	}


}


