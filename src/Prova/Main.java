package Prova;

import entities.*;

public class Main {
	public static void main(String[] args) {
		int[] vetor = new int[30000];
		OperacoesVetores.preencherAleatoriamente(vetor, 30000);
		
		Ordenacao insertion5000 = new InsertionSort(vetor, 5000);
		Ordenacao quick5000 = new QuickSort(vetor, 5000);
		Ordenacao merge5000 = new MergeSort(vetor, 5000);

		Ordenacao insertion10000 = new InsertionSort(vetor, 10000);
		Ordenacao quick10000 = new QuickSort(vetor, 10000);
		Ordenacao merge10000 = new MergeSort(vetor, 10000);

		Ordenacao insertion30000 = new InsertionSort(vetor, 30000);
		Ordenacao quick30000 = new QuickSort(vetor, 30000);
		Ordenacao merge30000 = new MergeSort(vetor, 30000);

		Ordenacao ordena20 = new InsertionSort(vetor, 20);
		System.out.print("Vetor original: ");
		OperacoesVetores.imprimeVetor(vetor, 20);
		ordena20.imprimeOrdenado(20);
		System.out.print("\n");

		TabelaResultado tabela = new TabelaResultado();

		tabela.inserirResultado(
			"Merge", 
			new float[] {merge5000.getTempo(), merge10000.getTempo(), merge30000.getTempo()}, 
			new int[] {88, 100, 120}, // TEM QUE IMPLEMENTAR (acessos)
			new int[] {45, 34, 65}, // TEM QUE IMPLEMENTAR (comparacoes)
			new int[] {66, 566, 343}, // TEM QUE IMPLEMENTAR (trocas)
			""
			);

		tabela.inserirResultado(
			"Insertion", 
			new float[] {insertion5000.getTempo(), insertion10000.getTempo(), insertion30000.getTempo()}, 
			new int[] {88, 100, 120}, // TEM QUE IMPLEMENTAR (acessos)
			new int[] {45, 34, 65}, // TEM QUE IMPLEMENTAR (comparacoes)
			new int[] {66, 566, 343}, // TEM QUE IMPLEMENTAR (trocas)
			String.format("(%s insercoes)", 20) // TEM QUE IMPLEMENTAR (insercoes)
			);

		tabela.inserirResultado(
			"Quick", 
			new float[] {quick5000.getTempo(), quick10000.getTempo(), quick30000.getTempo()}, 
			new int[] {88, 100, 120}, // TEM QUE IMPLEMENTAR (acessos)
			new int[] {45, 34, 65}, // TEM QUE IMPLEMENTAR (comparacoes)
			new int[] {66, 566, 343}, // TEM QUE IMPLEMENTAR (trocas)
			String.format("(%s pivos selecionados)", 30) // TEM QUE IMPLEMENTAR (pivos)
			);

		tabela.imprimir();
		
	}
}
