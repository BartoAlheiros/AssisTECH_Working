package br.ufrpe.assistec.negocio;

public class EquipamentoExisteException extends Exception {
	
	private String numSerie;
	
	public EquipamentoExisteException(String numSerie){
		super("O equipamento que voc� est� tentando cadastrar no sistema, j� existe.");
		this.numSerie = numSerie;
	}
	
	public EquipamentoExisteException(){
		super("O equipamento que voc� est� tentando cadastrar no sistema, j� existe.");
	}
	
	public String getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

}
