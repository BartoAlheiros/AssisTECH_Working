package br.ufrpe.assistec.negocio;

public class EquipamentoJahEncaminhadoException extends Exception{
	
	public EquipamentoJahEncaminhadoException() {
		super("O equipamento que voc� est� tentando cadastrar j� faz parte de outra OS.");
	}
}
