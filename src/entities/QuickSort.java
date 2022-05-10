package entities;

public class QuickSort extends Ordenacao {

	private int pivotSelecoes;

	public QuickSort(int[] vetor, int n) {
		this.vetorOrdenado = OperacoesVetores.copiaVetor(vetor);
		ordenaVetorQuickSort(this.vetorOrdenado, n);
		this.vetorOrdenadoContagens = OperacoesVetores.copiaVetor(vetor);
		performaOrdenacaoColetando(this.vetorOrdenadoContagens, 0, n-1);
	}

	public int getPivotsSelecionados(){
		return this.pivotSelecoes;
	}

	// Performa as operações de ordenação, cálculo do tempo, etc
	private void ordenaVetorQuickSort(int[] vetor, int n){
		imprimeNomeDaOrdenacao();
		comecarCronometro();
		performaOrdenacao(vetor, 0, n-1);
		pararCronometro();
	}

	// Ordena o vetor usando QuickSort
	private void performaOrdenacao(int[] vetor, int esquerda, int direita) {
		if(esquerda < direita) {
			int p = particao(vetor, esquerda, direita);
			performaOrdenacao(vetor, esquerda, p);
			performaOrdenacao(vetor, p + 1, direita);
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

	// Faz ordenação usando o QuickSort enquanto coleta comparações, trocas e seleções de pivot.
	private void performaOrdenacaoColetando(int[] vetor, int esquerda, int direita) {
		this.comparacoes++;
		if(esquerda < direita) {
			int p = particaoColetando(vetor, esquerda, direita);
			performaOrdenacaoColetando(vetor, esquerda, p);
			performaOrdenacaoColetando(vetor, p + 1, direita);
		}
	}

	public int particaoColetando(int[] vetor, int esquerda, int direita) {
		int meio = (int) (esquerda + direita) / 2;
		int pivot = vetor[meio];
		this.pivotSelecoes++;
		this.acessos++;
		int i = esquerda - 1;
		int j = direita + 1;
		while(true) {
			do {
				i++;
				this.comparacoes++;
				this.acessos++;
			}while(vetor[i] < pivot);
			do {
				j--;
				this.comparacoes++;
				this.acessos++;
			}while(vetor[j] > pivot);
			if(i >= j) {
				return j;
			}
			this.comparacoes+=2;
			int aux = vetor[i];
			vetor[i] = vetor[j];
			vetor[j] = aux;
			this.trocas++;
			this.acessos += 3;
		}
	}
}
