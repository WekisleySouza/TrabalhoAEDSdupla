package entities;

public class IsertionSort extends Ordenacao{

	public IsertionSort(int[] vetor, int n) {
		super(vetor, n);
	}

	private int insercoes;
		
	//Imprimir nome do algoritmo escolhido...
	static void ordenaVetorInsertionSort(int[] vetor, int n){
		int tamanho = vetor.length;
		for(int i = 0; i < tamanho - 1; i++) {
			int numAtual = vetor[i + 1];
			int j = i;
			while(j >= 0 && vetor[j] > numAtual) {
				vetor[j + 1] = vetor[j];
				j--;
			}
			vetor[j + 1] = numAtual;
		}
	}

}
