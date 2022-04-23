package Prova;

import entities.InsertionSort;
import entities.OperacoesVetores;
import entities.Ordenacao;

public class Main {

	public static void main(String[] args) {
		int[] vetor = new int[20];
		OperacoesVetores.preencherAleatoriamente(vetor, 10);
		OperacoesVetores.imprimeVetor(vetor, 10);
		
		Ordenacao teste = new InsertionSort(vetor, 10);
		teste.imprimeOrdenado();
		
	}
}
