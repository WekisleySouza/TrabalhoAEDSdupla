package entities;

public class QuickSort extends Ordenacao {

	public QuickSort(int[] vetor, int n) {
		super(vetor, n);
	}

	private int selecoesPivo;
	private int trocasElementos;
	
	public void ordenaVetorQuickSort(int[] vetor, int esquerda, int direita) {
		if(esquerda < direita) {
			int p = particao(vetor, esquerda, direita);
			ordenaVetorQuickSort(vetor, esquerda, p);
			ordenaVetorQuickSort(vetor, p + 1, direita);
		}
	}
		
	public int particao(int[] vetor, int esquerda, int direita) {
		int meio = (int) (esquerda + direita) / 2;
		int pivot = vetor[meio];
		int i = esquerda - 1;
		int j = direita + 1;
		while(true) {
			do {
				i++;
			}while(vetor[i] < pivot);
			do {
				j--;
			}while(vetor[j] > pivot);
			if(i >= j) {
				return j;
			}
			int aux = vetor[i];
			vetor[i] = vetor[j];
			vetor[j] = aux;
		}
	}
}
