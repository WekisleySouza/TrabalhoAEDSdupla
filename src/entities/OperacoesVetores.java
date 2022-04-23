package entities;

public class OperacoesVetores {
	// Cria uma shallow copy de um vetor de inteiros 
	public static int[] copiaVetor(int[] vetorOriginal) {
		int[] copia = new int[vetorOriginal.length];

		for(int i = 0; i < vetorOriginal.length; i++) {
			copia[i] = vetorOriginal[i];
		}
		

		return copia;
	}

	// Imprime um vetor na tela no formato [1, 2, 3]	
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

	// Preenche com valores aleatórios um vetor de inteiros com tamanho n
	public static void preencherAleatoriamente(int[] vetor, int n) {
		for(int i = 0; i < n; i++) {
			vetor[i] = (int) Math.floor(Math.random() * n);
		}
	}
}
