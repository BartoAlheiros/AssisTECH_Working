package br.ufrpe.assistec.negocio;

public class OSExisteException extends Exception{
	public OSExisteException() {
		super("N�mero de OS j� cadastrado. Digite um n�mero de OS v�lido");
	}
}
