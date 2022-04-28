//arquivo de teste, deve ser deletado no envio do trabalho
package Prova;

import entities.*;

public class TabelaResultado extends Tabela{

	public TabelaResultado(String[] args) {
		criarRotulos();
	}

	private void criarRotulos(){
		adicionaLinha("ORDENACAO");
		adicionaLinha("----------");
		adicionaLinha("METODO");
		adicionaLinha("");
		adicionaLinha("=========");
		adicionaLinha("Insertion");
		adicionaLinha("Merge");
		adicionaLinha("Quick");
		normalizaTodasLinhas(11);
	}

	public void inserir(
		String categoria, float[] tempoTotal, 
		int[] acessos, int[] comparacoes, 
		int[] trocas, String extra) {
		
	}
}
