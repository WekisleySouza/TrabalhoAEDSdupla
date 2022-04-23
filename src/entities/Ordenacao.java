package entities;

public class Ordenacao {
	//Mudar a tipagem dos atributos de tempo depois...
	protected int[] vetor;
	private int acessos;
	private int comparacoes;
	private int tempo;
	
	
	public Ordenacao(int[] vetor, int n) {
		this.vetor = vetor;
		//OperacoesVetores.copiaVetor(vetor, this.vetor, n);
	}

	public int[] getOrdenado(){
		int[] a = {1, 2, 3};
		return a;
	}
	
	public void imprimeOrdenado() {
		if(vetor != null) {
			System.out.print("Vetor ordenado: ");
			OperacoesVetores.imprimeVetor(this.vetor, this.vetor.length);
		}else {
			System.out.println("Este vetor esta vazio!");
		}
	}
}
