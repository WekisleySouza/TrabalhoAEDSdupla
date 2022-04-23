package entities;

public class InsertionSort extends Ordenacao{

	public InsertionSort(int[] vetor, int n) {
		this.vetorOrdenado = OperacoesVetores.copiaVetor(vetor);
		ordenaVetorInsertionSort(this.vetorOrdenado, n);
	}
		
	// Performa as operações de ordenação, cálculo do tempo, etc
	private void ordenaVetorInsertionSort(int[] vetor, int n){
		imprimeNomeDaOrdenacao();
		comecarCronometro();
		performaOrdernacao(vetor, n);
		pararCronometro();
	}

	// Ordena o vetor usando InsertionSort
	private void performaOrdernacao(int[] vetor, int n){
		for(int i = 0; i < n - 1; i++) {
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
