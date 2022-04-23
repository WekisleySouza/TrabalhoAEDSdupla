package Prova;

import entities.*;

public class Main {

	public static void main(String[] args) {
		int[] vetor = new int[20];
		OperacoesVetores.preencherAleatoriamente(vetor, 20);
		OperacoesVetores.imprimeVetor(vetor, 20);
		
		Ordenacao teste = new InsertionSort(vetor, 20);
		Ordenacao teste2 = new QuickSort(vetor, 20);
		Ordenacao teste3 = new MergeSort(vetor, 20);

		teste.imprimeOrdenado();
		System.out.println(teste.getTempo());
		teste2.imprimeOrdenado();
		System.out.println(teste2.getTempo());
		teste3.imprimeOrdenado();
		System.out.println(teste3.getTempo());
		
	}
}
