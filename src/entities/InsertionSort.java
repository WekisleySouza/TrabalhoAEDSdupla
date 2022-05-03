package entities;

public class InsertionSort extends Ordenacao{

	private int insercoes;

	public InsertionSort(int[] vetor, int n) {
		super();
		this.vetorOrdenado = OperacoesVetores.copiaVetor(vetor);
		this.vetorOrdenadoContagens = OperacoesVetores.copiaVetor(vetor);
		ordenaVetorInsertionSort(this.vetorOrdenado, n);
		performaOrdernacaoContando(this.vetorOrdenadoContagens, n);
	}

	public int getInsercoes(){
		return (int) this.insercoes;
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

	// Ordena o vetor usando o InsertionSort enquanto conta comparações, inserções e acessos.
	private void performaOrdernacaoContando(int[] vetor, int n){
		for(int i = 0; i < n - 1; i++) {
			int numAtual = vetor[i + 1];
			int j = i;
			while(j >= 0 && vetor[j] > numAtual) {
				vetor[j + 1] = vetor[j];
				j--;
				this.insercoes++;
				this.comparacoes++;
				this.acessos += 3;
				this.trocas++;
			}
			vetor[j + 1] = numAtual;
			this.acessos += 2;
			this.insercoes++;
			this.trocas++;
		}
	}
}
