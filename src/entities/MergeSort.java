package entities;

public class MergeSort extends Ordenacao{
	
	public MergeSort(int[] vetor, int n) {
		this.vetorOrdenado = OperacoesVetores.copiaVetor(vetor);
		ordenaVetorMergeSort(this.vetorOrdenado, n);
	}

	// Performa as operações de ordenação, cálculo do tempo, etc
	private void ordenaVetorMergeSort(int[] vetor, int n){
		int[] vetorMerge = OperacoesVetores.copiaVetor(vetor);
		imprimeNomeDaOrdenacao();
		comecarCronometro();
		performaOrdernacao(vetor, vetorMerge, 0, n-1);
		pararCronometro();
	}

	// Ordena o vetor usando MergeSort
	private void performaOrdernacao(int[] vetor, int[] vetorMerge, int inicio, int fim) {
		if(inicio < fim) {
			int meio = (inicio + fim) / 2;
			performaOrdernacao(vetor, vetorMerge, inicio, meio);
			performaOrdernacao(vetor, vetorMerge, meio + 1, fim);
			merge(vetor, vetorMerge, inicio, meio, fim);
		}
	}
	
	// TODO: Substituir esse comentário com um comentário explicando o que esse método faz
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
