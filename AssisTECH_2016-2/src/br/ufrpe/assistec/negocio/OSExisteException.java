package br.ufrpe.assistec.negocio;

public class OSExisteException extends Exception{
	public OSExisteException(String numero) {
		super("A OS n�mero: " + numero + "j� est� cadastrada no sistema.");
	}
}
