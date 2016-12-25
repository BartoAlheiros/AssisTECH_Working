/*Levantada caso um cliente for ser adicionado ao sistema. Mas o cpf dele j� consta no Sistema.*/

package br.ufrpe.assistec.negocio;

public class ClienteJahCadastradoException extends Exception{
	private String cpf;
	
	public ClienteJahCadastradoException(String cpf) {
		super("O cpf" + cpf + "j� est� cadastrado no sistema.");
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
