package entities;

public class MergeSort extends Ordenacao{
	
	public MergeSort(int[] vetor, int n) {
		super(vetor, n);
	}

	//Imprimir nome do algoritmo escolhido...
	static void ordenaVetorMergeSort(int[] vetor, int[] vetorMerge, int inicio, int fim) {
		if(inicio < fim) {
			int meio = (inicio + fim) / 2;
			ordenaVetorMergeSort(vetor, vetorMerge, inicio, meio);
			ordenaVetorMergeSort(vetor, vetorMerge, meio + 1, fim);
			merge(vetor, vetorMerge, inicio, meio, fim);
		}
	}
	
	static void merge(int[] vetor, int[] vetorMerge, int inicio, int meio, int fim) {
		for(int k = inicio; k <= fim; k++) {
			vetorMerge[k] = vetor[k];
		}
		int i = inicio;
		int j = meio + 1;
		
		for(int k = inicio; k <= fim; k++) {
			if(i > meio) {
				vetor[k] = vetorMerge[j++];
			}else if (j > fim){
				vetor[k] = vetorMerge[i++];
			}else if(vetorMerge[i] < vetorMerge[j]) {
				vetor[k] = vetorMerge[i++];
			}else {
				vetor[k] = vetorMerge[j++];
			}
		}
	}
}
