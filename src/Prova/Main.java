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

		Ordenacao ordena20 = new InsertionSort(vetor, 20);
		System.out.print("Vetor original: ");
		OperacoesVetores.imprimeVetor(vetor, 20);
		ordena20.imprimeOrdenado(20);
		System.out.print("\n");

		TabelaResultado tabela = new TabelaResultado();

		tabela.inserirResultado(
			"Merge", 
			new float[] {merge5k.getTempo(), merge10k.getTempo(), merge30k.getTempo()}, 
			new int[] {88, 100, 120}, // TEM QUE IMPLEMENTAR (acessos)
			new int[] {45, 34, 65}, // TEM QUE IMPLEMENTAR (comparacoes)
			new int[] {66, 566, 343}, // TEM QUE IMPLEMENTAR (trocas)
			""
			);

		tabela.inserirResultado(
			"Insertion", 
			new float[] {insertion5k.getTempo(), insertion10k.getTempo(), insertion30k.getTempo()}, 
			new int[] {88, 100, 120}, // TEM QUE IMPLEMENTAR (acessos)
			new int[] {45, 34, 65}, // TEM QUE IMPLEMENTAR (comparacoes)
			new int[] {66, 566, 343}, // TEM QUE IMPLEMENTAR (trocas)
			String.format("(%s insercoes)", 20) // TEM QUE IMPLEMENTAR (insercoes)
			);

		tabela.inserirResultado(
			"Quick", 
			new float[] {quick5k.getTempo(), quick10k.getTempo(), quick30k.getTempo()}, 
			new int[] {88, 100, 120}, // TEM QUE IMPLEMENTAR (acessos)
			new int[] {45, 34, 65}, // TEM QUE IMPLEMENTAR (comparacoes)
			new int[] {66, 566, 343}, // TEM QUE IMPLEMENTAR (trocas)
			String.format("(%s pivos selecionados)", 30) // TEM QUE IMPLEMENTAR (pivos)
			);

		tabela.imprimir();
		
	}
}
