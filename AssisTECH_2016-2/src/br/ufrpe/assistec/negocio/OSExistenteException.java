package br.ufrpe.assistec.negocio;

public class OSExistenteException extends Exception{
	public OSExistenteException() {
		super("N�mero de OS j� cadastrado. Digite um n�mero de OS v�lido");
	}
}
