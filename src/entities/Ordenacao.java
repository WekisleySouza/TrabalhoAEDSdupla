package entities;

public class Ordenacao {
	//Mudar a tipagem dos atributos de tempo depois...
	protected int[] vetor;
	private int acessos;
	private int comparacoes;
	private int tempo;
	
	
	public Ordenacao(int[] vetor, int n) {
		OperacoesVetores.copiaVetor(vetor, this.vetor, n);
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
