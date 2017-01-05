package br.ufrpe.assistec.ui;

import java.util.Scanner;

import br.ufrpe.assistec.negocio.ClienteJahCadastradoException;
import br.ufrpe.assistec.negocio.ClienteNaoCadastradoException;
import br.ufrpe.assistec.negocio.EquipamentoExisteException;
import br.ufrpe.assistec.negocio.EquipamentoNaoExisteException;
import br.ufrpe.assistec.negocio.OSExisteException;
import br.ufrpe.assistec.negocio.OSNaoEncontradaException;
import br.ufrpe.assistec.negocio.ServidorAssisTech;
import br.ufrpe.assistec.negocio.TecnicoNaoCadastradoException;
import br.ufrpe.assistec.negocio.beans.Cliente;
import br.ufrpe.assistec.negocio.beans.Equipamento;
import br.ufrpe.assistec.negocio.beans.Tecnico;
import br.ufrpe.assistec.negocio.beans.Usuario;


public class Programa {
	
		
	public static void main(String[] args) throws OSNaoEncontradaException, OSExisteException, ClienteJahCadastradoException, ClienteNaoCadastradoException, EquipamentoExisteException, EquipamentoNaoExisteException {
		
		MenuTextual menuTextual = new MenuTextual();
		Scanner input = new Scanner(System.in);
		
		int entrada;
		
		do{
			entrada = 0;
			System.out.println("=========================================================");
			System.out.println("Bem vindo a AssisTec. \n Vers�o. 1.0");
			System.out.println("=========================================================");
			System.out.println("Escolha a opcao desejada: \n\n");
			System.out.println("1 - Cadastrar Cliente\n");
			System.out.println("2 - Buscar Cliente\n");
			System.out.println("3 - Cadastrar T�cnico\n");
			System.out.println("4 - Buscar T�cnico\n");
			System.out.println("5 - Cadastrar Equipamento\n");
			System.out.println("6 - Buscar Equipamento\n");
			System.out.println("8 - Nova Ordem\n");
			System.out.println("9 - Buscar Ordem\n");
			System.out.println("10 - Sair\n\n");
			System.out.println("Op��o: "); entrada = input.nextInt(); 
			input.nextLine(); //Limpa o buffer do teclado
			
			if(entrada > 10 || entrada == 0) {
				System.out.println("Op��o inv�lida!");
			}
			
			menuTextual.MenuPrincipal(entrada);

					
		}while(entrada <= 10);

		System.out.println("Obrigado por utilizar AssisTec!"); 
        input.close();
	}


}


