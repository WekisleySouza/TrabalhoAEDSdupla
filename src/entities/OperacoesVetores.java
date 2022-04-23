package entities;

public class OperacoesVetores {
	
	public static void copiaVetor(int[] vin, int[] vout, int n) {
		for(int i = 0; i < n; i++) {
			vout[i] = vin[i]; 
		}
	}
	
	public static void imprimeVetor(int[] vetor, int n) {
		System.out.print("[");
		for(int i = 0; i < n; i++) {
			System.out.print(vetor[i]);
			if(i != n - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
		System.out.println();
	}
	
	public static void preencherAleatoriamente(int[] vetor, int n) {
		for(int i = 0; i < n; i++) {
			vetor[i] = (int) Math.floor(Math.random() * n);
		}
	}
}
