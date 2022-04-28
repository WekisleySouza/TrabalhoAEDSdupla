package entities;

public class Ordenacao {
	//Mudar a tipagem dos atributos de tempo depois...
	protected int[] vetorOrdenado;
	private int acessos;
	private int comparacoes;
	private long tempo;

	// Imprime o nome da classe onde esse método é chamado. 
	// Esse método é chamado nas classes InsertionSort, MergeSort, QuickSort
	public void imprimeNomeDaOrdenacao(){
		System.out.println(
			String.format("Performando agora ordenação %s.", this.getClass().getSimpleName())
		);
	}

	// marca a variável tempo com o tempo atual em epoch(nanoseg.)
	public void comecarCronometro(){
		tempo = System.nanoTime();
	}

	// subtrai o tempo atual em epoch(nanoseg.) com a variável tempo
	public void pararCronometro(){
		tempo = System.nanoTime() - this.tempo;
	}

	// Retorna o valor da variável tempo em milissegundos
	public float getTempo(){
		return tempo/(float)1000000;
	}

	// Retorna o vetor ordenado.
	public int[] getOrdenado(){
		return this.vetorOrdenado;
	}

	// Imprime o vetor ordenado	
	public void imprimeOrdenado(int n) {
		System.out.print("Vetor ordenado: ");
		OperacoesVetores.imprimeVetor(this.vetorOrdenado, n);
	}
}
