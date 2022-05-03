package Prova;

import entities.*;

public class Main {
	public static void main(String[] args) {
		int[] vetor = new int[30000];
		OperacoesVetores.preencherAleatoriamente(vetor, 30000);
		
		Ordenacao insertion5k = new InsertionSort(vetor, 5000);
		Ordenacao quick5k = new QuickSort(vetor, 5000);
		Ordenacao merge5k = new MergeSort(vetor, 5000);

		Ordenacao insertion10k = new InsertionSort(vetor, 10000);
		Ordenacao quick10k = new QuickSort(vetor, 10000);
		Ordenacao merge10k = new MergeSort(vetor, 10000);

		Ordenacao insertion30k = new InsertionSort(vetor, 30000);
		Ordenacao quick30k = new QuickSort(vetor, 30000);
		Ordenacao merge30k = new MergeSort(vetor, 30000);

		Ordenacao ordena20 = new InsertionSort(vetor, 4);
		System.out.print("Vetor original: ");
		OperacoesVetores.imprimeVetor(vetor, 4);
		merge10k.imprimeOrdenado(10000);
		System.out.print("\n");

		TabelaResultado tabela = new TabelaResultado();

		tabela.inserirResultado(
			"Merge", 
			new float[] {merge5k.getTempo(), merge10k.getTempo(), merge30k.getTempo()}, 
			new int[] {merge5k.getAcessos(), merge10k.getAcessos(), merge30k.getAcessos()}, // Conferir resultados.
			new int[] {merge5k.getComparacoes(), merge10k.getComparacoes(), merge30k.getComparacoes()}, // Conferir resultados.
			new int[] {merge5k.getTrocas(), merge10k.getTrocas(), merge30k.getTrocas()}, // Implementar.
			""
			);

		tabela.inserirResultado(
			"Insertion", 
			new float[] {insertion5k.getTempo(), insertion10k.getTempo(), insertion30k.getTempo()}, 
			new int[] {insertion5k.getAcessos(), insertion10k.getAcessos(), insertion30k.getAcessos()}, // Conferir resultados.
			new int[] {insertion5k.getComparacoes(), insertion10k.getComparacoes(), insertion30k.getComparacoes()}, // Conferir resultados.
			new int[] {insertion5k.getTrocas(), insertion10k.getTrocas(), insertion30k.getTrocas()}, // Conferir resultados.
			String.format("(%s insercoes)", ((InsertionSort) insertion5k).getInsercoes()) // Conferir resultados.
			);

		tabela.inserirResultado(
			"Quick", 
			new float[] {quick5k.getTempo(), quick10k.getTempo(), quick30k.getTempo()}, 
			new int[] {quick5k.getAcessos(), quick10k.getAcessos(), quick30k.getAcessos()}, // Conferir resultados.
			new int[] {quick5k.getComparacoes(), quick10k.getComparacoes(), quick30k.getComparacoes()}, // Conferir resultados.
			new int[] {quick5k.getTrocas(), quick10k.getTrocas(), quick30k.getTrocas()}, // Conferir resultados.
			String.format("(%s pivots selecionados)", ((QuickSort) quick5k).getPivotsSelecionados()) // Conferir resultados.
			);

		tabela.imprimir();
		
	}
}
