package br.ufrpe.assistec.negocio;

public class EquipamentoExisteException extends Exception {
	public EquipamentoExisteException(){
		super("O equipamento que voc� est� tentando cadastrar no sistema, j� existe.");
	}
}
