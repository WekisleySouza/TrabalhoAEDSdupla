package entities;
import java.util.Date;

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

	// marca a variável tempo com o tempo atual em epoch
	public void comecarCronometro(){
		tempo = System.currentTimeMillis();
	}

	// subtrai o tempo atual em epoch com a variável tempo
	public void pararCronometro(){
		tempo = System.currentTimeMillis() - this.tempo;
	}

	// Retorna o valor da variável tempo
	public long getTempo(){
		return tempo;
	}

	// Retorna o vetor ordenado.
	public int[] getOrdenado(){
		return this.vetorOrdenado;
	}

	// Imprime o vetor ordenado	
	public void imprimeOrdenado() {
		System.out.print("Vetor ordenado: ");
		OperacoesVetores.imprimeVetor(this.vetorOrdenado, this.vetorOrdenado.length);
	}
}
