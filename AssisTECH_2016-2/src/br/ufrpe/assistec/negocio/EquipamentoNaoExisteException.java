package br.ufrpe.assistec.negocio;

public class EquipamentoNaoExisteException extends Exception{
	public EquipamentoNaoExisteException() {
		super("O equipamento que voc� procurou n�o existe.");
	}
}
