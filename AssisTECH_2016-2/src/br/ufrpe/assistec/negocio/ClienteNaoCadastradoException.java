/*Levantada quando um Cliente for ser alterado, mas ele n�o est� cadastrado no sistema.*/

package br.ufrpe.assistec.negocio;

public class ClienteNaoCadastradoException extends Exception {
	
	public ClienteNaoCadastradoException(String cpf) {
		super("O cpf " + cpf + " n�o � referente a nenhum cliente cadastrado neste Sistema.");
	}
}
