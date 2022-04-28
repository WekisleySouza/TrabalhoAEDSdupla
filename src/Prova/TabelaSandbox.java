//arquivo de teste, deve ser deletado no envio do trabalho
package Prova;

import entities.*;

public class TabelaSandbox {

	public static void main(String[] args) {
		Tabela tabela = new Tabela();
		tabela.adicionaLinha("ORDENACAO");
		tabela.adicionaLinha("-----------");
		tabela.adicionaLinha("METODO");
		tabela.adicionaLinha("");
		tabela.adicionaLinha("=========");
		tabela.adicionaLinha("Insertion");
		tabela.adicionaLinha("Merge");
		tabela.adicionaLinha("Quick");
		tabela.normalizaTodasLinhas(11);
		tabela.adicionaNaLinha(1, "------");
		tabela.adicionaNaLinha(2, " TEMPO");
		tabela.adicionaNaLinha(3, " 5000");
		tabela.adicionaNaLinha(4, "=====");
		tabela.adicionaNaLinha(5, String.valueOf(3.567));
		tabela.adicionaNaLinha(6, String.valueOf(3.547));
		tabela.adicionaNaLinha(7, Tabela.inteiroPelaDireita(23, 5));
		tabela.normalizaTodasLinhas(11+6);
		tabela.adicionaNaLinha(1, "------");

		tabela.imprimir();
	}
}
