package br.ufrpe.assistec.negocio;

import br.ufrpe.assistec.dados.RepositorioClientesArray;
import br.ufrpe.assistec.negocio.beans.Cliente;

public class CadastroClientes {
	private RepositorioClientesArray repositorio;
	
	public CadastroClientes() {

		this.repositorio = new RepositorioClientesArray();
	}

	public void cadastrar(Cliente c) {

	if (c != null) {

		this.repositorio.cadastrar(c);

	} else {

		// Mais tarde nos livraremos do c�digo de interface
		// com o usu�rio

	}
	
	}
	
	public boolean validarCpf(Cliente cliente) {
		return this.repositorio.validarCpf(cliente);
	}
	
}
