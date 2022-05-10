package entities;

public class MergeSort extends Ordenacao{
	
	
	// Construtor.
	public MergeSort(int[] vetor, int n) {
		this.vetorOrdenado = OperacoesVetores.copiaVetor(vetor);
		ordenaVetorMergeSort(this.vetorOrdenado, n);
		this.vetorOrdenadoContagens = OperacoesVetores.copiaVetor(vetor);
		ordenaVetorMergeSortContando(this.vetorOrdenadoContagens, n);
	}

	//Ordena vetor usando MergeSort contando trocas, comparações e acessos.
	private void ordenaVetorMergeSortContando(int[] vetor, int n){
		int[] vetorMerge = OperacoesVetores.copiaVetor(vetor);
		performaOrdenacaoContando(vetor, vetorMerge, 0, n - 1);
	}

	// Performa as operações de ordenação, cálculo do tempo, etc
	private void ordenaVetorMergeSort(int[] vetor, int n){
		int[] vetorMerge = OperacoesVetores.copiaVetor(vetor);
		imprimeNomeDaOrdenacao();
		comecarCronometro();
		performaOrdenacao(vetor, vetorMerge, 0, n-1);
		pararCronometro();
	}

	// Ordena o vetor usando MergeSort
	private void performaOrdenacao(int[] vetor, int[] vetorMerge, int inicio, int fim) {
		if(inicio < fim) {
			int meio = (inicio + fim) / 2;
			performaOrdenacao(vetor, vetorMerge, inicio, meio);
			performaOrdenacao(vetor, vetorMerge, meio + 1, fim);
			merge(vetor, vetorMerge, inicio, meio, fim);
		}
	}
	
	// Método que realiza as trocas dp MergeSort.
	public void merge(int[] vetor, int[] vetorMerge, int inicio, int meio, int fim) {
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
	
	// Ordena o vetor usando MergeSort contando trocas, comparações e acessos.
		private void performaOrdenacaoContando(int[] vetor, int[] vetorMerge, int inicio, int fim) {
			if(inicio < fim) {
				this.comparacoes++;
				int meio = (inicio + fim) / 2;
				performaOrdenacaoContando(vetor, vetorMerge, inicio, meio);
				performaOrdenacaoContando(vetor, vetorMerge, meio + 1, fim);
				mergeContando(vetor, vetorMerge, inicio, meio, fim);
			}
		}
		
		// Método que realiza as trocas dp MergeSort contando trocas, comparações e acessos.
		public void mergeContando(int[] vetor, int[] vetorMerge, int inicio, int meio, int fim) {
			for(int k = inicio; k <= fim; k++) {
				vetorMerge[k] = vetor[k];
				this.acessos += 2;
			}
			int i = inicio;
			int j = meio + 1;
			
			for(int k = inicio; k <= fim; k++) {
				if(i > meio) {
					vetor[k] = vetorMerge[j++];
					this.trocas++;
					this.comparacoes++;
				}else if (j > fim){
					vetor[k] = vetorMerge[i++];
					this.trocas++;
					this.comparacoes += 2;
				}else if(vetorMerge[i] < vetorMerge[j]) {
					vetor[k] = vetorMerge[i++];
					this.trocas++;
					this.acessos += 4;
					this.comparacoes += 3;
				}else {
					vetor[k] = vetorMerge[j++];
					this.trocas++;
					this.comparacoes += 4;
				}
			}
		}
}
