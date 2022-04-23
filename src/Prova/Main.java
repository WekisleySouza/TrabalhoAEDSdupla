package Prova;

import entities.IsertionSort;
import entities.OperacoesVetores;
import entities.Ordenacao;

public class Main {

	public static void main(String[] args) {
		int[] vetor = new int[20];
		OperacoesVetores.preencherAleatoriamente(vetor, 10);
		OperacoesVetores.imprimeVetor(vetor, 10);
		
		Ordenacao teste = new IsertionSort(vetor, 10);
		teste.imprimeOrdenado();
		
	}
}
