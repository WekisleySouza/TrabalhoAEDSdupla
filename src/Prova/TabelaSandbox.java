//arquivo de teste, deve ser deletado no envio do trabalho
package Prova;

import entities.*;

public class TabelaSandbox {

	public static void main(String[] args) {
		TabelaResultado tabela = new TabelaResultado();
		float[] tempoTotal = {2.34f, 3.56656f, 4.343424234f};
		int[] acessos = {123, 23, 345};
		int[] comparacoes = {45, 243, 345};
		int[] trocas = {123, 23, 342};
		int[] extras = {212, 234, 122};
		tabela.inserirResultado(
			"Insertion",
			tempoTotal, 
			acessos, 
			comparacoes, 
			trocas, 
			extras,
			"(20 insercoes)"
		);
		tabela.inserirResultado(
			"Merge",
			tempoTotal, 
			acessos, 
			comparacoes, 
			trocas, 
			extras,
			""
		);
		tabela.inserirResultado(
			"Quick",
			tempoTotal, 
			acessos, 
			comparacoes, 
			trocas, 
			extras, "(20 pivots)"
		);
		tabela.imprimir();
	}
}
