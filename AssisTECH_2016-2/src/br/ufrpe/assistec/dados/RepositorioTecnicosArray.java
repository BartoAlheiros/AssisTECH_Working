package br.ufrpe.assistec.dados;

import br.ufrpe.assistec.negocio.beans.Tecnico;

public class RepositorioTecnicosArray {
	private Tecnico[] tecnicos;
	private int proximo;
	
	public RepositorioTecnicosArray() {
		this.tecnicos = new Tecnico[100];
		this.proximo = 0;
	}
	
	public boolean validarMatricula(Tecnico tecnico) {
		boolean resultado = false;
		
		for(int i = 0; i < this.proximo; i++) {
			if(this.tecnicos[i].getMatricula().equals(tecnico.getMatricula())){
				resultado = true;
			}
		}
		
		return resultado;
	}
	
	public void inserirTecnico(Tecnico tecnico) {
		if(this.validarMatricula(tecnico)) {
			System.out.println("T�cnico comn esta matr�cula j� existe.");
		} else{
			this.tecnicos[this.proximo] = tecnico;
			this.proximo++;
		}
	}
}
