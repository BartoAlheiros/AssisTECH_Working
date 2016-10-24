package br.ufrpe.assistec.negocio;

import br.ufrpe.assistec.dados.RepositorioOrdensServicoArray;
import br.ufrpe.assistec.negocio.beans.OrdemDeServico;

public class CadastroOrdens {
	private RepositorioOrdensServicoArray repositorio;
	
	public CadastroOrdens() {
		this.repositorio = new RepositorioOrdensServicoArray();
	}
	
	public boolean existe(OrdemDeServico os) {
		return this.repositorio.existe(os);
	}
	

    /**
     * Cadastrar uma Ordem de Servi�o.
     * A ordem s� � cadastrada se ela n�o existir no reposit�rio: 29 - if(!this.existe(os)) {...} 
     *  
     * @param OrdemDeServico
     * @return void
     *         
     */
	public void cadastrar(OrdemDeServico os) {
        if (os == null) {
            throw new IllegalArgumentException("Par�metro inv�lido");
        } else {
            if (!this.existe(os)) {
                this.repositorio.cadastrar(os);
            } else {
                // contaJahExisteException
                
            }
        }        
    }
	
	public OrdemDeServico procurar(String numero) {
		return this.repositorio.procurar(numero);
	}
	
	
}
