package br.ufrpe.assistec.dados;

public class OSNaoEncontradaException extends Exception {
	public OSNaoEncontradaException(){
		super("OS n�o existe. Digite um n�mero v�lido ou 1 e Enter para voltar ao Menu Principal");
	}
}
